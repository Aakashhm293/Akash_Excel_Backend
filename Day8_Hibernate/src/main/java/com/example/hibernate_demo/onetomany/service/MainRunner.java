package com.example.hibernate_demo.onetomany.service;

import java.util.ArrayList;
import java.util.List;

import com.example.hibernate_demo.onetomany.entity.Laptop;
import com.example.hibernate_demo.onetomany.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainRunner {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-persist");
	private static EntityManager em = emf.createEntityManager();
	private static EntityTransaction et = em.getTransaction();

	public static void main(String[] args) {

		Student student = new Student();

		List<Laptop> laptops = new ArrayList<>();
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop();
		Laptop laptop3 = new Laptop();

		laptop1.setBrand("Lenovo");
		laptop1.setSerialno("AFB68458");
		laptop1.setStudent(student);

		laptop2.setBrand("Asus");
		laptop2.setSerialno("UUB8458");
		laptop2.setStudent(student);

		laptop3.setBrand("Apple");
		laptop3.setSerialno("KFID9348");
		laptop3.setStudent(student);

		laptops.add(laptop1);
		laptops.add(laptop2);
		laptops.add(laptop3);

		student.setName("john");
		student.setAge(23);
		student.setLaptops(laptops);

		et.begin();
		em.persist(student);
		et.commit();

		em.close();
	}
}
