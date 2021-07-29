package com.mazlumabul.thymeleaf.controller;

import com.mazlumabul.thymeleaf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService =userService;
    }

    @RequestMapping("/index")
    public String home(Model model){
        model.addAttribute("users",userService.findAll());
        return "index";
    }
}
