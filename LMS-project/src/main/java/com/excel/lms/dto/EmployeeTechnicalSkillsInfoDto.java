package com.excel.lms.dto;

import java.time.LocalDate;

import com.excel.lms.entity.EmployeePrimaryInfo;

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
public class EmployeeTechnicalSkillsInfoDto {
	private Integer technicalSkillId;
	private String skillType;
	private String skillRating;
	private LocalDate yearOfExperience;
	private EmployeePrimaryInfo employeePrimaryInfo;
}
