About the application
=====================
Users information is a spring boot Maven project for Save the Children having a simple Java REST API service with an end point that will be able to take a users information and then store that information in the database. 

Application cloning from GitHub
====================================
In order to get this application into your local machine you can get clone of it.
git clone https://github.com/dhav2308/SaveTheChildrenTest .

Database Connection
===================
MySql database connectivity steps are provided in /src/main/resources/application.properties file
in which it is required that you set url, username and password as per database in your local machine.

Run this application
====================
There are several ways to run this Spring Boot application on your local machine. One way is to execute the main method in /src/main/java/com/saveTheChildren/UsersInformation/UsersInformationApplication.java 
class from your IDE.

Any dependency you want to add can be installed in the pom.xml file in Root directory of the project.

Upon running the application successfully, user_info table will be created under schema name that you have provided.

API testing
===========
Swagger has been integrated with this application in order to test API endpoints from http://localhost:8080/swagger-ui.html.

Unit test cases can be executed from /src/test/java/com/saveTheChildren/UsersInformation/UsersInformationApplicationTests.java class.


Technology Used
===============
Java
Maven
Spring Boot
MySql
Swagger
JUnit









