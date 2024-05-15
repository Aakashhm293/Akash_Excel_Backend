package com.excel.springjdbc.dao;

import java.util.List;
import java.util.Map;

import com.excel.springjdbc.entities.Student;

public interface StudentDao {
	public List<Student> select();

	public Map<String, Object> select(Student stu);

	public int create(Student stu);

	public int delete(Student stu);

	public int update(Student stu);
}
