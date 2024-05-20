package com.excel.hibernate_spring.mainapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.hibernate_spring.config.Config;
import com.excel.hibernate_spring.dao.StudentDao;
import com.excel.hibernate_spring.modules.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
//		To View All the Beans
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		for(String s : beanDefinitionNames) {
//			System.out.println(s);
//		}
		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setName("Swamy");
		student.setGrade("A+");

		int res = dao.insert(student);

		if (res != 0) {
			System.out.println("Inserted Successfully");
		} else {
			System.out.println("Failed to insert");
		}
	}
}
