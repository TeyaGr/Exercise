package com.example.compositeKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Phone {
	@Id
	@Column(name="phoneNumber")
	private String number;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="company_id", referencedColumnName="company_id"),
		@JoinColumn(name="employee_no",referencedColumnName="employee_no")
		
	})
	private Employee employee;
}
