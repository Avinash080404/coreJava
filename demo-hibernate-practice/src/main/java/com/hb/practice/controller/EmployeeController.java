package com.hb.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hb.practice.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save7")
	public ResponseEntity<Object> postEmp(@RequestBody Employee emp)
	{
		return employeeService.postEmp(emp);
		
	}

}
