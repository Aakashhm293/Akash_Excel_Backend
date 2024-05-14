package com.excel.springproject.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/excel/springproject/constructor/config.xml");
		Employee empObj = (Employee) ac.getBean("employee");
	}
}
