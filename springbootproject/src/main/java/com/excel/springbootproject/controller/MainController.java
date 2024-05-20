package com.excel.springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.springbootproject.constant.EmployeeConstant;
import com.excel.springbootproject.dto.EmployeeDto;
import com.excel.springbootproject.response.EmployeeResponse;
import com.excel.springbootproject.service.EmployeeService;

@RestController
public class MainController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<EmployeeResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(EmployeeResponse.<EmployeeDto>builder().data(dto)
				.isError(false).message(EmployeeConstant.EMPLOYEE_ADDED_SUCCESSFULY).build());
	}

	@PutMapping("/update")
	public ResponseEntity<EmployeeResponse<EmployeeDto>> updateEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto = employeeService.updateEmployeeById(employee);
		return ResponseEntity.status(HttpStatus.OK).body(EmployeeResponse.<EmployeeDto>builder().data(dto)
				.isError(false).message("Employee Updated Successfully").build());
	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto dto) {
		employeeService.deleteEmployee(dto);
		return ResponseEntity.ok("Employee Deleted Successfully");
	}

	@GetMapping("/getall")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployee() {
		return ResponseEntity.ok(employeeService.getAllEmployees());
	}

	@GetMapping("/getbyid")
	public ResponseEntity<EmployeeDto> fetchEmployeeById(@RequestBody EmployeeDto dto) {
		return ResponseEntity.ok(employeeService.getEmployeeById(dto));
	}
}
