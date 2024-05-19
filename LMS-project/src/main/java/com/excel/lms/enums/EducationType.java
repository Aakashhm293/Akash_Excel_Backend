package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EducationType {
	POSTGRADUATION("POSTGRADUATION"),
	GRADUATION("GRADUATION"),
	HIGHSCHOOL("HIGHSCHOOL"),
	OTHERS("OTHERS");

	private final String educationType;
}
