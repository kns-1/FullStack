package com.example.springbootjpa.controller;

import com.example.springbootjpa.dao.JpaInterfaceRepo;
import com.example.springbootjpa.model.DemoJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JpaController {

    @Autowired
    JpaInterfaceRepo repo;

    @RequestMapping("/")
    public String jspHome() {
        return "home.jsp";
    }
    
    @RequestMapping("/addJpa")
    public String addJpaHome(DemoJpa demoJpaObj) {
        repo.save(demoJpaObj);
        return "home.jsp";
    }

    @RequestMapping("/getJpa")
    public ModelAndView getJpaId(@RequestParam int jpaId) {
        
        ModelAndView mvObj = new ModelAndView("showJpa.jsp");
        DemoJpa jpaObj = repo.findById(jpaId).orElse(new DemoJpa());
        
        System.out.println(repo.findByJpaName("abc"));
        System.out.println(repo.findByJpaIdGreaterThan(3));
        System.out.println(repo.findByJpaNameSorted("abc"));

        mvObj.addObject("myjpaobj",jpaObj);

        return mvObj;
    }
}
