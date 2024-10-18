package com.example.MyProject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.MyProject.entity.WeddingHallentity;



@EnableJpaRepositories
@Repository
public interface WeddingHallRepository  extends JpaRepository <WeddingHallentity,Integer>  {
	
}
