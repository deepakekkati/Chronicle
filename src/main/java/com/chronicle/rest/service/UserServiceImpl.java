package com.chronicle.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Setter
	private UserDao userDao;

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		try {
			userDao.save(user);
			logger.info(userDao.save(user)+"  here in userServiceImpl createUser method");
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
			logger.info(userDao.save(currentUser)+"  here in userServiceImpl createUser method");
		}
		catch (Exception e){
			return "Error creating user: " +e.toString();
		}
		return "success" ;
		
	}

	@Override
	public ApiResponse findAllUsers() {
		UserResponse users = new UserResponse();
		try {
			users.setList( userDao.findAll());
			logger.info("  retriving all users");
		}
		catch (Exception e){
			logger.info("error occured "+e);
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
			logger.info("  retriving all users");
		}
		catch (Exception e){
			logger.info("error occured "+e);
		}
		return users ;
	}

	@Override
	public User findById(long id) {
		User user = null;
		try {
			user = userDao.findOne(id);
			logger.info("  retriving all users");
		}
		catch (Exception e){
			logger.info("error occured "+e);
		}
		return user ;
	}

}
