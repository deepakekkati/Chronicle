package com.chronicle.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan("com.chronicle")
@RequestMapping("/api/v1")
public class MainController {
    // Holds api version
	
	public String index() {
	    return "Proudly handcrafted by " +
	        "<a href='http://chronicle.com/en'>Chronicle</a> :)";
	  }
}

