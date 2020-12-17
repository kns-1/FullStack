package com.example.springbootmodelview;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {

    @RequestMapping("home")
    // @ResponseBody //displays the jsp page name on the browser
    public ModelAndView jspHome(@RequestParam("myText") String myTextObj) {

        ModelAndView mvObj = new ModelAndView();

        System.out.println("Inside jspHome()");

        mvObj.addObject("myText", myTextObj);
        mvObj.setViewName("home");

       /* Before including @RequestParam("myText"), URL format - localhost:8080/home?myTextObj=welcome+blah+blah!
        After including @RequestParam("myText"), URL format - localhost:8080/home?myText=welcome+blah+blah! */        return mvObj;
    }

}

