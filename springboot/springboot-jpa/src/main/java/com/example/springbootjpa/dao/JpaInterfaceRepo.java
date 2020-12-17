package com.example.springbootjpa.dao;

import com.example.springbootjpa.model.DemoJpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaInterfaceRepo extends CrudRepository<DemoJpa, Integer>
{
   
}
