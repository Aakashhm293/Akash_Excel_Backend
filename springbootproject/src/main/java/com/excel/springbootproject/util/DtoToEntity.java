package com.excel.springbootproject.util;

import com.excel.springbootproject.dto.EmployeeDto;
import com.excel.springbootproject.entity.Employee;

public class DtoToEntity {
	public static Employee dtoToEntity(Employee employee, EmployeeDto dto) {
		return  Employee.builder()
				.empid(dto.getEmpid())
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.mobileNo(dto.getMobileNo())
				.aadharNo(dto.getAadharNo())
				.panNo(dto.getPanNo())
				.employeeNo(dto.getEmployeeNo())
				.build();
	}
}
