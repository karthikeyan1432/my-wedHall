package com.example.MyProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyProject.dto.Weddinghalldto;
import com.example.MyProject.service.WeddingHallservice;




@RestController
@CrossOrigin
@RequestMapping("api/v1/WeddingHallentity")
public class WeddingHallController {
	
	@Autowired 
	private WeddingHallservice WeddingHallservice;
	
	@PostMapping(path = "/save")
	
	
	public String saveWeddingHallentity( @RequestBody  Weddinghalldto Weddinghalldto) {
		
		String id = WeddingHallservice.addWeddingHallentity(  Weddinghalldto);
		return id;
	}
	
}


