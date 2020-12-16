package com.example.demowebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @RequestMapping("home")
    // @ResponseBody //prints the page name
    public String home() {
        System.out.println("Inside home() function");
        return "home.jsp"; /*return the home.jsp page to the controller/webpage which is of "String" type.
        The path where the file exists is automatically search by springboot (Auto-Configuration property) */
    }

}
