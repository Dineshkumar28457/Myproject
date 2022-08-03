package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeecontroller {
@GetMapping("/employee")
public List<employee> getemployeecontroller() {
	List <employee> employee=new ArrayList<>();
	employee.add(new employee(1,"Dinesh","Teamleader"));
	employee.add(new employee(2,"guna","Employee3"));
	employee.add(new employee(3,"barath","HR"));
	employee.add(new employee(4,"Kumar","Employee1"));
	employee.add(new employee(5,"Tamil","Employee2"));
	return employee;
}
}
