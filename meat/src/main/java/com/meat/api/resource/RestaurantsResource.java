package com.meat.api.resource;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.meat.api.model.Restaurants;
import com.meat.api.repository.RestaurantsRepository;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 4200)
@RestController
@RequestMapping("/restaurants")
public class RestaurantsResource {
	
	@Autowired
	RestaurantsRepository repository;
	
	@GetMapping
	public List<Restaurants> list(){
		
		return	repository.findAll();
	} 
	
}
