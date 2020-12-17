package com.example.springbootwebapplication.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JspController {

    @RequestMapping("/home")
    // @ResponseBody //displays the jsp page name on the browser
    public String jspHome(@RequestParam("myText") String myTextObj, HttpSession sessionObj) {



        System.out.println("Inside jspHome() " + myTextObj);

        sessionObj.setAttribute("myText", myTextObj); 

       /* Before including @RequestParam("myText"), URL format - localhost:8080/home?myTextObj=welcome+blah+blah!
        After including @RequestParam("myText"), URL format - localhost:8080/home?myText=welcome+blah+blah! */
        
        return "home";
    }

}
