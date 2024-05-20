package com.excel.lms.service.impl;

import com.excel.lms.dto.EmployeeAddressInfoListDto;
import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeeContactInfoListDto;
import com.excel.lms.dto.EmployeeEducationListDto;
import com.excel.lms.dto.EmployeeExperienceInfoListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.EmployeeTechnicalSkillsInfoListDto;

public interface EmployeePrimaryInfoService {

	String saveEmployeePrimaryInfo(EmployeePrimaryInfoDto employeePrimaryInfoDto);

	EmployeePrimaryInfoDto getAllEmployees(EmployeePrimaryInfoDto employeePrimaryInfoDto);

	String saveEmployeeSecondaryInfo(EmployeeSecondaryInfoDto employeeSecondaryInfoDto);

	String saveEmployeeBankInfo(EmployeeBankDetailsDto employeeBankDetailsDto);

	String saveEmployeeEducationInfo(EmployeeEducationListDto employeeEducationListDto);

	String saveEmployeeExperienceInfo(EmployeeExperienceInfoListDto employeeExperienceInfoListDto);

	String saveEmployeeAddressInfo(EmployeeAddressInfoListDto employeeAddressInfoListDto);

	String saveEmployeeContactInfo(EmployeeContactInfoListDto employeeContactInfoListDto);

	String saveEmployeeTechnicalSkillInfo(EmployeeTechnicalSkillsInfoListDto employeeTechnicalSkillsInfoListDto);

}
