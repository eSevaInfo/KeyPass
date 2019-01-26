package com.company.keypass.service;

import org.springframework.stereotype.Service;

import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.response.UserResponse;
import com.company.keypass.model.resquest.KeyPassRequest;
import com.company.keypass.model.resquest.UserRequest;

@Service
public interface KeyPassUserService {

	public UserResponse getUserByUserId(String userid);
}
