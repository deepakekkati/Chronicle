package com.chronicle.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.chronicle.dto.user.User;
import com.chronicle.dto.user.UserResponse;
import com.chronicle.dto.user.dao.UserDao;
import com.chronicle.rest.dto.ApiResponse;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Qualifier("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	@Setter
	private UserDao userDao;

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		try {
			userDao.save(user);
			System.out.println(userDao.save(user)+"  here in userServiceImpl createUser method");
		}
		catch (Exception e){
			return "Error creating user: " +e.toString();
		}
		return "success" ;
	}

	@Override
	public String updateUser(User currentUser) {

		try {
			userDao.save(currentUser);
			System.out.println(userDao.save(currentUser)+"  here in userServiceImpl createUser method");
		}
		catch (Exception e){
			return "Error creating user: " +e.toString();
		}
		return "success" ;
		
	}

	@Override
	public ApiResponse findAllUsers() {
		//List<User> users = null;
		UserResponse users = new UserResponse();
		try {
			users.setList( userDao.findAll());
			System.out.println("  retriving all users");
		}
		catch (Exception e){
			System.out.println("error occured");
		}
		return users ;
	}

	@Override
	public ApiResponse getUser(long id) {
		UserResponse users = new UserResponse();
		try {
			List<User> user = new ArrayList<User>();
			user.add(userDao.findOne(id));
			users.setList( user );
			System.out.println("  retriving all users");
		}
		catch (Exception e){
			System.out.println("error occured");
		}
		return users ;
	}

	@Override
	public User findById(long id) {
		User user = null;
		try {
			user = userDao.findOne(id);
			System.out.println("  retriving all users");
		}
		catch (Exception e){
			System.out.println("error occured");
		}
		return user ;
	}

}
