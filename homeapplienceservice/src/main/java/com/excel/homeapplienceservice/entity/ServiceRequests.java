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

@Entity
@Table(name = "service_requests")
public class ServiceRequests {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "request_id")
	private Long requestId;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customers customer;

	@ManyToOne
	@JoinColumn(name = "appliance_id")
	private Appliances appliance;

	@ManyToOne
	@JoinColumn(name = "assigned_technician_id")
	private Technicians assignedTechnician;

	@OneToMany(mappedBy = "serviceRequest")
	private List<ServiceTasks> serviceTasks;

}
