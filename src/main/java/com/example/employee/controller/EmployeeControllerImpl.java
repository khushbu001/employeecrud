package com.example.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.EmployeeDTO;
import com.example.employee.service.EmailService;
import com.example.employee.service.EmployeeService;

/**
 * @author khushbu
 * @Description This class will implements the EmployeeController interface
 */
@RestController
public class EmployeeControllerImpl implements EmployeeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeControllerImpl.class);

	@Autowired(required = true)
	private EmployeeService employeeService;

	@Autowired
	private EmailService emailService;
	/**
	 * @param employeeDTO
	 * @return employee
	 */
	@Override
	public ResponseEntity<EmployeeDTO> createEmployee(EmployeeDTO employeeDTO) {
		LOGGER.info("EmployeeControllerImpl :createEmployee ::start ");

		EmployeeDTO employee = employeeService.createEmployee(employeeDTO);

		LOGGER.debug("employeeDTO :{} , employee : {}", employeeDTO, employee);
		LOGGER.info("EmployeeControllerImpl :createEmployee ::end ");

		return ResponseEntity.status(HttpStatus.CREATED).body(employee);

	}

	/**
	 * @param empId , employeeDTO
	 * @return updateEmployee
	 */
	@Override
	public ResponseEntity<EmployeeDTO> updateEmployee(Long empId, EmployeeDTO employeeDTO) {
		LOGGER.info("EmployeeControllerImpl :: updateEmployee :: starts");

		EmployeeDTO updateEmployee = employeeService.updateEmployee(empId, employeeDTO);
		LOGGER.debug("empId : {} , employeeDTO : {}, updateEmployee : {}", empId, employeeDTO, updateEmployee);
		LOGGER.info("EmployeeControllerImpl :: updateEmployee :: ends");

		return ResponseEntity.status(HttpStatus.OK).body(updateEmployee);
	}

	@Override
	public ResponseEntity<Object> deleteEmployeeById(Long empId) {

		LOGGER.info("EmployeeControllerImpl :: deleteEmployeeById :: start");
		employeeService.deleteEmployeeById(empId);

		LOGGER.debug("empId:{} ", empId);
		LOGGER.info("EmployeeControllerImpl :: deleteEmployeeById :: ends");

		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

	/**
	 * @param empId
	 * @return employee
	 */
	@Override
	public ResponseEntity<EmployeeDTO> getOneEmployee(Long empId) {

		LOGGER.info("EmployeeControllerImpl :: getOneEmployee :: start");

		EmployeeDTO employee = employeeService.getOneEmployee(empId);

		LOGGER.debug("empId:{} , employee:{} ", empId, employee);
		LOGGER.info("EmployeeControllerImpl::getOneEmployee::End");

		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}

	/**
	 * @param noparameter
	 * @return allEmployee
	 */
	@Override
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee() {

		LOGGER.info("EmployeeControllerImpl :: getAllEmployee :: start");
		List<EmployeeDTO> allEmployee = employeeService.getAllEmployee();
		LOGGER.debug("allEmployee: {}", allEmployee);
		LOGGER.info("EmployeeControllerImpl :: getAllEmployee :: end");

		return ResponseEntity.status(HttpStatus.OK).body(allEmployee);
	}
	
	@RequestMapping(value = "/sendemail")
	public String sendEmail() throws AddressException, MessagingException, IOException {
		emailService.sendmail();
	   return "Email sent successfully";   
	}

}