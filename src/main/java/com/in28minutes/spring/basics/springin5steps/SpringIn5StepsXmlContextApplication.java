package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringIn5StepsXmlContextApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);
	//What are the beans?
	//What are the dependencies for the beans?
	//Where to search for the beans? => No need

	public static void main(String[] args) {

		// Application Context

		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

		    LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
		}
	}
}
