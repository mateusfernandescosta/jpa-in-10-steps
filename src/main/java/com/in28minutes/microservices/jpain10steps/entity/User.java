package com.in28minutes.microservices.jpain10steps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@ToString
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String role;
	
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
}
