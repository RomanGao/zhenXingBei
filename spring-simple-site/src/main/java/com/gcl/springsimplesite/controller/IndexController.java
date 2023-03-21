package com.gcl.springsimplesite.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String login() {
        return "index";
    }

    @PostMapping("/menuList")
    @ResponseBody
    public List<String> menuList() {
        return Arrays.asList("a.html", "b.html", "c.html");
    }

    //User principal = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
}
