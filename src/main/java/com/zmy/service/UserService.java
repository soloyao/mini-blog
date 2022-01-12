package com.zmy.service;

import com.zmy.pojo.User;

public interface UserService {
	
	User checkUser(String username, String password);
	
}
