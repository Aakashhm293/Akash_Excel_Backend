package com.excel.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/excel/springproject/config.xml");
		Student student = (Student)ac.getBean("student");
		System.out.println(student);
	}
}
