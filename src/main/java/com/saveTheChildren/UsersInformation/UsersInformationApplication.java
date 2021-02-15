package com.saveTheChildren.UsersInformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This is a class with main method which will run the application. Swagger
 * has been integrated with this project to run on
 * http://localhost:8080/swagger-ui.html
 * 
 * @author Dhavalkumar Dadhania
 * @version 1.0
 */
@SpringBootApplication
@EnableSwagger2
public class UsersInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersInformationApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.saveTheChildren.UsersInformation")).build();
	}

}
