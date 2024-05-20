package com.excel.springbootproject.service;

import java.util.List;

import com.excel.springbootproject.dto.EmployeeDto;

public interface EmployeeService {
	public EmployeeDto addEmployee(EmployeeDto dto);

	public void deleteEmployee(EmployeeDto dto);

	public List<EmployeeDto> getAllEmployees();
}
