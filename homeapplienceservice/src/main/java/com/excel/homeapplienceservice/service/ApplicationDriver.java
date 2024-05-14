package com.excel.homeapplienceservice.service;

import com.excel.homeapplienceservice.entity.Customers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ApplicationDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("homeapplienceservice");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Customers cust = new Customers();
		cust.setUsername("akash");
		cust.setPasswordHash("1asd8654asd564");
		cust.setAddress("Mysore");
		cust.setEmail("akash@gmail.com");
		cust.setPhoneNumber(9841565651.0);
		cust.setRegistrationDate(null);
		
		et.begin();
		em.persist(cust);
		et.commit();
		
		em.close();
	}
}
