package com.example.demospringbootyt;

import org.springframework.stereotype.Component;


@Component //search BY TYPE

//@Component("awname1") //search BY NAME
public class AutowireDemo {
    private int awId;
    private String awName;

    
	public int getAwId() {
		return awId;
	}
	public void setAwId(int awId) {
		this.awId = awId;
	}
	public String getAwName() {
		return awName;
	}
	public void setAwName(String awName) {
		this.awName = awName;
	}
	@Override
	public String toString() {
		return "AutowireDemo [awId=" + awId + ", awName=" + awName + "]";
	}

    public void awCompile() {
        System.out.println("Inside AutowireDemo class, awCompile()");
    }
  

}