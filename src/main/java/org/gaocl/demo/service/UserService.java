package org.gaocl.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.gaocl.demo.Entity.MyUser;
import org.gaocl.demo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public int save(MyUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userDao.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser myUser = userDao.findByName(username);
//        log.info(myUser.toString());
        if(myUser ==null){

            throw new UsernameNotFoundException("用户名不存在");
        }
        return User.builder()
                .username(myUser.getUsername())
                .password(myUser.getPassword())
                .roles("USER", "ADMIN") //roles(Arrays.asList("").toArray(new String[]{}))
                .build();
    }
}
