package com.company.keypass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.resquest.KeyPassRequest;
import com.company.keypass.service.KeyPassService;

/**
 * @author Navnath Waikar
 *
 */


@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	KeyPassService service;
	
	@PostMapping(value="/authenticate")
	public KeyPassResponse authenticateUser(KeyPassRequest request){
		
		return service.getData(request);
		
	}
	
	/*@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public KeyPassResponse authenticateUser(@RequestBody KeyPassRequest request){
		
		return service.getData(request);
		
	}
	
	@RequestMapping(value="/authenticate", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
	public KeyPassResponse authenticateUser(@ModelAttribute KeyPassRequest request){
		
		return service.getData(request);
		
	}*/

}
