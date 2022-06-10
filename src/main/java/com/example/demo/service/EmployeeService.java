package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
	
}

/*
1. Task Management Apps
2. Second-hand goods buying & selling app
3. Ride sharing app(like uber)
4. Food Ordering App(like foodPanda)
4. Online Classroom app(like google classroom)
5. Crime Informing App (for BD Police/RAB)
*/