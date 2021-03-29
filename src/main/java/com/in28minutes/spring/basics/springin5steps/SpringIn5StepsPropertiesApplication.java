package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsPropertiesApplication.class);
	//What are the beans?
	//What are the dependencies for the beans?
	//Where to search for the beans? => No need

	public static void main(String[] args) {

		// Application Context

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(
					 		SpringIn5StepsPropertiesApplication.class)) {

			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		}
	}
}
