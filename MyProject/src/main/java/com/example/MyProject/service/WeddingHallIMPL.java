package com.example.MyProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.MyProject.repository.WeddingHallRepository;
import com.example.MyProject.dto.Weddinghalldto;
import com.example.MyProject.entity.WeddingHallentity;
@Service
public class WeddingHallIMPL implements WeddingHallservice {
	
	@Autowired
	private WeddingHallRepository WeddingHallRepository;
	
	public String addWeddingHallentity(  Weddinghalldto Weddinghalldto) {
	WeddingHallentity WeddingHallentity = new WeddingHallentity(
			Weddinghalldto.getId(), 
			Weddinghalldto.getName(), 
			Weddinghalldto.getEmail(),
			Weddinghalldto.getPhone(),
			Weddinghalldto.getHallname(), 
			Weddinghalldto.getDate(), 
			Weddinghalldto.getAddress()
			
			
			);
	WeddingHallRepository.save(WeddingHallentity);
	return  WeddingHallentity .getName();
			
			
			
	}

}
