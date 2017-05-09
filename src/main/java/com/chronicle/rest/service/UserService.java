package com.chronicle.rest.service;

import java.util.List;

import com.chronicle.dto.user.User;
import com.chronicle.rest.dto.ApiResponse;

public interface UserService {

	ApiResponse findAllUsers();

	ApiResponse getUser();

	User findById(long id);

	ApiResponse createUser();

	void updateUser(User currentUser);

}
