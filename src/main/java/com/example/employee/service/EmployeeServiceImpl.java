package com.example.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.config.EmployeeMapper;
import com.example.employee.entity.Employee;
import com.example.employee.entity.EmployeeDTO;
import com.example.employee.repo.EmployeeRepo;

/** 
 * @author khushbu
 * @description This is the implementation class for employee service interface.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

//	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired(required = true)
	private EmployeeMapper employeeMapper;

	@Autowired
	private EmployeeRepo employeeRepo;

	/**
	 * @param employeeDTO
	 * @return employeDTO
	 */
	@Override
	public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {

		Employee employee = employeeMapper.toEmployee(employeeDTO);

		Employee employeeEntity = employeeRepo.save(employee);
		EmployeeDTO employeDTO = employeeMapper.toEmployeeDto(employeeEntity);

		return employeDTO;
	}

	@Override
	public EmployeeDTO updateEmployee(Long empId, EmployeeDTO employeeDTO) {

		Employee employee = employeeMapper.toEmployee(employeeDTO);

		employee.setEmpId(empId);

		Employee updateEmployee = employeeRepo.getOne(employee.getEmpId());

		updateEmployee.setEmpName(employee.getEmpName());
		updateEmployee.setEmpAddress(employee.getEmpAddress());
		updateEmployee.setEmpContact(employee.getEmpContact());
		updateEmployee.setEmpMaritalStatus(employee.getEmpMaritalStatus());

		Employee employeeUpdate = employeeRepo.save(updateEmployee);
		EmployeeDTO employeeEntity = employeeMapper.toEmployeeDto(employeeUpdate);

		return employeeEntity;
	}

	/**
	 * @param empId
	 */
	@Override
	public void deleteEmployeeById(Long empId) {
		Optional<Employee> employee = employeeRepo.findById(empId);
		if (employee.isPresent()) {
			employeeRepo.deleteById(empId);
		}
	}

	/**
	 * @param empId
	 * @return employeeDto
	 */
	@Override
	public EmployeeDTO getOneEmployee(Long empId) {

		Optional<Employee> employee = employeeRepo.findById(empId);
		EmployeeDTO employeeDto = null;
		if (employee.isPresent()) {
			employeeDto = employeeMapper.toEmployeeDto(employee.get());
		}

		return employeeDto;
	}

	/**
	 * @return employeeDto
	 */
	@Override
	public List<EmployeeDTO> getAllEmployee() {

		ArrayList<Employee> allEmployee = (ArrayList<Employee>) employeeRepo.findAll();
		List<EmployeeDTO> employeeDto = employeeMapper.toEmployeeDtos(allEmployee);

		return employeeDto;
	}

}
