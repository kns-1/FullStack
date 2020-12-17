package com.example.springbootmodelview;



import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {

    @RequestMapping("home")
    // @ResponseBody //displays the jsp page name on the browser
   
   //Model Object code:
    public ModelAndView jspHome(ModelObjectClass mocObj) {
        ModelAndView mvObj = new ModelAndView();

        System.out.println("Inside jspHome()");

        mvObj.addObject("modelObj", mocObj);
        mvObj.setViewName("home");

        //URL Format: http://localhost:8080/home?moId=10&moName=blah&moText=welcome+!
        
        return mvObj;
    }
 
 
 
 
 
    /*  //Simple ModelAndView code-1:

  public ModelAndView jspHome(@RequestParam("myText") String myTextObj) {

        ModelAndView mvObj = new ModelAndView();

        System.out.println("Inside jspHome()");

        mvObj.addObject("myText", myTextObj);
        mvObj.setViewName("home");

   // Before including @RequestParam("myText"), URL format - localhost:8080/home?myTextObj=welcome+blah+blah!
   // After including @RequestParam("myText"), URL format - localhost:8080/home?myText=welcome+blah+blah! 
        
        return mvObj;
    }

    */




}

