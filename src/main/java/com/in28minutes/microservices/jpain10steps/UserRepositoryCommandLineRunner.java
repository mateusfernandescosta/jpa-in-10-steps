package com.in28minutes.microservices.jpain10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.microservices.jpain10steps.entity.User;
import com.in28minutes.microservices.jpain10steps.service.UserDAOService;
import com.in28minutes.microservices.jpain10steps.service.UserRepository;

import lombok.extern.log4j.Log4j;


@Component
@Log4j
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// New User is created : User(id=2, name=Jill, role=Admin)
		User user = new User("Jill", "Admin");
		repository.save(user);
		log.info("New User is created : " + user);
	}
}
