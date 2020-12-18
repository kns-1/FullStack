package com.example.springbootjpa.controller;

import java.util.List;
import java.util.Optional;

import com.example.springbootjpa.dao.JpaInterfaceRepo;
import com.example.springbootjpa.model.DemoJpa;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;


//@Controller
@RestController //For REST post request demo
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

    /*
     * @RequestMapping("/getJpa") public ModelAndView getJpaId(@RequestParam int
     * jpaId) {
     * 
     * ModelAndView mvObj = new ModelAndView("showJpa.jsp"); DemoJpa jpaObj =
     * repo.findById(jpaId).orElse(new DemoJpa());
     * 
     * // System.out.println(repo.findByJpaName("abc")); //
     * System.out.println(repo.findByJpaIdGreaterThan(3)); //
     * System.out.println(repo.findByJpaNameSorted("abc"));
     * 
     * 
     * mvObj.addObject("myjpaobj",jpaObj);
     * 
     * return mvObj; }
     */

    /*
     * //get data by a url name provided in @RequestMapping
     * 
     * @RequestMapping("/demojpa") //url by tablename or any desired name
     * 
     * @ResponseBody //tell compiler that I am returning data and not a View(jsp or
     * other scripts) names public String getJpaData() {
     * 
     * //URL Format: http://localhost:8080/demojpa
     * 
     * return repo.findAll().toString(); //converting Iterable value to string }
     * 
     * //get data by a url name and a data-value provided in @RequestMapping
     * 
     * @RequestMapping("/demojpa/{jpaId}") //url by tablename or any desired name
     * 
     * @ResponseBody //tell compiler that I am returning data and not a View(jsp or
     * other scripts) names public String getJpaDataId(@PathVariable("jpaId") int
     * jpaId) {
     * 
     * //URL Format: http://localhost:8080/demojpa/2
     * 
     * return repo.findById(jpaId).toString(); //converting Iterable value to string
     * }
     * 
     */

    // JpaRepository demo: get data on broser in JSON format/any other String
    // formats

   /* @RequestMapping("/demojpa") // url by tablename or any desired name
    @ResponseBody // tell compiler that I am returning data and not a View(jsp or other scripts)
                  // names
    public List<DemoJpa> getJpaData() {

        // URL Format: http://localhost:8080/demojpa

        return repo.findAll();
    }

    // get data by a url name and a data-value provided in @RequestMapping
    @RequestMapping("/demojpa/{jpaId}") // url by tablename or any desired name
    @ResponseBody // tell compiler that I am returning data and not a View(jsp or other scripts)
                  // names
    public Optional<DemoJpa> getJpaDataId(@PathVariable("jpaId") int jpaId) {
        //here, if there is no data, the method will return OPTIONAL data

        //URL Format: http://localhost:8080/demojpa/2
        //Download "Postman", which is an API Client used to submit, add, update or delete data through API (URL)
        
        return repo.findById(jpaId); //converting Iterable value to string
    }
*/

 /*   //Content Negotiation Demo - get/post data in desired format (xml,json etc.)
    @RequestMapping(path = "/demojpa", produces = {"application/xml"}) // url by tablename or any desired name that produces data in ONLY XML format
    @ResponseBody // tell compiler that I am returning data and not a View(jsp or other scripts)
                  // names
    public List<DemoJpa> getJpaData() {

        // URL Format: http://localhost:8080/demojpa

        return repo.findAll();
    }

    // get data by a url name and a data-value provided in @RequestMapping
    @RequestMapping(path = "/demojpa/{jpaId}", produces = {"application/xml"}) // url by tablename or any desired name that produces data in ONLY XML format
    @ResponseBody // tell compiler that I am returning data and not a View(jsp or other scripts)
                  // names
    public Optional<DemoJpa> getJpaDataId(@PathVariable("jpaId") int jpaId) {
        //here, if there is no data, the method will return OPTIONAL data

        //URL Format: http://localhost:8080/demojpa/2
        //Download "Postman", which is an API Client used to submit, add, update or delete data through API (URL)
        
        return repo.findById(jpaId); //converting Iterable value to string
    }

    */



    //REST post data demo - post data to database from API
    
    @PostMapping(path = "/addJpaData", consumes = {"application/json"}) //consumes/accepts only JSON values to post to the database
    public DemoJpa addJpaData(@RequestBody DemoJpa demoJpaObj) { //@RequestBody is used to Post data in RAW format
        repo.save(demoJpaObj);
        return demoJpaObj;
    }
  
  
    @GetMapping(path = "/demojpa") // url by tablename or any desired name that produces data in ONLY XML format
    public List<DemoJpa> getJpaData() {

        // URL Format: http://localhost:8080/demojpa

        return repo.findAll();
    }

    
    // get data by a url name and a data-value provided in @RequestMapping
    @RequestMapping(path = "/demojpa/{jpaId}") // url by tablename or any desired name that produces data in ONLY XML format
    @ResponseBody // tell compiler that I am returning data and not a View(jsp or other scripts)
                  // names
    public Optional<DemoJpa> getJpaDataId(@PathVariable("jpaId") int jpaId) {
        //here, if there is no data, the method will return OPTIONAL data

        //URL Format: http://localhost:8080/demojpa/2
        //Download "Postman", which is an API Client used to submit, add, update or delete data through API (URL)
        
        return repo.findById(jpaId); //converting Iterable value to string
    }

}
