package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Education;
import com.example.demo.service.IServiceEducation;

@RestController
public class Controller {

	@Autowired
	private IServiceEducation service;
	
	@GetMapping("/add")
	public ResponseEntity<?> add(@RequestBody Education education){
		
		int id = service.addEdu(education);
		
		return new ResponseEntity<String>("Added: " + id,HttpStatus.OK);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		
		List<Education> list = service.getAll();
		
		return new ResponseEntity<List<Education>>(list,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id){
		
		service.deleteById(id);
		
		return new ResponseEntity<String>("record is deleted",HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> getById(@PathVariable Integer id){
		
		
		
		return new ResponseEntity<String>("Get By Id "+ service.getById(id), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updated(@RequestBody Education education){
		
		service.updateBy(education);
		
		return new ResponseEntity<String>("updated sucessfully",HttpStatus.OK);
	}
	}
