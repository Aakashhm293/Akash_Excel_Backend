package com.excel.homeapplienceservice.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "appliances")
public class Appliances {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appliance_id")
	private Long applianceId;

	private String make;
	private String model;
	@Column(name = "serial_number")
	private String serialNumber;
	@Column(name = "warranty_status")
	private String warrantyStatus;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customers customers;

	@OneToMany(mappedBy = "appliance")
	private List<ServiceRequests> serviceRequests;

}