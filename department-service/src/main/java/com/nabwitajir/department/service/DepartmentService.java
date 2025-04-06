package com.nabwitajir.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nabwitajir.department.entity.Department;
import com.nabwitajir.department.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	public Department addDepartment(Department department) {
		return departmentRepo.save(department);
	}
	
	public List<Department> getAllDepartment(){
		return departmentRepo.findAll();
	}

}
