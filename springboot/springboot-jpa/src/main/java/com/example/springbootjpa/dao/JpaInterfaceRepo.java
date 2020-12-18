package com.example.springbootjpa.dao;

//import java.util.List;

import com.example.springbootjpa.model.DemoJpa;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface JpaInterfaceRepo extends CrudRepository<DemoJpa, Integer>
{
    /* declaring my own function to search details by name or id.
    These functions have naming-conventions */
   /*List<DemoJpa> findByJpaName(String jpaName); 
   List<DemoJpa> findByJpaIdGreaterThan(int jpaId);
  
   @Query("from DemoJpa where jpaName=?1 order by jpaText") //JPQL queries
   List<DemoJpa> findByJpaNameSorted(String jpaName);
    */
}
