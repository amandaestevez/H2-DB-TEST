package com.example.demo.model; // Package for entity classes

import jakarta.persistence.Entity; // Importing JPA Entity annotation
import jakarta.persistence.GeneratedValue; // Importing annotation for generated values
import jakarta.persistence.GenerationType; // Importing annotation for specifying generation type
import jakarta.persistence.Id; // Importing JPA Id annotation
import jakarta.persistence.Table; // Importing JPA Table annotation

@Entity // Marks this class as a JPA entity
@Table(name = "users") // Specifies the table name in the database
public class User {

    @Id // Specifies the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicates auto-generated primary key
    private Long id;

    private String name; // Field for the user's name
    private String email; // Field for the user's email

    // No-argument constructor
    public User() {
    }

    // Constructor to initialize the User object
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and setters for fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
