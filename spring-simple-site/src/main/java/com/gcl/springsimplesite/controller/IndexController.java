package com.gcl.springsimplesite.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String login() {
        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return principal.getUsername();
    }
}
