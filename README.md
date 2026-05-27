# User Address One-to-One Mapping System

A production-ready Spring Boot application demonstrating a One-to-One relationship mapping between User and Address entities using Spring Data JPA, Hibernate, and MySQL.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)

## Table of Contents

- Project Overview
- Features
- Tech Stack
- System Architecture
- Project Structure
- API Endpoints
- Database Configuration
- Installation Guide
- Running the Project
- Workflow
- Future Enhancements
- Author
- License

## Project Overview

This project demonstrates how to implement a One-to-One relationship using Spring Boot and Hibernate.

A User can have exactly one Address and an Address belongs to exactly one User.

The project follows enterprise-level backend architecture using:
- Controller Layer
- Service Layer
- Repository Layer
- Entity Layer

## Features

- Create User with Address
- Update User Details
- Delete User
- Fetch User Information
- One-to-One Entity Mapping
- RESTful APIs
- MySQL Database Integration
- Layered Architecture

## Tech Stack

| Technology | Purpose |
|------------|----------|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | ORM Layer |
| Hibernate | ORM Implementation |
| MySQL | Database |
| Maven | Dependency Management |
| Postman | API Testing |

## System Architecture

```text
Client
   ↓
Controller Layer
   ↓
Service Layer
   ↓
Repository Layer
   ↓
MySQL Database
```

## Project Structure

```text
src/
 ├── controller/
 ├── service/
 ├── repository/
 ├── entity/
 └── resources/
```

## One-to-One Mapping

### User Entity

```java
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "address_id")
private Address address;
```

### Address Entity

```java
@OneToOne(mappedBy = "address")
private User user;
```

## API Endpoints

### Create User

```http
POST /users
```

### Get User

```http
GET /users/{id}
```

### Update User

```http
PUT /users/{id}
```

### Delete User

```http
DELETE /users/{id}
```

## Sample Request Body

```json
{
  "name": "Tamoghno",
  "email": "tamoghno@gmail.com",
  "address": {
    "city": "Kolkata",
    "state": "West Bengal",
    "country": "India"
  }
}
```

## Database Configuration

Update application.properties

```properties
spring.datasource.url=your-database-url
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Requirements

### Windows
- Java 17+
- MySQL
- Maven
- IntelliJ / Eclipse

### Linux
- OpenJDK 17
- MySQL Server
- Maven

### macOS
- Java 17
- MySQL
- Maven

## Installation Guide

### Clone Repository

```bash
git clone https://github.com/Tamoghno-Das/User-Address-One-2-One.git
```

### Move Into Project

```bash
cd User-Address-One-2-One
```

### Build Project

```bash
mvn clean install
```

## Running the Project

```bash
mvn spring-boot:run
```

Application runs on:

```text
http://localhost:8080
```

## Workflow

```text
User Request
      ↓
Controller Handles Request
      ↓
Service Processes Logic
      ↓
Repository Accesses Database
      ↓
Hibernate Executes SQL
      ↓
Response Returned
```

## Database Relationship Diagram

```text
+-----------+        +-------------+
|   USER    |        |   ADDRESS   |
+-----------+        +-------------+
| id        |------->| id          |
| name      |        | city        |
| email     |        | state       |
| addressId |        | country     |
+-----------+        +-------------+
```

## Future Enhancements

- JWT Authentication
- Spring Security
- Swagger Documentation
- Docker Deployment
- Unit Testing
- Pagination

## Author

### Tamoghno Das

GitHub:
https://github.com/Tamoghno-Das

## Support

If you found this project useful:
- Star the repository
- Fork the project
- Share with developers

## Conclusion

This project demonstrates enterprise-level One-to-One entity mapping using Spring Boot and Hibernate while following clean backend architecture principles.

