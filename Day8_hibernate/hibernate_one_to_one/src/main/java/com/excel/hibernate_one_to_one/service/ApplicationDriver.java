package com.excel.hibernate_one_to_one.service;

import com.excel.hibernate_one_to_one.entity.MarksCard;
import com.excel.hibernate_one_to_one.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ApplicationDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		MarksCard mc = new MarksCard();
		mc.setMarks(50);
		mc.setGrade("C");
		
		Student stu = new Student();
		stu.setName("Pravin");
		stu.setAge(23);
		stu.setMarkscard(mc);
		
		et.begin();
		em.persist(stu);
		et.commit();
		
		em.close();
	}
}
