package com.excel.hibernate.service;

import com.excel.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ApplicationDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student stu = new Student();
		
		stu.setName("Akash");
		stu.setAge(23);
		
		et.begin();
		em.persist(stu);
		et.commit();
		
		em.close();
	}
}
