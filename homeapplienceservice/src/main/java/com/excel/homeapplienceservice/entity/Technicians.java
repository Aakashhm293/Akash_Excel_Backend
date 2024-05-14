package com.excel.homeapplienceservice.entity;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "technicians")
public class Technicians {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "technician_id")
	private Long technicianId;

	private String username;
	private String email;
	@Column(name = "password_hash")
	private String passwordHash;
	@Column(name = "phone_number")
	private String phoneNumber;
	private String address;
	private String expertise;
	@Column(name = "is_available")
	private boolean isAvailable;

	@OneToMany(mappedBy = "assignedTechnician")
	private List<ServiceRequests> assignedServiceRequests;
}
