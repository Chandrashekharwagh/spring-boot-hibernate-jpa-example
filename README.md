# Spring Boot Hibernate JPA Example

This example is a Spring Boot application that demonstrates the use of Hibernate JPA for database operations, along with Lombok for reducing boilerplate code and H2 as an in-memory database.

## Prerequisites

- Java 17 or higher
- Maven 3.6.x or higher

## Dependencies

This project uses the following main dependencies:

- Spring Boot 2.5.x
- Spring Data JPA
- Hibernate
- Lombok
- H2 Database

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/Chandrashekharwagh/spring-boot-hibernate-jpa-example.git
   ```

2. Navigate to the project directory:
   ```
   cd spring-boot-hibernate-jpa-example
   ```

3. Build the project:
   ```
   mvn clean install
   ```

## Configuration

The application uses an H2 in-memory database by default. You can modify the database configuration in the `application.properties` file:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

## Running the Application

To run the application, use the following command:

```
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## Accessing the H2 Console

You can access the H2 database console at `http://localhost:8080/h2-console`. Use the following details to log in:

- JDBC URL: `jdbc:h2:mem:testdb`
- User Name: `sa`
- Password: (leave blank)

## Project Structure

```
src
├── main
   ├── java
   │   └── com
   │       └── example   
   │               ├── SpringbootJpaApplication.java
   │               ├── controller
   │               ├── model
   │               ├── repository
   │               └── service
   └── resources
       └── application.properties
```

## Usage

1. Define your entities in the `model` package using JPA annotations and Lombok annotations.
2. Create repositories in the `repository` package by extending `JpaRepository`.
3. Implement your business logic in the `service` package.
4. Create REST endpoints in the `controller` package.

## License

This project is licensed under the MIT License - see the `LICENSE.md` file for details.
