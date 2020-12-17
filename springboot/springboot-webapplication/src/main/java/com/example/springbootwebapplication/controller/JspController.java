package com.example.springbootwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

   @RequestMapping("/home")
   public String jspHome() {
        System.out.println("Inside jspHome()");
        return "home";
    }
    
}
