package com.chronicle.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.chronicle.controller.MainController;
import com.chronicle.dto.user.User;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableConfigurationProperties
@EntityScan(basePackageClasses=User.class)
@SpringBootApplication
@ComponentScan(basePackageClasses = {MainController.class})
@EnableJpaRepositories(basePackages = {"com.chronicle.dto.user.dao"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
