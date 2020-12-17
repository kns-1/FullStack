package com.example.springbootjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JpaController {

    @RequestMapping("/")
    public String jspHome() {
        return "home.jsp";
    }
    
}
