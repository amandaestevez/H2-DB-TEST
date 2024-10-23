package com.example.demo;

// Importing assertion methods for JUnit tests
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

// Importing Optional class for handling optional values
import java.util.Optional;

// Importing necessary JUnit and Spring annotations
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

// Annotation to indicate that this is a Spring Boot test
@SpringBootTest
// Annotation to configure an in-memory database for testing, without replacing it
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    // Injecting the UserRepository bean for testing
    @Autowired
    private UserRepository userRepository;

    // Test method to verify saving and retrieving a User entity by ID
    @Test
    public void whenSaved_thenFindsById() {
        // Creating a new User instance
        User user = new User("John", "john@example.com");
        // Saving the user to the repository
        userRepository.save(user);
        // Retrieving the user by ID
        Optional<User> found = userRepository.findById(user.getId());
        // Asserting that the user is found
        assertTrue(found.isPresent());
        // Asserting that the name of the found user is "John"
        assertEquals("John", found.get().getName());
    }
}
