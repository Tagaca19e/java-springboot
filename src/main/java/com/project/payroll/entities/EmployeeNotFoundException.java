package com.project.payroll.entities;

public class EmployeeNotFoundException extends RuntimeException {
  
  public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}
