package com.excel.springbootproject.util;

import com.excel.springbootproject.dto.EmployeeDto;
import com.excel.springbootproject.entity.Employee;

public class EntityToDto {
	public static EmployeeDto entityToDto(Employee employee, EmployeeDto dto) {
		return EmployeeDto.builder()
		.empid(employee.getEmpid())
		.firstName(employee.getFirstName())
		.lastName(employee.getLastName())
		.mobileNo(employee.getMobileNo())
		.aadharNo(employee.getAadharNo())
		.panNo(employee.getPanNo())
		.employeeNo(employee.getEmployeeNo())
		.build();
	}
}
