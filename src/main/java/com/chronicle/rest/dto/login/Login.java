package com.chronicle.rest.dto.login;

import com.chronicle.rest.dto.ApiResponse;

import lombok.Getter;

public class Login implements ApiResponse {
	
	    @Getter
	    private Long id;

	    @Getter
	    private String name;

	    @Getter
	    private String lastLogin;

	    @Getter
	    private String role;

	    public Login(Long id, String name ,String lastLogin) {
	        this.id = id;
	        this.name = name;
	        this.lastLogin = lastLogin;
	    }

	    public Login(Long id, String name, String lastLogin, String role) {
			super();
			this.id = id;
			this.name = name;
			this.lastLogin = lastLogin;
			this.role = role;
		}

		@Override
		public String toString() {
			return "Login [id=" + id + 
					", name=" + name + 
					", lastLogin=" + lastLogin + 
					", role=" + role + 
					"]";
		}

	}