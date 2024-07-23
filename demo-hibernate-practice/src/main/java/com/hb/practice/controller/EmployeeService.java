package com.hb.practice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hb.practice.entity.Employee;

@Service
public interface EmployeeService {

	ResponseEntity<Object> postEmp(Employee emp);

}
