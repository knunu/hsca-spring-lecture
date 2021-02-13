package com.hsca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(exclude = "password")
public class User {
	private String email;
	private String name;
	@JsonIgnore
	private String password;

	public User(String email, String name) {
		this.email = email;
		this.name = name;
	}
}