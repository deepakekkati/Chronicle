package com.chronicle.rest.service;
import com.chronicle.rest.dto.ApiResponse;

public interface LoginService {
    ApiResponse getLoginFromApi(Long id);
    ApiResponse getLoginFromApi(String id);
}
