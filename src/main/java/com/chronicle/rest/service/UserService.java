package com.chronicle.rest.service;

import com.chronicle.dto.user.User;
import com.chronicle.rest.dto.ApiResponse;

public interface UserService {

	ApiResponse findAllUsers();

	ApiResponse getUser(long id);

	User findById(long id);

	String createUser(User user);

	String updateUser(User currentUser);

}
