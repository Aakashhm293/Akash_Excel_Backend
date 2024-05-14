package com.excel.springproject.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	private static ApplicationContext con;

	public static void main(String[] args) {
		con = new ClassPathXmlApplicationContext("com/excel/springproject/collection/config.xml");
		Employee emp = (Employee) con.getBean("employee");
		System.out.println(emp);
	}
}
