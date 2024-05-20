package com.excel.lms.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.excel.lms.dto.EmployeeAddressInfoListDto;
import com.excel.lms.dto.EmployeeBankDetailsDto;
import com.excel.lms.dto.EmployeeContactInfoListDto;
import com.excel.lms.dto.EmployeeEducationListDto;
import com.excel.lms.dto.EmployeeExperienceInfoListDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.EmployeeTechnicalSkillsInfoListDto;
import com.excel.lms.entity.EmployeeAddressInfo;
import com.excel.lms.entity.EmployeeBankDetails;
import com.excel.lms.entity.EmployeeContactInfo;
import com.excel.lms.entity.EmployeeEducationInfo;
import com.excel.lms.entity.EmployeeExperienceInfo;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.EmployeeTechnicalSkillsInfo;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.SkillRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeePrimaryInfoServiceImpl implements EmployeePrimaryInfoService {

	private final EmployeeRepository employeeRepository;
	
	private final SkillRepository skillRepository;

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
	public String saveEmployeeSecondaryInfo(EmployeeSecondaryInfoDto employeeSecondaryInfoDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeeSecondaryInfoDto.getEmployeeId());

		if (optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			if (employeePrimaryInfo.getEmployeeSecondaryInfo() == null) {
				EmployeeSecondaryInfo employeeSecondaryInfo = EmployeeSecondaryInfo.builder()
						.panNo(employeeSecondaryInfoDto.getPanNo()).aadharNo(employeeSecondaryInfoDto.getAadharNo())
						.fatherName(employeeSecondaryInfoDto.getFatherName())
						.motherName(employeeSecondaryInfoDto.getMotherName())
						.spouseName(employeeSecondaryInfoDto.getSpouseName())
						.passportNo(employeeSecondaryInfoDto.getPassportNo())
						.maritalStatus(employeeSecondaryInfoDto.getMaritalStatus()).build();

				employeePrimaryInfo.setEmployeeSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setEmployeePrimaryInfo(employeePrimaryInfo);

				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();

			} else {
				employeePrimaryInfo.getEmployeeSecondaryInfo().getSecondaryId();
				EmployeeSecondaryInfo.builder().panNo(employeeSecondaryInfoDto.getPanNo())
						.aadharNo(employeeSecondaryInfoDto.getAadharNo())
						.fatherName(employeeSecondaryInfoDto.getFatherName())
						.motherName(employeeSecondaryInfoDto.getMotherName())
						.spouseName(employeeSecondaryInfoDto.getSpouseName())
						.passportNo(employeeSecondaryInfoDto.getPassportNo()).build();

				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			}
		}

		return "Employee if not found";
		// TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeBankInfo(EmployeeBankDetailsDto employeeBankDetailsDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeeBankDetailsDto.getEmployeeId());

		if (optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			if (employeePrimaryInfo.getEmployeeBankDetails() == null) {
				EmployeeBankDetails employeeBankDetails = EmployeeBankDetails.builder()
						.accountNo(employeeBankDetailsDto.getAccountNo()).bankName(employeeBankDetailsDto.getBankName())
						.accountType(employeeBankDetailsDto.getAccountType())
						.idfcCode(employeeBankDetailsDto.getAccountNo()).branch(employeeBankDetailsDto.getBranch())
						.state(employeeBankDetailsDto.getState()).build();

				employeePrimaryInfo.setEmployeeBankDetails(employeeBankDetails);
				employeeBankDetails.setEmployeePrimaryInfo(employeePrimaryInfo);

				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			} else {
				employeePrimaryInfo.getEmployeeBankDetails().getEmployeeId();
				EmployeeBankDetails.builder().accountNo(employeeBankDetailsDto.getAccountNo())
						.bankName(employeeBankDetailsDto.getBankName())
						.accountType(employeeBankDetailsDto.getAccountType())
						.idfcCode(employeeBankDetailsDto.getIdfcCode()).branch(employeeBankDetailsDto.getBranch())
						.state(employeeBankDetailsDto.getState()).build();

				return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			}
		}

		return "Employee if not found";
		// TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeEducationInfo(EmployeeEducationListDto employeeEducationListDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeeEducationListDto.getEmployeeId());

		if (optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();

			List<EmployeeEducationInfo> employeeEducationInfo = employeeEducationListDto.getEmployeeEducationInfoDtos()
					.stream()
					.map(e -> EmployeeEducationInfo.builder().educationType(e.getEducationType())
							.yearOfPassing(e.getYearOfPassing()).percentage(e.getPercentage())
							.universityName(e.getUniversityName()).instituteName(e.getInstituteName())
							.specialization(e.getSpecialization()).state(e.getState()).build())
					.collect(Collectors.toList());

			employeeEducationInfo.stream().forEach(e -> e.setEmployeePrimaryInfo(employeePrimaryInfo));
			employeePrimaryInfo.setEmployeeEducationInfo(employeeEducationInfo);

			return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
		}
		return "Employee if not found Please register first";
		// TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeExperienceInfo(EmployeeExperienceInfoListDto employeeExperienceInfoListDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository
				.findByEmployeeId(employeeExperienceInfoListDto.getEmployeeId());

		if (optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();

			List<EmployeeExperienceInfo> employeeExperienceInfos = employeeExperienceInfoListDto
					.getEmployeeExperienceInfoDto().stream()
					.map(e -> EmployeeExperienceInfo.builder().companyName(e.getCompanyName())
							.yearsOfExperience(e.getYearsOfExperience()).dateOfJoining(e.getDateOfJoining())
							.dateOfRelieving(e.getDateOfRelieving()).designation(e.getDesignation())
							.location(e.getLocation()).build())
					.collect(Collectors.toList());

			employeePrimaryInfo.setEmployeeExperience(employeeExperienceInfos);
			employeeExperienceInfos.stream().forEach(e -> e.setEmployeePrimaryInfo(employeePrimaryInfo));

			return employeeRepository.save(employeePrimaryInfo).getEmployeeId();

		}
		return null;
		// TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeAddressInfo(EmployeeAddressInfoListDto employeeAddressInfoListDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository
				.findByEmployeeId(employeeAddressInfoListDto.getEmployeeId());

		if (optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();

			List<EmployeeAddressInfo> employeeAddressInfos = employeeAddressInfoListDto.getEmployeeAddressInfoDtos()
					.stream()
					.map(e -> EmployeeAddressInfo.builder().addressType(e.getAddressType()).doorNo(e.getDoorNo())
							.street(e.getStreet()).locality(e.getLocality()).city(e.getCity()).state(e.getState())
							.pinCode(e.getPinCode()).landMark(e.getLandMark()).build())
					.collect(Collectors.toList());

			employeePrimaryInfo.setEmployeeAddress(employeeAddressInfos);
			employeeAddressInfos.stream().forEach(e -> e.setEmployeePrimaryInfo(employeePrimaryInfo));

			return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
		}
		return null;
		// TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeContactInfo(EmployeeContactInfoListDto employeeContactInfoListDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(employeeContactInfoListDto.getEmployeeId());
		
		EmployeePrimaryInfo employeePrimaryInfo = optional.get();
		
		if(optional.isPresent()) {
			List<EmployeeContactInfo> employeeContactInfos = employeeContactInfoListDto.getEmployeeContactInfoDtos().stream()
					.map(e -> EmployeeContactInfo.builder()
							.contactType(e.getContactType())
							.contactNumber(e.getContactNumber())
							.build()).collect(Collectors.toList());
			
			employeePrimaryInfo.setEmployeeContactInfo(employeeContactInfos);
			employeeContactInfos.stream().forEach(e -> e.setEmployeePrimaryInfo(employeePrimaryInfo));
			
			return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
		}
		
		return null;
		// TODO I have to create a exception here
	}

	@Override
	public String saveEmployeeTechnicalSkillInfo(EmployeeTechnicalSkillsInfoListDto employeeTechnicalSkillsInfoListDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findByEmployeeId(employeeTechnicalSkillsInfoListDto.getEmployeeId());
		
		if(optional.isPresent()) {
			EmployeePrimaryInfo employeePrimaryInfo = optional.get();
			List<EmployeeTechnicalSkillsInfo> employeeTechnicalSkillsInfo = employeeTechnicalSkillsInfoListDto.getEmployeeTechnicalSkillsInfoDtos().stream()
			.map(s -> {
				Optional<EmployeeTechnicalSkillsInfo> optionalTheOtherOne = skillRepository.findBySkillTypeAndSkillRatingAndYearOfExperience(
						s.getSkillType(),
						s.getSkillRating(),
						s.getYearOfExperience());
				
				return optionalTheOtherOne.isPresent() ? optionalTheOtherOne.get() : 
					EmployeeTechnicalSkillsInfo.builder()
					.skillType(s.getSkillType())
					.skillRating(s.getSkillRating())
					.yearOfExperience(s.getYearOfExperience())
					.employeePrimaryInfo(new ArrayList<>())
					.build();
			}).collect(Collectors.toList());
			
			if(employeePrimaryInfo.getEmployeeTechnicalSkillInfo() != null) {
				employeePrimaryInfo.getEmployeeTechnicalSkillInfo().clear();
			}
			
			employeeTechnicalSkillsInfo.stream().forEach(x -> {
				if(!x.getEmployeePrimaryInfo().contains(employeePrimaryInfo));
				x.getEmployeePrimaryInfo().add(employeePrimaryInfo);
			});
			
			employeePrimaryInfo.setEmployeeTechnicalSkillInfo(employeeTechnicalSkillsInfo);
			
			return employeeRepository.save(employeePrimaryInfo).getEmployeeId();
			
		}
		
		return null;
	}
	
	
	
//	----------[ Fetching Methods ]-----------------------------------------------------------------------------------------------------------------------------
	
	
	@Override
	public EmployeePrimaryInfoDto getAllEmployees(EmployeePrimaryInfoDto employeePrimaryInfoDto) {
		Optional<EmployeePrimaryInfo> optional = employeeRepository.findById(employeePrimaryInfoDto.getEmployeeId());

		if (optional.isPresent()) {
			EmployeePrimaryInfo empOpt = optional.get();
			return EmployeePrimaryInfoDto.builder().employeeId(empOpt.getEmployeeId())
					.employeeName(empOpt.getEmployeeName()).dateOfJoining(empOpt.getDateOfJoining())
					.dateOfBirth(empOpt.getDateOfBirth()).emailId(empOpt.getEmailId())
					.designation(empOpt.getDesignation()).nationality(empOpt.getNationality())
					.bloodgroup(empOpt.getBloodgroup()).gender(empOpt.getGender())
					.employeeStatus(empOpt.getEmployeeStatus()).build();
		}

		return null;
	}
	
}
