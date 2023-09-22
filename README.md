# Spring Boot User Management System

## Overview

This project is a simple User Management System built using the Spring Boot framework. It allows you to manage user information, including username, date of birth, email, and phone number, with validation on user input.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL 
- Maven 

## Project Structure

The project consists of the following components:

### 1. Controller

- The `UserController` class defines the RESTful endpoints for user management.
- Endpoints include adding, retrieving, updating, and deleting user information.
- Controller methods handle incoming requests, validate data, and interact with the services.

### 2. Services

- The `UserService` class contains business logic for user-related operations.
- It interfaces with the repository to perform CRUD operations on user data.
- Validation of user input is also performed at the service level.

### 3. Repository

- The `UserRepository` interface extends Spring Data JPA's `JpaRepository`.
- It provides methods for database operations, such as saving, retrieving, and deleting user entities.
- Spring Data JPA automatically generates the database queries based on method names.

### 4. Database Design

- The project uses a MySQL database to store user information.
- The database schema consists of a single table named `users` that matches the `User` entity.

## Data Structure

The main data structure in the project is the `User` entity, which represents user information. It has the following attributes:

- `userId`: Unique identifier for each user (auto-generated).
- `username`: User's username.
- `dateOfBirth`: User's date of birth (in yyyy-MM-dd format).
- `email`: User's email address.
- `phoneNumber`: User's phone number (12 digits, including country code).

## Project Summary

This Spring Boot User Management System provides a foundation for managing user data with proper validation. It includes RESTful APIs for creating, retrieving, updating, and deleting user records in a MySQL database. The project demonstrates the use of Spring Boot, Spring Data JPA, and validation annotations to build a robust user management system.
