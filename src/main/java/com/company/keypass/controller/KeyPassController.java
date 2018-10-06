package com.company.keypass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.resquest.KeyPassRequest;
import com.company.keypass.service.KeyPassService;

@RestController
@RequestMapping("/queries")
public class KeyPassController {
	
	@Autowired
	KeyPassService service;

	
	@PostMapping(value="/getdata")
	public KeyPassResponse authenticateUser(KeyPassRequest request){
		
		return service.getData(request);
		
	}
	
}
