# Database Testing With SpringBoot

## What is Database Testing?

The process of testing a databases' structure (schema, databases, tables, etc), functionalities (queries), performance and security.

## Why is it important?

Not testing databases can lead to issues that compromise data integrity, such as incorrect schema updates, improper transaction, and operational failures.

## How to Test a Database?

## Steps

1. Create Test Cases
2. Execute Tests
3. Analyze Results

# Database Base Testing with SpringBoot.

1. Create a Spring Boot Project
2. Set up an in-memory database for isolated testing
3. Create the main application class
4. Create the Entity Classes
5. Create the Repository Interface
6. Create the Test Class
7. Run the Test and analyze results

# Step1: Create a Spring Boot Project
A Spring Boot project is a Java-based application that uses the Spring framework 
to simplify the creation of production-ready, stand-alone, and web-based applications 
with minimal configuration. 

Without Spring Boot, developers must manually configure the Spring framework,
manage dependencies, set up a server, and handle complex configurations for building and deploying applications.

Project configuration in [Spring Initializr](https://start.spring.io/):
1. Define a Maven Project
2. Spring boot Version
3. Java Version
4. Set up spring [dependencies](demo/demo/pom.xml)
5. Download and unzip
6. Open the project in Intellij IDEA

# Step 2: Set up an in-memory database(H2) for isolated testing:
Local database created at runtime for testing purposes ensuring a clear separation between test 
and production environments.

Steps:
1. Configure the `application.properties` file in `main.java.resources` and `test.java.resources`. 
   They specify the database connection settings and behavior for your SpringBoot application 
   during testing, ensuring it uses the correct in-memory database and configurations. It can be the
   same as main, or adjusted as needed.

See: [main.java.resources](demo/demo/src/main/resources/application.properties)
See: [test.java.resources](demo/demo/src/test/resources/application.properties)

# Step 3: Create the Main Application Class
The class that executes the application, annotated with `@SpringBootApplication`.
 Without this class, it is not possible to initialize the test because Spring relies 
on it to configure the necessary components that come with it, like automated dependency injection.

See: [DemoApplication](demo/demo/src/main/java/com/example/demo/DemoApplication.java)
 
# Step 4: Create the Entity Classes
The Entity class defines a table in the database, specifying its columns (fields) and primary key.
This class is crucial because without it you can't interact with the database.
One can have as many Entity classes (tables) as necessary.

See: [Entity classes](demo/demo/src/main/java/com/example/demo/model)

# Step 5: Create the Repository Interface
An interface is a contract that defines methods a class must implement without providing 
the implementation. The `UserRepository` interface extends Spring Data JPA repositories, 
offering common SQL queries. Not using it can increase development time and errors 
from repetitive code. The `UserRepositoryTest` class uses it to test the database.

# Step 6: Create the Test Class
This is the class that sets up and run the database.
The test script will interact with the in-memory database and parse the test data.
This class should be annotated with `@SpringBootTest` - if this annotation isn't present,
the access to the necessary beans (like UserRepository) is not possible.

# Step 7: Run Test and Analyze the Results
If the test passes, you'll see success messages indicating that 
all assertions were satisfied. This confirms that the database 
operations (like saving and retrieving entities) worked as 
expected.

If the test fails, you’ll see detailed error messages in the console. 
For example, if the assertEquals fails, you'll see which 
values were expected and which ones were actually returned.
