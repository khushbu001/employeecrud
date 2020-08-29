package com.example.employee.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author khushbu
 *
 */
@ApiModel(value = "This is Employee DTO class which will use to map with the entity class")
public class EmployeeDTO {

	@ApiModelProperty(value = "empId will define the uniquwe id of the employee.")
	private Long empId;
	
	@ApiModelProperty(value = "empName will define the name of an employee")
	private String empName;
	
	@ApiModelProperty(value = "empContact will define the contact number of an employee")
	private Long empContact;
	
	@ApiModelProperty(value = "empAddress will define the address of an employee")
	private String empAddress;
	
	@ApiModelProperty(value = "empMaritalStatus will define the marital status of an employee")
	private Boolean empMaritalStatus;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(Long empId, String empName, Long empContact, String empAddress, Boolean empMaritalStatus) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empContact = empContact;
		this.empAddress = empAddress;
		this.empMaritalStatus = empMaritalStatus;
	}

	public EmployeeDTO(EmployeeDTO employeeDto) {
		// TODO Auto-generated constructor stub
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
