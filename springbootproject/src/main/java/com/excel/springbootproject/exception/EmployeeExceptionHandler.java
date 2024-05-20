package com.excel.springbootproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.springbootproject.response.EmployeeResponse;

@RestControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<EmployeeResponse<String>> employeeNotFound(RuntimeException exp){
		return ResponseEntity.status(HttpStatus.OK)
				.body(EmployeeResponse.<String>builder()
						.data(null).isError(true)
						.message("Employee Not Found").build());
	}
}
