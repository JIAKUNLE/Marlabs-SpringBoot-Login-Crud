# Marlabs-SpringBoot-Login-Crud
Marlabs project 1
# Marlabs-SpringBoot-Login-Crud

Spring Boot JWT Authentication Project

1.Project Description
This project is a web application built on Spring Boot, employing JWT (JSON Web Tokens) for authentication. It adheres to the principles of a RESTful API design and supports CRUD operations for users.

2.Features
User Login: Users can authenticate themselves via a login page. Upon successful verification, a JWT token is returned by the system for future authorized requests.

User CRUD Operations:

Create (POST): Once logged in, the system stores the username and password in the database.
Read (GET): Retrieve a single user by ID or retrieve all users.
Update (PUT): Update an existing user's username and password by their ID.
Delete (DELETE): Remove a user by their ID.
Security: Authentication and authorization via JWT ensures secure access to the APIs.

3.Tech Stack
Backend: Spring Boot, Spring Security, JWT
Database: [Specific database technology, e.g., H2, MySQL, PostgreSQL]
Frontend: HTML, JavaScript

4.Postman Testing
All API endpoints of the project have been tested using Postman. Relevant test screenshots can be found in the screenshots folder of this project.

![image](https://github.com/JIAKUNLE/Marlabs-SpringBoot-Login-Crud/assets/113396835/19a9cd1f-d59f-4b35-8c8c-3ed27433fbd3)

![image](https://github.com/JIAKUNLE/Marlabs-SpringBoot-Login-Crud/assets/113396835/e757a6db-4a74-4fb5-8ad0-3f165f033ce0)

![image](https://github.com/JIAKUNLE/Marlabs-SpringBoot-Login-Crud/assets/113396835/81b49aab-f10c-4ed1-9d2b-2324a5e524d3)

![image](https://github.com/JIAKUNLE/Marlabs-SpringBoot-Login-Crud/assets/113396835/e61bacd0-4d8f-4a84-9763-80151d24b3e1)

![image](https://github.com/JIAKUNLE/Marlabs-SpringBoot-Login-Crud/assets/113396835/6c7011d3-4f99-4800-b571-efe1b732a782)



5.Getting Started
Clone this repository locally.
In the project directory, run the application using the command mvn spring-boot:run.
Open a browser and navigate to http://localhost:8080/login to access the login page.
