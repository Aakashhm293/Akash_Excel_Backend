package com.excel.hibernate_spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.excel.hibernate_spring.modules.Student;

@Component
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {
		int i = (int) this.hibernateTemplate.save(student);
		return i;
	}
}
