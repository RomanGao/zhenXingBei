package com.gcl.springsimplesite.controller;

import com.gcl.springsimplesite.dao.entity.User;
import com.gcl.springsimplesite.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    @PostMapping("/register")
    public String register(User user) {
        log.info("register:" + user.getPassword() + "," + user.getUsername());
        userService.register(user);
        return "redirect:/login";
    }
}
