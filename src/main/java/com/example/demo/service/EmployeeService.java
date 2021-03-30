package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	// service will communicate with repository
	
	@Autowired
	private EmployeeRepository repository;
	// use autowired for injection
	
	// adding employee
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
		// this method is available in jpa repository
	}
	
	//adding list of employees
	public List<Employee> saveEmployees(List<Employee> employees) {
		return repository.saveAll(employees);
		// this method is available in jpa repository
	}
	
	// getting Employees
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	// getting employee
	public Employee getEmployee(int id) {
		return repository.findById(id).orElse(null);
	}
	
	// delete employee by id
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Deleted"+id;
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existing  = repository.findById(employee.getId()).orElse(null);
		existing.setEmail(employee.getEmail());
		existing.setMobilenumber(employee.getMobilenumber());
		existing.setPassword(employee.getPassword());
		existing.setRole(employee.getRole());
		return repository.save(existing);
	}
	
	
}
