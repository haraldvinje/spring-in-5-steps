package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps.basic")
public class SpringIn5StepsBasicApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsBasicApplication.class);
	//What are the beans?
	//What are the dependencies for the beans?
	//Where to search for the beans? => No need

	public static void main(String[] args) {

		// Application Context

		try (AnnotationConfigApplicationContext applicationContext =
					 new AnnotationConfigApplicationContext(
					 		SpringIn5StepsBasicApplication.class)) {

			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		}
	}
}
