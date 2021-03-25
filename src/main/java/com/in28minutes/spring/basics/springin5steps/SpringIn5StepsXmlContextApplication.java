package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan("com.in28minutes.spring.basics.springin5steps.basic")
public class SpringIn5StepsXmlContextApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);
	//What are the beans?
	//What are the dependencies for the beans?
	//Where to search for the beans? => No need

	public static void main(String[] args) {

		// Application Context

		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("appliactionContext.xml")) {

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}", personDao);
		}
	}
}
