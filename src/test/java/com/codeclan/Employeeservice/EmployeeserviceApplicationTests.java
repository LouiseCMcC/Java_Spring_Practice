package com.codeclan.Employeeservice;

import com.codeclan.Employeeservice.repositories.DepartmentRepository;
import com.codeclan.Employeeservice.repositories.EmployeeRepository;
import com.codeclan.Employeeservice.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	public void canCreateEmployee(){
//		Employee john= new Employee("john", 30, 1234, "john@email.com");
//		employeeRepository.save(john);
//	}

	@Test
	public void canCreateEmployeeAndDepartment(){
		Department department = new Department("Sales");
		departmentRepository.save(department);
		Employee employee1 = new Employee("john", 30, 1234, "john@email.com", department);
		employeeRepository.save(employee1);
	}

	@Test
	public void canCreateEmployeeDepartmentAndProjects(){
		Department department = new Department("Sales");
		departmentRepository.save(department);
		Employee employee1 = new Employee("john", 30, 1234, "john@email.com", department);
		employeeRepository.save(employee1);
		Project project1 = new Project("initiative", 100);
		projectRepository.save(project1);
		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}
}
