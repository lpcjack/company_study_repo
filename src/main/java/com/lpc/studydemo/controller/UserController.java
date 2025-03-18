package com.lpc.studydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘鹏程
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/test")
    public String test(Model model) {

        model.addAttribute("name", "lpc");
        model.addAttribute("height", "180");

        return "email";
    }
}
