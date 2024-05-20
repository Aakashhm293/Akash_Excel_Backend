package com.excel.lms.dto;

import java.time.LocalDate;

import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.enums.Designation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeExperienceInfoDto {
	private Integer experienceId;
	private String companyName;
	private Double yearsOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private Designation designation;
	private String location;
	private EmployeePrimaryInfo employeePrimaryInfo;
}
