package com.company.keypass.dao;

import org.springframework.stereotype.Component;

import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.resquest.KeyPassRequest;

@Component
public interface KeyPassDao {

	public KeyPassResponse getData(KeyPassRequest request);
	
}
