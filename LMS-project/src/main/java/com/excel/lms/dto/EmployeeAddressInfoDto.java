package com.excel.lms.dto;

import com.excel.lms.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeAddressInfoDto {
	private Integer addressId;
	
	private AddressType addressType;
	private Integer doorNo;
	private String street;
	private String locality;
	private String city;
	private String state;
	private Integer pinCode;
	private String landMark;
	
	private EmployeePrimaryInfoDto employeePrimaryInfoDto;
}
