package com.excel.lms.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_technical_skils_info")
public class EmployeeTechnicalSkillsInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer technicalSkillId;
	private String skillType;
	private String skillRating;
	private LocalDate yearOfExperience;
}
