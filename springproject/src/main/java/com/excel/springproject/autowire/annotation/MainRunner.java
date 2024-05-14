package com.excel.springproject.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/excel/springproject/autowire/annotation/config.xml");
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println(employee);
	}
}
