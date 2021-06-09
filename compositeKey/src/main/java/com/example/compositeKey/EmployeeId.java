package com.example.compositeKey;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Embeddable
public class EmployeeId implements Serializable{

	
	@Column(name="company_id")
	private long companyId;
	@Column(name="employee_no")
	private long employeeNo;
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public long getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}
	public EmployeeId(long companyId, long employeeNo) {
		super();
		this.companyId = companyId;
		this.employeeNo = employeeNo;
	}
	public EmployeeId() {
		super();
	}
	
}
