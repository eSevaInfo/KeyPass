package com.company.keypass.dao;

import org.springframework.stereotype.Repository;

import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.resquest.KeyPassRequest;

/**
 * @author Navnath Waikar
 *
 */


@Repository
public class KeyPassDaoImpl implements KeyPassDao {

	@Override
	public KeyPassResponse getData(KeyPassRequest request) {

		KeyPassResponse response = new KeyPassResponse();
		
		response.setData("Hello World");
		
		
		return response;
	}

}
