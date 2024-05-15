package com.excel.springjdbc;

import java.security.KeyStore.Entry;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.excel.springjdbc.dao.StudentDao;
import com.excel.springjdbc.entities.Student;

public class ApplicationRunner {
	private static ApplicationContext ac;

	public static void main(String[] args) {

		ac = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDao student = ac.getBean("studentImpl", StudentDao.class);

		Student stu = new Student();

		stu.setId(2);
		stu.setName("Akash");
		stu.setAge(23);

		int res = student.create(stu);

		if (res != 0) {
			System.out.println("Inserted Successfully");
		} else {
			System.out.println("Insertion Failed");
		}

		ac = new AnnotationConfigApplicationContext(JdbcConfig.class);

		StudentDao student = ac.getBean("studentImpl", StudentDao.class);

		

		System.out.println(student.select());


	}
}
