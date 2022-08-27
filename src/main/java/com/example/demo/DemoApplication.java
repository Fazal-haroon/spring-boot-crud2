package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DemoApplication(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> list = Arrays.asList(
                new Employee(1L,"haroon","khan","faz@gmail.com"),
                new Employee(2L, "maria", "khan", "mk@gmail.com")
        );
        employeeRepository.saveAll(list);
    }
}
