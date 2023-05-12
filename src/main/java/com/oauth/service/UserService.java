package com.oauth.service;

import org.springframework.stereotype.Service;

import com.oauth.model.User;
import com.oauth.repository.UserRepodsitory;

@Service
public class UserService 
{

	UserRepodsitory repository;

	public UserService(UserRepodsitory repository) {
		super();
		this.repository = repository;
	}	

	public User saveUser(User user)
	{
		return repository.save(user);
	}
	





}
