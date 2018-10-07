package com.in28minutes.microservices.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in28minutes.microservices.jpain10steps.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
