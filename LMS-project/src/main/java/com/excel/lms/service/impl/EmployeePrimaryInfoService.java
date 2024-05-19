package com.excel.lms.service.impl;

import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeeEducationListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;

public interface EmployeePrimaryInfoService {

	String saveEmployeePrimaryInfo(EmployeePrimaryInfoDto employeePrimaryInfoDto);

	EmployeePrimaryInfoDto getAllEmployees(EmployeePrimaryInfoDto employeePrimaryInfoDto);

	String saveEmployeeSecondaryInfo(EmployeeSecondaryInfoDto employeeSecondaryInfoDto);

	String saveEmployeeBankInfo(EmployeeBankDetailsDto employeeBankDetailsDto);

	String saveEmployeeEducationInfo(EmployeeEducationListDto employeeEducationListDto);

}
