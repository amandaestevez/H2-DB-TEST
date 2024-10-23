package com.example.demo.repository; // Package for repository interfaces

import com.example.demo.model.User; // Importing the User entity
import org.springframework.data.jpa.repository.JpaRepository; // Importing Spring Data JPA repository interface

// UserRepository interface extends JpaRepository to provide CRUD operations for User entities
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods (if needed) can be defined here
}
