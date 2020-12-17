package com.example.springbootwebapplication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {

    @RequestMapping("/home")
    // @ResponseBody //displays the jsp page name on the browser
    public String jspHome(HttpServletRequest requestObj) {

        HttpSession sessionObj = requestObj.getSession();

        String myTextObj = requestObj.getParameter("myText"); /* the text entered in the URL will be displayed.
        URL format - localhost:8080/home?myText=welcome+blah+blah!  */

        System.out.println("Inside jspHome() " + myTextObj);

        sessionObj.setAttribute("myText", myTextObj);

        return "home";
    }

}
