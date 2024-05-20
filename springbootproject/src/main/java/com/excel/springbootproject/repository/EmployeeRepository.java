package com.excel.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.springbootproject.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
