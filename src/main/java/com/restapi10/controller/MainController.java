package com.restapi10.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi10.entity.ElectricSubDivisionOffice;
import com.restapi10.service.Service;


@RestController
@RequestMapping("/admin")
public class MainController {
@Autowired
	private Service service;
@PostMapping("/post")
public ResponseEntity<String>resisterInformation(@RequestBody ElectricSubDivisionOffice electricSubDivisionOffice){
	Integer i = service.resisterInformation(electricSubDivisionOffice);
	if (i==1) {
		return new ResponseEntity<String>("save success",HttpStatus.CREATED);
		
	}else {
		return new ResponseEntity<String>("not save",HttpStatus.BAD_REQUEST);
	}
}
@PutMapping("/put/{id}")
public ResponseEntity<String>updateInformation
(@RequestBody ElectricSubDivisionOffice electricSubDivisionOffice,@PathVariable int id){
	try {
		service.updateInformaiton(electricSubDivisionOffice, id);
		return new ResponseEntity<String>("save sucess",HttpStatus.CREATED);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("not update",HttpStatus.BAD_REQUEST);
	}	
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<String>deleteById(@PathVariable int id){
	try {
		service.deleteById(id);
	return new  ResponseEntity<String>("Delete Success",HttpStatus.CREATED);
	} catch (Exception e) {
		e.printStackTrace();
		return new ResponseEntity<String>("Not Deleted",HttpStatus.BAD_REQUEST);
	}
	}
	
@GetMapping("/getalldata")
public ResponseEntity<List<ElectricSubDivisionOffice>>getAllInfo(){
	List<ElectricSubDivisionOffice> getall = service.getall();
	if (getall.size()<=0) {
		 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			
		}else {
			return ResponseEntity.status(HttpStatus.CREATED).body(getall);
		}
}
@GetMapping("/get/{id}")
public ResponseEntity<ElectricSubDivisionOffice>getById(@PathVariable int id){
	ElectricSubDivisionOffice byId = service.getById(id);
	return new ResponseEntity<ElectricSubDivisionOffice>(byId,HttpStatus.OK);
}
}


