package com.truongvu.springrestcrudemployee.service;

import com.truongvu.springrestcrudemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
