package com.nabwitajir.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nabwitajir.department.entity.Department;
import com.nabwitajir.department.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department depart) {
		return departmentService.addDepartment(depart);
	}
	
	@GetMapping("/department")
	public List<Department> getDepartments(){
		return departmentService.getAllDepartment();
	}
}
