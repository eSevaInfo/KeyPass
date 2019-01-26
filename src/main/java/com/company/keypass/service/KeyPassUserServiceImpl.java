package com.company.keypass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.keypass.dao.KeyPassUserDao;
import com.company.keypass.model.response.UserResponse;
import com.company.keypass.model.resquest.UserRequest;

/**
 * @author Navnath Waikar
 *
 */


@Repository
public class KeyPassUserServiceImpl implements KeyPassUserService {

	@Autowired
	KeyPassUserDao dao;

	@Override
	public UserResponse getUserByUserId(String userid) {

		UserRequest data =  dao.findOne(userid);

		
		UserResponse response = new UserResponse();
		response.setResponseStatus("OK");
		response.setResponseMessage("Fetch data");
		return response; 
	}
	
	
}
