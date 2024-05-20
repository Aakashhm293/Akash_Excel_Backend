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
public class EmployeeAddressInfoListDto {
	
	private String employeeId;
	private List<EmployeeAddressInfoDto> EmployeeAddressInfoDtos;
}
