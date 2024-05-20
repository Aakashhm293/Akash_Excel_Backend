package com.excel.springbootproject.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Integer empid;
	@Column(name = "employee_first_name")
	private String firstName;
	@Column(name = "employee_last_name")
	private String lastName;
	@Column(name = "employee_phone_number")
	private String mobileNo;
	@Column(name = "employee_aadhar_no")
	private String aadharNo;
	@Column(name = "employee_pan_no")
	private String panNo;
	@Column(name = "employee_no")
	private String employeeNo;

	@OneToMany(cascade = CascadeType.ALL)
	@Column(name = "Address_id")
	private List<Address> address;
}
