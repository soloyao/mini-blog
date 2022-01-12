package com.zmy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zmy.pojo.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsernameAndPassword(String username, String password);
	
}
