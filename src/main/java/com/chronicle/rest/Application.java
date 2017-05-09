package com.chronicle.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.chronicle.controller.MainController;
import com.chronicle.rest.service.LoginService;
import com.chronicle.rest.service.UserService;

@EnableConfigurationProperties
@SpringBootApplication
@ComponentScan(basePackageClasses = {MainController.class, LoginService.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
