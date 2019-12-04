# SpringBootMicroservices
This application is built up in Spring Boot using H2- In memory database. 
It contains two microservices running on two different ports. 
Its a demo showing how two microservices communicate with each other using Rest API. 
It also contains JUnit test cases using Mockito.

Below are the links In order to access the projects on the localhost after importing into eclipse/STS.

For Microservice 1

http://localhost:8080/addEmployee 

http://localhost:8080/getAllEmployees

For Microservice 2

http://localhost:8081/addDepartment 

http://localhost:8081/getAllDepartments

For Microservice 1 communicating with Microservice 2

http://localhost:8080/getAllDepartment   

