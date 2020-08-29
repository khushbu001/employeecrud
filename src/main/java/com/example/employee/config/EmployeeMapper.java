package com.example.employee.config;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.employee.entity.EmployeeDTO;
import com.example.employee.entity.Employee;

/**
 * @author khushbu
 * @Description This class will use to convert dto object into entity object and viceversa.
 *
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	EmployeeDTO toEmployeeDto(Employee employee);

	Employee toEmployee(EmployeeDTO employeeDTO);

	List<EmployeeDTO> toEmployeeDtos(List<Employee> employees);

}
