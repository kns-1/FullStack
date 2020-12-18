package com.example.springbootdatarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DemoRest {

    @Id
    @GeneratedValue
    private int restId;
    private String restName;
    private String restText;

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestText() {
        return restText;
    }

    public void setRestText(String restText) {
        this.restText = restText;
    }

    @Override
    public String toString() {
        return "DemoRest [restId=" + restId + ", restName=" + restName + ", restText=" + restText + "]";
    }
    
}
