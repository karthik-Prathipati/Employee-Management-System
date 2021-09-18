package com.karthik.Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karthik.Backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
