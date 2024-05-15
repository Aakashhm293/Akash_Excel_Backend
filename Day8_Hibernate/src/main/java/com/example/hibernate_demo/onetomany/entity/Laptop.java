package com.example.hibernate_demo.onetomany.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "laptop")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "laptop_id")
	private int id;

	@Column(name = "laptop_name")
	private String brand;

	@Column(name = "laptop_brand")
	private String serialno;

	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;

}
