package com.example.demospringbootyt;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//import org.springframework.context.annotation.Scope;

@Component /* make a spring bean(Spring bean is the object of the Spring container and is created ONLY ONCE by default when getBean() is encountered)
This creation of only ONE instance/object comes under SINGLETON design pattern concept of spring
*/

//@Scope(value="prototype") /*Instance is NOT created by default. Used to create multiple Spring Beans (opposite to @Component) */

public class MyFirstClass {
    private int myId;
    private String myName;
    private String myHobby;

    @Autowired //searches for the object BY TYPE(classname) in the spring container and connects the AutowireDemo object with MyFirstClass object
   // @Qualifier("awname1") //searches for the object BY NAME(objectname) in the spring container and connects the AutowireDemo object with MyFirstClass object
    private AutowireDemo awObj1; //Now, MyFirstClass is dependent on AutowireDemo class

    public MyFirstClass() {
        super();
        System.out.println("Inside Constructor of MyFirstClass\nObject/Spring Bean created!");
    }

    public int getMyId() {
        return myId;
    }

    public void setMyId(int myId) {
        this.myId = myId;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getMyHobby() {
        return myHobby;
    }

    public void setMyHobby(String myHobby) {
        this.myHobby = myHobby;
    }

    public AutowireDemo getAwObj1() {
        return awObj1;
    }

    public void setAwObj1(AutowireDemo awObj1) {
        this.awObj1 = awObj1;
    }

    
    public void show() {
        System.out.println("Inside show() of MyFirstClass");
        awObj1.awCompile();
    } 
}
