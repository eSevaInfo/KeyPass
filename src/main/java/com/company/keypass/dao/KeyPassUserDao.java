package com.company.keypass.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import com.company.keypass.model.response.UserResponse;
import com.company.keypass.model.resquest.UserRequest;

@Component
public interface KeyPassUserDao extends MongoRepository<UserRequest, String>{

	// custom query to search to blog post by title or content
    //List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
	
}
