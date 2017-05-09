package com.chronicle.controller;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import com.chronicle.rest.dro.error.ExexError;
import com.chronicle.rest.dro.error.StatusResponse;
import com.chronicle.rest.dto.ApiResponse;
import com.chronicle.rest.service.LoginService;
import com.chronicle.rest.service.UserService;
import com.chronicle.dto.user.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
public class ApiController extends MainController {

    @Autowired
    @Setter
    private LoginService loginService;
    
    @Autowired
    @Setter
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/login", 
    		method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse getHomePageHeadlines() {
    	logger.info("/login : {}");
        return loginService.getLoginFromApi("1");
    }

    @RequestMapping(
            value = {"/login/{id}/{pswd}"},
            method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse getPressRelease(@PathVariable Long id) {
    	logger.info("login with id : {}"+id);    	
    	return loginService.getLoginFromApi(id);
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ApiResponse listAllUsers() {
    	logger.info("list all Users : {}");
        return userService.findAllUsers();
    }
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ApiResponse getUser(@PathVariable("id") long id) {
        logger.info("Fetching User with id {}", id);
    	return userService.getUser();
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ApiResponse createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
        logger.info("Creating User : {}", user);
    	return userService.createUser();
    }
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ApiResponse updateUser(@PathVariable("id") long id, @RequestBody User user) {
        //logger.info("Updating User with id {}", id);
        User currentUser = userService.findById(id);
        if (currentUser == null) {
            logger.error("Unable to update. User with id {} not found.", id);
            ExexError error = new ExexError("Unable to upate. User with id " + id + " not found.");
            return error;
        }
 
        currentUser.setName(user.getName());
 
        userService.updateUser(currentUser);
        return new StatusResponse(HttpStatus.OK);
    }
 
}