package com.bk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testPageController {
    @GetMapping("/tp1")
    public String test(){
        return "index";
    }
}
