package com.company.keypass.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.keypass.model.resquest.KeyPassRequest;

/**
 * @author Navnath Waikar
 *
 */


@RestController
@RequestMapping("/login")
public class LoginController {

	
	@GetMapping(value="/authenticate")
	public String authenticateUser(KeyPassRequest request){
		
		return "Welcome...";
		
	}
	
}
