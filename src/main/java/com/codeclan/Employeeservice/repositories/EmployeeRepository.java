package com.codeclan.Employeeservice.repositories;

import com.codeclan.Employeeservice.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
