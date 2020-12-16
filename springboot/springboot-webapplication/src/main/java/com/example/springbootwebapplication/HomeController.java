package com.example.springbootwebapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("home")
    //@ResponseBody //prints the filename on the browser
    public String home() {
        System.out.println("Inside home() function");
        //return "home.jsp"; //the auto-configuration feature of springboot maps the address of the file
        return "home";
    }
    
}
