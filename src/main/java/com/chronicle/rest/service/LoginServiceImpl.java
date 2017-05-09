package com.chronicle.rest.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.chronicle.rest.dto.ApiResponse;
import com.chronicle.rest.dto.login.Login;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Qualifier("loginService")
public class LoginServiceImpl implements LoginService{

	@Override
	public ApiResponse getLoginFromApi(Long id) {
		Login login = new Login(id, "deepak", "1/1/2017");
		return login;
	}

	@Override
	public ApiResponse getLoginFromApi(String id) {
		Login login = new Login(Long.valueOf(id), "Deepak Reddy", "1/1/2017");
		return login;
	}

}
