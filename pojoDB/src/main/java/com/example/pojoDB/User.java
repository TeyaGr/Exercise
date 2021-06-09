package com.example.pojoDB;

public class User {

	
	private Integer user_id;
	private String username;
	private String email;
	private String password;
	private String country;
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public User(Integer user_id, String name, String email, String password, String country) {
		super();
		this.user_id = user_id;
		this.username = name;
		this.email = email;
		this.password = password;
		this.country = country;
	}
	public User() {
		super();
	}
	
	
}
