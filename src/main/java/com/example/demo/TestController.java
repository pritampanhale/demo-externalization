package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	private static final Logger LOG = LoggerFactory.getLogger(TestController.class);
	
	@Value("${application.test.property}")
    private String testProperty;
	
	@PostConstruct
	public void init() {
		LOG.info("Initializing the controller....");
		LOG.info("value for test property is : {}", testProperty);
	}
	
}
