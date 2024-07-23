package com.hb.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import com.hb.practice.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class EmployeeRepository {

	@Autowired
	EntityManager em;
	public String postEmp(Employee emp) {
		String message=null;
		try {
			em.persist(emp);
			if(emp.getId()!=null)
				message="success";
		}catch(DataIntegrityViolationException e) {
			message=e.getMessage();
		}
		
		return message;
	}
	public String editEmp(Integer id,Employee emp) {
		String message =null;
		Employee existingEmp=em.find(Employee.class,id);
		if(existingEmp!=null) {
			existingEmp.setName(emp.getName());
			existingEmp.setMail(emp.getMail());
			existingEmp.setMobile(emp.getMobile());
			existingEmp.setModUser("Deepak bhai");
			em.merge(existingEmp);
			message="success";
		}
		else {
			message="Employee not found";
		}
		return message;
}
}
