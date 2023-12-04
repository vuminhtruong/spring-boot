package com.truongvu.springrestcrudemployee.dao;

import com.truongvu.springrestcrudemployee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
