package com.chronicle.dto.user.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chronicle.dto.user.User;

@Transactional
@Service
@Qualifier("userDao")
public abstract class UserDaoImpl {

	

	public <S extends User> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterable<User> findAll(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(User entity) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Iterable<? extends User> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	}
