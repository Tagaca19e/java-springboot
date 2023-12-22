package com.project.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.payroll.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
