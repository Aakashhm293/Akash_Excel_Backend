package com.excel.lms.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeExperienceInfoListDto {
	
	private String employeeId;
	private List<EmployeeExperienceInfoDto> employeeExperienceInfoDto;
}
