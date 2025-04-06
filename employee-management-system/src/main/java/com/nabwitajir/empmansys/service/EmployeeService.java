package com.nabwitajir.empmansys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nabwitajir.empmansys.entity.Employee;
import com.nabwitajir.empmansys.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}

	public Optional<Employee> findById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}
}
