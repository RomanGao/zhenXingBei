package org.gaocl.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity security) throws Exception {
        //给请求加所有权限
        //form login 配置登录页的
        //logout
        return security
                .authorizeHttpRequests()
                .anyRequest()
                .authenticated() //跳转登录页面 permitAll() 放开请求，不用进去登录页
                .and()
                .formLogin()//postmapping
                .successHandler(new SucessLogin())//这个与defaultSuccessUrl是冲突的
                .failureHandler(new FailLogin())
                .loginPage("/login") //这个必须要写getmapping
                .defaultSuccessUrl("/index") //这个就相当于实现了 //redirect
                .permitAll()
                .and()
                .logout()//这个post要自己写
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .and()
                .csrf()
                .disable()
                .build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return  (web)-> web.ignoring()
                .requestMatchers("/register")
                .requestMatchers("/css/**")//通配符
                .requestMatchers("/js/**"); //将静态资源文件
    }
}
