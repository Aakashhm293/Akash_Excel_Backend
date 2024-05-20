package com.excel.springbootproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.springbootproject.constant.EmployeeConstant;
import com.excel.springbootproject.dto.EmployeeDto;
import com.excel.springbootproject.entity.Employee;
import com.excel.springbootproject.exception.EmployeeNotFound;
import com.excel.springbootproject.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		Employee employee = Employee.builder().firstName(dto.getFirstName()).lastName(dto.getLastName())
				.mobileNo(dto.getMobileNo()).aadharNo(dto.getAadharNo()).panNo(dto.getPanNo())
				.employeeNo(dto.getEmployeeNo()).build();

		Employee save = repository.save(employee);

		return EmployeeDto.builder().empid(save.getEmpid()).firstName(save.getFirstName()).lastName(save.getLastName())
				.mobileNo(save.getMobileNo()).aadharNo(save.getAadharNo()).panNo(save.getPanNo())
				.employeeNo(save.getEmployeeNo()).build();
	}

	@Override
	public void deleteEmployee(EmployeeDto dto) {
		Optional<Employee> optional = repository.findById(dto.getEmpid());
		if (optional.isPresent())
			repository.delete(optional.get());
		else
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_NOT_FOUND);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return repository.findAll().stream()
				.map(e -> EmployeeDto.builder().empid(e.getEmpid()).firstName(e.getFirstName())
						.lastName(e.getLastName()).mobileNo(e.getMobileNo()).aadharNo(e.getAadharNo())
						.panNo(e.getPanNo()).employeeNo(e.getEmployeeNo()).build())
				.toList();
	}

	public List<EmployeeDto> getEmployeeById(EmployeeDto dto) {

		Optional<Employee> optional = repository.findById(dto.getEmpid());

		if (optional.isPresent()) {
			return repository.findAll().stream()
					.map(e -> EmployeeDto.builder().empid(optional.get().getEmpid())
							.firstName(optional.get().getFirstName()).lastName(optional.get().getLastName())
							.mobileNo(optional.get().getMobileNo()).aadharNo(optional.get().getAadharNo())
							.panNo(optional.get().getPanNo()).employeeNo(optional.get().getEmployeeNo()).build())
					.toList();
		} else {
			return null;
		}

	}
}
