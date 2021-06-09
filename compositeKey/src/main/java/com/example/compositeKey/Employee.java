package com.example.compositeKey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table
public class Employee {

	
	@EmbeddedId
	private EmployeeId id;
	
	private String name;

	public EmployeeId getId() {
		return id;
	}

	public void setId(EmployeeId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(EmployeeId id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
		super();
	}
	
}
