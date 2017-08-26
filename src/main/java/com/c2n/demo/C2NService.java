package com.c2n.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class C2NService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void listEmployees(){
		List<Employee> employees=employeeRepository.findAll();
		
		System.out.println(employees);
	}
}
