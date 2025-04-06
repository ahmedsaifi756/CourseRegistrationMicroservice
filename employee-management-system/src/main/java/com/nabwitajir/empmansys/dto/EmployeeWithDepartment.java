package com.nabwitajir.empmansys.dto;

import com.nabwitajir.empmansys.entity.Employee;

import lombok.Data;

@Data
public class EmployeeWithDepartment {

	private Employee employee;
	private DepartmentDTO depatment;
}
