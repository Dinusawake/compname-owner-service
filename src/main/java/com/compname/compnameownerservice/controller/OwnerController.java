package com.compname.compnameownerservice.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compname.compnameownerservice.dao.OwnerDao;
import com.compname.compnameownerservice.entity.OwnerEntity;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/ownercontroller")
public class OwnerController {

	@GetMapping("/ping")
	public String Greeting()
	{
		return "pong";
	}
	
	@Autowired
	OwnerDao ownerRepository;
	
	//.................................................................
	@GetMapping("/showowners")
	public List<OwnerEntity> getOwner() 
	{
		return (List<OwnerEntity>) ownerRepository.findAll();
	}

	//.................................................................
	@PostMapping("/saveowner")
	public String insertOwner(@RequestBody OwnerEntity Owners) {
		ownerRepository.save(Owners);
		return "One Owner saved successfully!";

	}
	//.................................................................
	
	@PostMapping("/saveowners")
	public String insertOwner(@RequestBody List<OwnerEntity> Owners) {
		ownerRepository.saveAll(Owners);
		return "Owner's saved successfully!";

	}
	
	//.................................................................
	
	@PutMapping("/updateowner")
	public OwnerEntity updateOwner(@RequestBody OwnerEntity Owners) {
		return ownerRepository.save(Owners); 
	}
	
		//.................................................................
	
	
	@PutMapping("/updateowners")
	public List<OwnerEntity> updateOwners(@RequestBody List<OwnerEntity> Owners) {
		return ownerRepository.saveAll(Owners); 
	}
	
	//.................................................................
	
	@DeleteMapping("/deleteowner")
	public String delete (@RequestBody OwnerEntity Owners) {
		ownerRepository.deleteById(Owners.getId());
		return "Record deleted successfully !" ;
	}
	
}
