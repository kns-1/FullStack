package com.example.springbootjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemoJpa {

    @Id
    private int jpaId;
    private String jpaName;
    private String jpaText;

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

    public String getJpaText() {
        return jpaText;
    }

    public void setJpaText(String jpaText) {
        this.jpaText = jpaText;
    }

    @Override
    public String toString() {
        return "DemoJpa [jpaId=" + jpaId + ", jpaName=" + jpaName + ", jpaText=" + jpaText + "]";
    }
      
}
