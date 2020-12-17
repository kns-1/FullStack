package com.example.springbootjpa.controller;

import com.example.springbootjpa.dao.JpaInterfaceRepo;
import com.example.springbootjpa.model.DemoJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
