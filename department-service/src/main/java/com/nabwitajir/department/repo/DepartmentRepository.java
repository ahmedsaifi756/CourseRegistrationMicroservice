package com.nabwitajir.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nabwitajir.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
