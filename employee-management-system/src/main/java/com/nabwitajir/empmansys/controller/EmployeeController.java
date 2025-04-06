package com.nabwitajir.empmansys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.nabwitajir.empmansys.dto.EmployeeWithDepartment;
import com.nabwitajir.empmansys.entity.Employee;
import com.nabwitajir.empmansys.service.EmployeeService;

@RestController	
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	@GetMapping("/home")
	public String  home() {
		return "TCS walkin interview";
	}
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee em) {
		return employeeService.addEmployee(em);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{id}/with-department")
	public ResponseEntity<EmployeeWithDepartment> getEmployeeWithDepartment(@PathVariable Long id){
		Employee employee = employeeService.findById(id).orElseThrow();
		// 2. Fetch Department from DepartmentService
	    ResponseEntity<Department> response = new RestTemplate().getForEntity(
	            "http://localhost:8081/departments/" + employee.getDepartmentId(),
	            Department.class
	    );
	    Department department = response.getBody();
	}
}
