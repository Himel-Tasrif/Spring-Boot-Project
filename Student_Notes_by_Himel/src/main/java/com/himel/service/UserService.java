package com.himel.service;

import com.himel.entity.User;

public interface UserService {

	public User saveUser(User user);

	public boolean existEmailCheck(String email);
	
	//added

}
