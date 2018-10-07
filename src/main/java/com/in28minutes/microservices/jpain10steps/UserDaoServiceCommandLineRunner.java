package com.in28minutes.microservices.jpain10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.microservices.jpain10steps.entity.User;
import com.in28minutes.microservices.jpain10steps.service.UserDAOService;

import lombok.extern.log4j.Log4j;


@Component
@Log4j
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		// New User is created : User(id=1, name=Jack, role=Admin)
		User user = new User("Jack", "Admin");
		long insert = userDaoService.insert(user);
		log.info("New User is created : " + user);		
		// TODO Auto-generated method stub
		
	}
	
	

}
