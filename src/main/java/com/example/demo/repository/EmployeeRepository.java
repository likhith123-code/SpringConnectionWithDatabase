package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	// the 1st parameter is class name and second parameter is primary key type
	
	
}
