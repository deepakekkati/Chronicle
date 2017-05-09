package com.chronicle.rest.dro.error;

import org.springframework.http.HttpStatus;

import com.chronicle.rest.dto.ApiResponse;

public class StatusResponse implements ApiResponse {
	HttpStatus status;

	public StatusResponse(HttpStatus status) {
		this.status = status;
	}
}
