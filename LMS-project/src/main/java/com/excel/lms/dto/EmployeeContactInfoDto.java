package com.excel.lms.dto;

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
public class EmployeeContactInfoDto {

	private Integer contactId;
	private String contactType;
	private Double contactNumber;
	private EmployeePrimaryInfo employeePrimaryInfo;
}
