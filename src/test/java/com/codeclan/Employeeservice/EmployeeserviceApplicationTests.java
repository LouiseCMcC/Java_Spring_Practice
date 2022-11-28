package com.codeclan.Employeeservice;

import com.codeclan.Employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Employee john= new Employee("john", 30, 1234, "john@email.com");
		employeeRepository.save(john);
	}

}
