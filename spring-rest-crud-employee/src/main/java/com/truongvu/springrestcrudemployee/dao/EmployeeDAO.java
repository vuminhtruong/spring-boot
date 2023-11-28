package com.truongvu.springrestcrudemployee.dao;

import com.truongvu.springrestcrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
