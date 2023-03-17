package com.gcl.springsimplesite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gcl.springsimplesite.dao.mapper")
public class SpringSimpleSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSimpleSiteApplication.class, args);
    }

}
