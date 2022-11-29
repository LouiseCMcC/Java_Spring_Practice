package com.codeclan.Employeeservice.repositories;

import com.codeclan.Employeeservice.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
