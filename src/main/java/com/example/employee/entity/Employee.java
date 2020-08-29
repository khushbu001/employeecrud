package com.example.employee.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author khushii
 *
 */

@Entity
public class Employee {

	@Id
	private Long empId;
	private String empName;
	private Long empContact;
	private String empAddress;
	private Boolean empMaritalStatus;

	public Employee() {
		super();
	}

	public Employee(Long empId, String empName, Long empContact, String empAddress, Boolean empMaritalStatus) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empContact = empContact;
		this.empAddress = empAddress;
		this.empMaritalStatus = empMaritalStatus;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(Long empContact) {
		this.empContact = empContact;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Boolean getEmpMaritalStatus() {
		return empMaritalStatus;
	}

	public void setEmpMaritalStatus(Boolean empMaritalStatus) {
		this.empMaritalStatus = empMaritalStatus;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empContact=" + empContact + ", empAddress="
				+ empAddress + ", empMaritalStatus=" + empMaritalStatus + "]";
	}
}
