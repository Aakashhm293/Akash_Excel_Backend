package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AddressType {

	PERMANENT("PERMANENT"),
	TEMPORARY("TEMPORARY");

	private final String addressType;
}
