package com.example.springbootdatarest;

import com.example.springbootdatarest.model.DemoRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restdata", path = "restdata")
public interface RestRepo extends JpaRepository<DemoRest, Integer>
{
    
}
