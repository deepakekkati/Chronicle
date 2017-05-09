package com.chronicle.rest.dro.error;

import com.chronicle.rest.dto.ApiResponse;

import lombok.Getter;

public class ExexError implements ApiResponse {
	
    @Getter
	String errorMsg;
	
	public ExexError(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	
}
