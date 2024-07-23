package com.hb.practice.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hb.practice.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public ResponseEntity<Object> postEmp(Employee emp) {
		Map<String,Object> response=new LinkedHashMap<>();
		emp.setCreUser("Avinash");
		emp.setModUser("Hacker");
		String message =employeeRepository.postEmp(emp);
		
		if(message.equals("success")) {
			response.put("status", "OK");
			response.put("message", "Data Inserted Successfully");
		}
		else {
			response.put("status", "ERROR");
			response.put("message", message);
		}
		return new ResponseEntity<Object>(response,HttpStatus.OK);
	}

	public ResponseEntity<Object> editEmp(Integer id,Employee emp) {
		Map<String,Object> response=new LinkedHashMap<>();
		HttpStatus status=null;
		String message =employeeRepository.editEmp(id,emp);
		
		if(message.equals("success")) {
			status=HttpStatus.OK;
			response.put("status", "OK");
			response.put("message", "Data Updated Successfully");
		}
		else {
			status=HttpStatus.NOT_FOUND;
			response.put("status", "ERROR");
			response.put("message", message);
		}
		return new ResponseEntity<Object>(response,HttpStatus.OK);
	}
	}

