package com.company.keypass.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.keypass.dao.KeyPassUserDao;
import com.company.keypass.model.response.UserResponse;
import com.company.keypass.model.resquest.UserRequest;
import com.company.keypass.service.KeyPassUserService;

/**
 * @author Navnath Waikar
 *
 */


@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	KeyPassUserService userService;

	
	@GetMapping("/{userid}")
	public UserResponse getUser(@RequestParam String userid){
		
		return userService.getUserByUserId(userid);
		
	}
	
}
