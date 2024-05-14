package com.excel.homeapplienceservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "task_updates")
public class TaskUpdates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "update_id")
	private Long updateId;

	@ManyToOne
	@JoinColumn(name = "task_id")
	private ServiceTasks serviceTask;

}
