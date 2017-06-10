package com.chronicle.dto.user;

import java.util.List;

import com.chronicle.rest.dto.ApiResponse;

public class UserResponse implements ApiResponse {

	private List<User> list;
	
	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

}
