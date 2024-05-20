package com.excel.springbootproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.springbootproject.constant.EmployeeConstant;
import com.excel.springbootproject.dto.EmployeeDto;
import com.excel.springbootproject.entity.Address;
import com.excel.springbootproject.entity.Employee;
import com.excel.springbootproject.exception.EmployeeNotFound;
import com.excel.springbootproject.repository.EmployeeRepository;
import com.excel.springbootproject.util.EntityToDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {

//		Employee employee = Employee.builder()
//				.firstName(dto.getFirstName())
//				.lastName(dto.getLastName())
//				.mobileNo(dto.getMobileNo())
//				.aadharNo(dto.getAadharNo())
//				.panNo(dto.getPanNo())
//				.address(dto.getAddress())
//				.employeeNo(dto.getEmployeeNo())
//				.build();
//
//		Employee save = repository.save(employee);
//
//		return EmployeeDto.builder()
//				.empid(save.getEmpid())
//				.firstName(save.getFirstName())
//				.lastName(save.getLastName())
//				.mobileNo(save.getMobileNo())
//				.aadharNo(save.getAadharNo())
//				.panNo(save.getPanNo())
//				.address(save.getAddress())
//				.employeeNo(save.getEmployeeNo())
//				.build();
		Employee employee = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName())
				.mobileNo(dto.getMobileNo()).aadharNo(dto.getAadharNo()).panNo(dto.getPanNo())
				.address(dto.getAddress().stream()
								.map(add -> Address.builder()
										.street(add.getStreet())
										.place(add.getPlace())
										.pincode(add.getPincode())
										.build())
								.toList())
				
				.employeeNo(dto.getEmployeeNo()).build();

		employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(EmployeeDto dto) {
		Optional<Employee> optional = employeeRepository.findById(dto.getEmpid());
		if (optional.isPresent())
			employeeRepository.delete(optional.get());
		else
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_NOT_FOUND);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return employeeRepository.findAll().stream()
				.map(e -> EmployeeDto.builder().empid(e.getEmpid()).firstName(e.getFirstName())
						.lastName(e.getLastName()).mobileNo(e.getMobileNo()).aadharNo(e.getAadharNo())
						.panNo(e.getPanNo()).employeeNo(e.getEmployeeNo()).build())
				.toList();
	}

	public EmployeeDto getEmployeeById(EmployeeDto dto) {

		Optional<Employee> optional = employeeRepository.findById(dto.getEmpid());

		if (optional.isPresent()) {
			Employee employee = optional.get();
			return EntityToDto.entityToDto(employee, dto);
		} else {
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_NOT_FOUND);
		}
	}

	public EmployeeDto updateEmployeeById(EmployeeDto dto) {
		Optional<Employee> optional = employeeRepository.findById(dto.getEmpid());

		if (optional.isPresent()) {
			Employee employee = optional.get();

			employee.setFirstName(dto.getFirstName());
			employee.setLastName(dto.getLastName());
			employee.setMobileNo(dto.getMobileNo());

			Employee save = employeeRepository.save(employee);

			return EntityToDto.entityToDto(save, dto);
		} else {
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_NOT_FOUND);
		}
	}
}
