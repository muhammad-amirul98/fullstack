package com.personal.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.personal.project.domain.CarRepository;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(ProjectApplication.class);
	
	private final CarRepository repository;
	
	public ProjectApplication(CarRepository repository) {
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		logger.info("Application started");
	}
	
	@Override
	public void run(String... args) throws Exception {
		//code
	}

}
