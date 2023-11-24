package com.springBootbackend.springbootBackend;

import com.springBootbackend.springbootBackend.model.Employee;
import com.springBootbackend.springbootBackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBackendApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setFirstName("Aman");
		employee.setLastName("Prakash");
		employee.setEmailId("aman@gmail.com");
		employeeRepository.save(employee);

		Employee employee1=new Employee();
		employee1.setFirstName("Pooja");
		employee1.setLastName("Bharadwaj");
		employee1.setEmailId("pooja@gmail.com");
		employeeRepository.save(employee1);

	}
}
