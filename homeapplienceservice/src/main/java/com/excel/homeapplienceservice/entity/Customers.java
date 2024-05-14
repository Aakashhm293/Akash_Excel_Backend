package com.excel.homeapplienceservice.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;

	private String username;
	private String email;
	@Column(name = "password_hash")
	private String passwordHash;
	@Column(name = "phone_number")
	private double phoneNumber;
	private String address;
	@Column(name = "registration_date")
	private Date registrationDate;

	@OneToMany(mappedBy = "customer")
	private List<ServiceRequests> serviceRequests;
}
