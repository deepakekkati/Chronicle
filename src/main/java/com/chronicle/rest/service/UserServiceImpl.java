package com.chronicle.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.chronicle.dto.user.User;
import com.chronicle.rest.dto.ApiResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Qualifier("userService")
public class UserServiceImpl implements UserService{

	@Override
	public ApiResponse findAllUsers() {
		User user = new User("All Users");
		return user;
	}
	
	@Override
	public ApiResponse getUser(){
		User user = new User("single Users");
		return user;
	}

	@Override
	public User findById(long id) {
		User user = new User("single Users with id  "+id);
		return null;
	}

	@Override
	public ApiResponse createUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User currentUser) {
		// TODO Auto-generated method stub
		
	}

}
