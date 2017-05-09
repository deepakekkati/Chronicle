package com.chronicle.dto.user;

import com.chronicle.rest.dto.ApiResponse;

import lombok.Getter;
import lombok.Setter;

public class User implements ApiResponse{

	public User(String name) {
		this.name = name;
	}

	public User() {
		super();
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
