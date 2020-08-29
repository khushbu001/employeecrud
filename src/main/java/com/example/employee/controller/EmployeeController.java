package com.example.employee.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.employee.entity.EmployeeDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Api(value = "EmployeeController is an interface which will communicate with the endpoints.")
@RequestMapping(value = "api/v1")
public interface EmployeeController {

	@ApiOperation(value = "It will call createEmployee of EmployeeService interface")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created employee profile"),
			@ApiResponse(code = 401, message = "Unauthorized ASP-API-Key"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found"), })
	@PostMapping(value = "/employees",produces = { "application/json", "application/xml" })
	public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO);

	@ApiParam
	@ApiOperation(value = "It will call updateEmployee of EmployeeService interface")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully updated employee profile"),
			@ApiResponse(code = 401, message = "Unauthorized ASP-API-Key"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found"), })
	@PutMapping(value = "/employees/{empId}",produces = { "application/json", "application/xml" })
	public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long empId, @RequestBody EmployeeDTO employeeDTO);

	@ApiOperation(value = "It will call updateEmployee of EmployeeService interface")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully deleted employee profile"),
			@ApiResponse(code = 401, message = "Unauthorized ASP-API-Key"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found"), })
	@DeleteMapping(value = "/employees/{empId}")
	public ResponseEntity<Object> deleteEmployeeById(@PathVariable Long empId);

	@ApiOperation(value = "It will call updateEmployee of EmployeeService interface")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully get one employee profile"),
			@ApiResponse(code = 401, message = "Unauthorized ASP-API-Key"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found"), })
	@GetMapping(value = "/employees/{empId}", produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
			})
	public ResponseEntity<EmployeeDTO> getOneEmployee(@PathVariable Long empId);

	@ApiOperation(value = "It will call getAllEmployee of EmployeeService interface")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully get all employee profile"),
			@ApiResponse(code = 401, message = "Unauthorized ASP-API-Key"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying " + "to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to retrieve is not " + "found"), })
	@GetMapping(value = "/employees",produces = {
			MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE
			})
	public ResponseEntity<List<EmployeeDTO>> getAllEmployee();
}
