package com.nabwitajir.empmansys.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nabwitajir.empmansys.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
