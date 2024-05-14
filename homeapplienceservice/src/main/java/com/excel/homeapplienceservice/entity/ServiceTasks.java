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
@Table(name = "service_tasks")
public class ServiceTasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private Long taskId;

	@ManyToOne
	@JoinColumn(name = "request_id")
	private ServiceRequests serviceRequest;

	@ManyToOne
	@JoinColumn(name = "technician_id")
	private Technicians technician;

	@OneToMany(mappedBy = "serviceTask")
	private List<TaskUpdates> taskUpdates;

}
