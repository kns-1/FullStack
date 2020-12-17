package com.example.springbootjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemoJpa {

    @Id
    private int jpaId;
    private String jpaName;

    public int getJpaId() {
        return jpaId;
    }

    public void setJpaId(int jpaId) {
        this.jpaId = jpaId;
    }

    public String getJpaName() {
        return jpaName;
    }

    public void setJpaName(String jpaName) {
        this.jpaName = jpaName;
    }

    @Override
    public String toString() {
        return "DemoJpa [jpaId=" + jpaId + ", jpaName=" + jpaName + "]";
    }
        
}
