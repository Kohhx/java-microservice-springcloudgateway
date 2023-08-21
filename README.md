# Microservices with Spring Cloud Gateway and Eureka Discovery Service

This project demonstrates the implementation of a microservices architecture using Spring Boot, Spring Cloud Gateway, and Eureka Discovery Service. It includes an Authentication service responsible for user registration, login, and token generation. Users' data is stored in a PostgreSQL database. The Spring Cloud Gateway integrates JWT authentication and directs authorized requests to the appropriate microservices, such as the Job microservice. Additionally, Eureka Discovery Service is used for service registration and discovery.

## Features

- **Authentication Service:**
  - User registration and login functionality.
  - User data storage in PostgreSQL database.
  - Generation of JWT tokens upon successful registration and login.

- **Spring Cloud Gateway:**
  - Acts as an API Gateway for routing and filtering requests.
  - Integrates JWT authentication and validates tokens from the Authorization header.
  - Routes authenticated requests to the appropriate microservices.

- **Eureka Discovery Service:**
  - Facilitates service registration and discovery within the microservices architecture.
  - Provides a central registry for all microservices.

- **Job Service:**
  - Requires a valid JWT token for access.
  - Provides functionality related to jobs (details to be specified).

