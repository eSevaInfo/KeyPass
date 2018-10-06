package com.company.keypass.service;

import org.springframework.stereotype.Service;

import com.company.keypass.model.response.KeyPassResponse;
import com.company.keypass.model.resquest.KeyPassRequest;

@Service
public interface KeyPassService {

	public KeyPassResponse getData(KeyPassRequest request);
}
