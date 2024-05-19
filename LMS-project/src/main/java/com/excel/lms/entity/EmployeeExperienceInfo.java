package com.excel.lms.entity;

import java.time.LocalDate;

import com.excel.lms.enums.Designation;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "employee_experience")
public class EmployeeExperienceInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer experienceId;
	private String companyName;
	private Double yearsOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	
	@Enumerated(EnumType.STRING)
	private Designation designation;
	private String location;
	
	@ManyToOne
	private EmployeePrimaryInfo employeePrimaryInfo;
}
