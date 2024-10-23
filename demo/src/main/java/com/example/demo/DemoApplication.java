package com.example.demo; // Base package for the application

import org.springframework.boot.SpringApplication; // Importing Spring Boot's SpringApplication class
import org.springframework.boot.autoconfigure.SpringBootApplication; // Importing Spring Boot application annotation

@SpringBootApplication // Indicates that this is a Spring Boot application
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args); // Launches the Spring application
    }
}
