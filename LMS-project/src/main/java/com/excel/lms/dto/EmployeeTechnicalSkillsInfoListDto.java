package com.excel.lms.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeTechnicalSkillsInfoListDto {
	
	private String employeeId;
	private List<EmployeeTechnicalSkillsInfoDto> employeeTechnicalSkillsInfoDtos;
}
