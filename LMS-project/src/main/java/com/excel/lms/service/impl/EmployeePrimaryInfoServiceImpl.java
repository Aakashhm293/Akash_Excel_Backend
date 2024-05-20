package com.excel.lms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeeEducationListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeeEducationInfo;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeePrimaryInfoServiceImpl implements EmployeePrimaryInfoService {

	private final EmployeeRepository employeeRepository;

	@Override
	public String saveEmployeePrimaryInfo(EmployeePrimaryInfoDto employeePrimaryInfoDto) {
		EmployeePrimaryInfo employeePrimaryInfo = EmployeePrimaryInfo.builder()
				.employeeId(employeePrimaryInfoDto.getEmployeeId())
				.employeeName(employeePrimaryInfoDto.getEmployeeName())
				.dateOfJoining(employeePrimaryInfoDto.getDateOfJoining())
				.dateOfBirth(employeePrimaryInfoDto.getDateOfBirth()).emailId(employeePrimaryInfoDto.getEmailId())
				.bloodgroup(employeePrimaryInfoDto.getBloodgroup()).designation(employeePrimaryInfoDto.getDesignation())
				.gender(employeePrimaryInfoDto.getGender()).nationality(employeePrimaryInfoDto.getNationality())
				.employeeStatus(employeePrimaryInfoDto.getEmployeeStatus()).build();
		EmployeePrimaryInfo savedEmployee = employeeRepository.save(employeePrimaryInfo);

		return savedEmployee.getEmployeeId();
	}

	@Override
	public EmployeePrimaryInfoDto getAllEmployees(EmployeePrimaryInfoDto employeePrimaryInfoDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeePrimaryInfoDto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo empOpt = optional.get();
			return EmployeePrimaryInfoDto.builder()
			.employeeId(empOpt.getEmployeeId())
			.employeeName(empOpt.getEmployeeName())
			.dateOfJoining(empOpt.getDateOfJoining())
			.dateOfBirth(empOpt.getDateOfBirth())
			.emailId(empOpt.getEmailId())
			.designation(empOpt.getDesignation())
			.nationality(empOpt.getNationality())
			.bloodgroup(empOpt.getBloodgroup())
			.gender(empOpt.getGender())
			.employeeStatus(empOpt.getEmployeeStatus())
			.build();
		}
		
		return null;
		//TODO I have to write an exception for this;
	}

	@Override
	public String saveEmployeeSecondaryInfo(EmployeeSecondaryInfoDto employeeSecondaryInfoDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeeSecondaryInfoDto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			if(employeePrimaryInfo.getEmployeeSecondaryInfo() == null) {
				EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeSecondaryInfo.builder()
				.panNo(employeeSecondaryInfoDto.getPanNo())
				.aadharNo(employeeSecondaryInfoDto.getAadharNo())
				.fatherName(employeeSecondaryInfoDto.getFatherName())
				.motherName(employeeSecondaryInfoDto.getMotherName())
				.spouseName(employeeSecondaryInfoDto.getSpouseName())
				.passportNo(employeeSecondaryInfoDto.getPassportNo())
				.maritalStatus(employeeSecondaryInfoDto.getMaritalStatus())
				.build();
				
				employeePrimaryInfo.setEmployeeSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setEmployeePrimaryInfo(employeePrimaryInfo);
				
				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
				
			} else {
				employeePrimaryInfo.getEmployeeSecondaryInfo().getSecondaryId();
				EmployeeSecondaryInfo.builder()
				.panNo(employeeSecondaryInfoDto.getPanNo())
				.aadharNo(employeeSecondaryInfoDto.getAadharNo())
				.fatherName(employeeSecondaryInfoDto.getFatherName())
				.motherName(employeeSecondaryInfoDto.getMotherName())
				.spouseName(employeeSecondaryInfoDto.getSpouseName())
				.passportNo(employeeSecondaryInfoDto.getPassportNo())
				.build();
				
				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			}
		}
		
		return "Employee if not found";
		//TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeBankInfo(EmployeeBankDetailsDto employeeBankDetailsDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeeBankDetailsDto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			if(employeePrimaryInfo.getEmployeeBankDetails() == null) {
				EmployeeBankDetails employeeBankDetails = EmployeeBankDetails.builder()
				.accountNo(employeeBankDetailsDto.getAccountNo())
				.bankName(employeeBankDetailsDto.getBankName())
				.accountType(employeeBankDetailsDto.getAccountType())
				.idfcCode(employeeBankDetailsDto.getAccountNo())
				.branch(employeeBankDetailsDto.getBranch())
				.state(employeeBankDetailsDto.getState())
				.build();
				
				employeePrimaryInfo.setEmployeeBankDetails(employeeBankDetails);
				employeeBankDetails.setEmployeePrimaryInfo(employeePrimaryInfo);
				
				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			} else {
				employeePrimaryInfo.getEmployeeBankDetails().getEmployeeId();
				EmployeeBankDetails.builder()
				.accountNo(employeeBankDetailsDto.getAccountNo())
				.bankName(employeeBankDetailsDto.getBankName())
				.accountType(employeeBankDetailsDto.getAccountType())
				.idfcCode(employeeBankDetailsDto.getIdfcCode())
				.branch(employeeBankDetailsDto.getBranch())
				.state(employeeBankDetailsDto.getState())
				.build();
				
				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			}
		}
		
		return "Employee if not found";
		//TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeEducationInfo(EmployeeEducationListDto employeeEducationListDto) {
		employeeEducationListDto.get
		
		
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeeEducationListDto.getEmployeeId());
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			List<EmployeeEducationInfo> educations = employeeEducationListDto.
		}
		return null;
	}
	
	
}
