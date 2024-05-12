package com.excel.hibernate_many_to_many.service;

import java.util.ArrayList;
import java.util.List;

import com.excel.hibernate_many_to_many.entity.Library;
import com.excel.hibernate_many_to_many.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ApplicationDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Library lib = new Library();
		lib.setBookName("Core-Java");
		lib.setDate(19022024);
		
		List<Student> students = new ArrayList<>();
		
		Student stu = new Student();
		stu.setName("Akash");
		stu.setAge(23);
		stu.setRollno(23);
		students.add(stu);
		
		List<Library> books = new ArrayList<>();
		Library libbooks = new Library();
		
		libbooks.setBookName("CoreJave");
		libbooks.setDate(01012001);
		libbooks.setStudent(students);
		
		stu.setLibrary(books);
		
		
		et.begin();
		em.persist(students);
		em.persist(books);
		et.commit();
		
		em.close();
	}
}
