package com.example.hibernate_demo.onetoone.service;

import com.example.hibernate_demo.onetoone.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	public static void main(String[] args) {
		factory = Persistence.createEntityManagerFactory("hibernate-persist");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

		Student stu = new Student();
		stu.setName("Swamy");
		stu.setAge(23);

		transaction.begin();
		manager.persist(stu);
		transaction.commit();

		manager.close();
	}
}
