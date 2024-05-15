package com.excel.springjdbc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.excel.springjdbc.entities.Student;

@Component("studentImpl")
public class StudentImplementation implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Student> select(){
		String query = "select * from Student";
		List<Student>students = jdbcTemplate.query(query, new BeanPropertyRowMapper<Student>(Student.class));
		return students;
	}
	
	public Map<String, Object> select(Student stu) {
		String query = "select * from Student where id = ?";
		return jdbcTemplate.queryForMap(query, stu.getId());
	}
	
	public int create(Student stu) {
		String query = "insert into Student (id, name, age) values (? , ? , ?)";
		return jdbcTemplate.update(query, stu.getId(), stu.getName(), stu.getAge());
	}

	public int delete(Student stu) {
		String query = "delete from Student where id = ?";
		return jdbcTemplate.update(query, stu.getId());
	}

	public int update(Student stu) {
		String query = "update Student set age = ? where id = ?";
		return jdbcTemplate.update(query, stu.getAge());
	}

}
