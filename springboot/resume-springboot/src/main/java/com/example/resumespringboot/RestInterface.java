package com.example.resumespringboot;

import com.example.resumespringboot.model.ResumeModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "restdata", path="restdata")
public interface RestInterface extends JpaRepository<ResumeModel, Integer>
{
    
}
