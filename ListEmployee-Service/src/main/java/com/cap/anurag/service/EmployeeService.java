package com.cap.anurag.service;

import java.util.List;


import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	
    
	List<Employee> findAllEmployees();
    
	Employee findEmployee(Integer empId);

	
	}
