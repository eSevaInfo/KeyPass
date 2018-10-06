package com.company.keypass.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.keypass.dao.KeyPassDao;
import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.resquest.KeyPassRequest;

/**
 * @author Navnath Waikar
 *
 */


@Repository
public class KeyPassServiceImpl implements KeyPassService {

	@Autowired
	KeyPassDao dao;
	
	@Override
	public KeyPassResponse getData(KeyPassRequest request) {

		KeyPassResponse response = new KeyPassResponse();
		
		response = dao.getData(request);
		
		response.setResponseCode(100);
		response.setResponseStatus("OK");
		response.setResponseMessage("Data Found");
		return response;
	}

}
