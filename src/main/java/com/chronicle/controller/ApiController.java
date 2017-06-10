package com.chronicle.controller;

import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.chronicle.rest.dto.ApiResponse;
import com.chronicle.rest.service.UserService;
import com.chronicle.dto.user.*;

@Controller
public class ApiController extends MainController {

    @Autowired
    @Setter
    private UserService userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(
            value = {"/login/{id}/{password}"},
            method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String login(@PathVariable Long id, @PathVariable String password) {
    	logger.info("login with id : {}"+id);   
    	User user = userService.findById(id);
    	// password check
    	if(user.getPassword().equals( password ) ){
    		return user.getRole();
    	} else {
    		return "User Doesn't exist";
    	}
    }
    
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ApiResponse listAllUsers() {
    	logger.info("list all Users : {}");
        return userService.findAllUsers();
    }
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ApiResponse getUser(@PathVariable("id") long id) {
        logger.info("Fetching User with id {}", id);
    	return userService.getUser(id);
    }
    
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String createUser(@RequestBody User user) {
    	try {
    		  userService.createUser(user);
    	    }
    	    catch (Exception ex) {
    	      return "Error updating the user: " + ex.toString();
    	    }
    	return "User succesfully updated!";
    }
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String updateUser(@PathVariable("id") long id, @RequestBody User user) {
        User currentUser = userService.findById(id);
        if (currentUser == null) {
        	return "error occured";
        } else{
        	if( user.getName() != null){
        	currentUser.setName(user.getName());
        	}
        }
        userService.updateUser(currentUser);
        return "successful";
    }
 
}