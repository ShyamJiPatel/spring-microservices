package com.dbi.shyam.service;

import java.util.List;

import com.dbi.shyam.model.Employee;

public interface EmployeeService {

	Employee findById(Long id);

	void saveEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteemployeeById(Long id);

	Iterable<Employee> findAllEmployees();

	void deleteAllEmployees();

	boolean isEmployeeExist(Long id);

	List<String> findAllByProjectName(String projectName);

}
