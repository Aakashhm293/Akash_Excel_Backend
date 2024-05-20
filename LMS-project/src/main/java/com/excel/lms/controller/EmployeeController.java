package com.excel.lms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.EmployeeAddressInfoListDto;
import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeeContactInfoListDto;
import com.excel.lms.dto.EmployeeEducationListDto;
import com.excel.lms.dto.EmployeeExperienceInfoListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.EmployeeTechnicalSkillsInfoListDto;
import com.excel.lms.service.impl.EmployeePrimaryInfoService;

import lombok.RequiredArgsConstructor;

@RequestMapping(path = "/api/v1/employee")
@RestController
@RequiredArgsConstructor
public class EmployeeController {

	private final EmployeePrimaryInfoService employeePrimaryInfoService;

	@PostMapping("/save")
	public ResponseEntity<String> saveEmployeeDetails(@RequestBody EmployeePrimaryInfoDto employeePrimaryInfoDto) {
		String saveEmployee = employeePrimaryInfoService.saveEmployeePrimaryInfo(employeePrimaryInfoDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployee);
	}

//	@GetMapping("/get")
//	public ResponseEntity<EmployeePrimaryInfoDto> getAllEmployeeDetails(@RequestBody EmployeePrimaryInfoDto employeePrimaryInfoDto) {
//		EmployeePrimaryInfoDto employeePrimaryInfoService = employeePrimaryInfoService.getAllEmployees(employeePrimaryInfoDto);
//		return ResponseEntity.status(HttpStatus.OK).body(saveEmployee);
//	}

	@PostMapping("/save/sec")
	public ResponseEntity<String> saveEmployeeDetails(@RequestBody EmployeeSecondaryInfoDto employeeSecondaryInfoDto) {
		String saveEmployee = employeePrimaryInfoService.saveEmployeeSecondaryInfo(employeeSecondaryInfoDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployee);
	}

	@PostMapping("/save/bank")
	public ResponseEntity<String> saveEmployeeBankDetails(@RequestBody EmployeeBankDetailsDto employeeBankDetailsDto) {
		String saveEmployeeBankInfo = employeePrimaryInfoService.saveEmployeeBankInfo(employeeBankDetailsDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployeeBankInfo);
	}

	@PostMapping("/save/edu")
	public ResponseEntity<String> saveEmployeeEducationDetails(
			@RequestBody EmployeeEducationListDto employeeEducationListDto) {
		String saveEmployeeEducationInfo = employeePrimaryInfoService
				.saveEmployeeEducationInfo(employeeEducationListDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployeeEducationInfo);
	}

	@PostMapping("/save/exp")
	public ResponseEntity<String> saveEmployeeExperienceDetails(
			@RequestBody EmployeeExperienceInfoListDto employeeExperienceInfoListDto) {
		String saveEmployeeExperienceInfo = employeePrimaryInfoService
				.saveEmployeeExperienceInfo(employeeExperienceInfoListDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployeeExperienceInfo);
	}
	
	@PostMapping("/save/address")
	public ResponseEntity<String> saveEmployeeAddressDetails(@RequestBody EmployeeAddressInfoListDto employeeAddressInfoListDto){
		String saveEmployeeAddressInfo = employeePrimaryInfoService.saveEmployeeAddressInfo(employeeAddressInfoListDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployeeAddressInfo);
	}
	
	@PostMapping("/save/contact")
	public ResponseEntity<String> saveEmployeeContactDetails(@RequestBody EmployeeContactInfoListDto employeeContactInfoListDto){
		String saveEmployeeContactInfo = employeePrimaryInfoService.saveEmployeeContactInfo(employeeContactInfoListDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployeeContactInfo);
	}
	
	@PostMapping("/save/skills")
	public ResponseEntity<String> saveEmployeeSkilsInfo(@RequestBody EmployeeTechnicalSkillsInfoListDto employeeTechnicalSkillsInfoListDto){
		String saveEmployeeTechnicalSkillInfo = employeePrimaryInfoService.saveEmployeeTechnicalSkillInfo(employeeTechnicalSkillsInfoListDto);
		return ResponseEntity.status(HttpStatus.OK).body(saveEmployeeTechnicalSkillInfo);
	}
}
