package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import com.excel.lms.enums.Designation;
import com.excel.lms.enums.EmployeeStatus;
import com.excel.lms.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	@Column(unique = true)
	private String emailId;
	private String bloodgroup;

	@Enumerated(EnumType.STRING)
	private Designation designation;

	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String nationality;

	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private EmployeeSecondaryInfo employeeSecondaryInfo;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private EmployeeBankDetails employeeBankDetails;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeExperienceInfo> employeeExperience;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeAddressInfo> employeeAddress;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeEducationInfo> employeeEducationInfo;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeTechnicalSkillsInfo> employeeTechnicalSkillInfo;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employeePrimaryInfo")
	private List<EmployeeContactInfo> employeeContactInfo;
}
