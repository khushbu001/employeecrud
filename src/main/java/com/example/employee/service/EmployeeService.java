package com.example.employee.service;

import java.util.List;

import com.example.employee.entity.EmployeeDTO;

/**
 * 
 * @author khushii
 *
 */
public interface EmployeeService {

	EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

	EmployeeDTO updateEmployee(Long empId, EmployeeDTO employeeDTO);

	void deleteEmployeeById(Long empId);

	EmployeeDTO getOneEmployee(Long empId);

	List<EmployeeDTO> getAllEmployee();

}
