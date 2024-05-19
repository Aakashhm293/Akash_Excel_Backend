package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employee_technical_skils_info")
public class EmployeeTechnicalSkillsInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tecchnical_skill_id")
	private Integer technicalSkillId;
	private String skillType;
	private String skillRating;
	private LocalDate yearOfExperience;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<EmployeePrimaryInfo> employeePrimaryInfo;
}
