//package com.truongvu.springrestcrudemployee.rest;
//
//import com.truongvu.springrestcrudemployee.dao.EmployeeDAO;
//import com.truongvu.springrestcrudemployee.entity.Employee;
//import com.truongvu.springrestcrudemployee.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("api")
//public class EmployeeRestController {
//    private EmployeeService employeeService;
//
//    @Autowired
//    public EmployeeRestController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> findAll() {
//        return employeeService.findAll();
//    }
//
//    @GetMapping("/employees/{employeeId}")
//    public Employee getEmployee(@PathVariable int employeeId){
//        Employee employee = employeeService.findById(employeeId);
//
//        if(employee == null) {
//            throw new RuntimeException("Exception id not found - " + employeeId);
//        }
//
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addEmployee(@RequestBody Employee employee) {
//        employee.setId(0);
//        Employee dbEmployee = employeeService.save(employee);
//        return dbEmployee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        Employee dbEmployee = employeeService.save(employee);
//        return dbEmployee;
//    }
//
//    @DeleteMapping ("/employees/{employeeId}")
//    public String deleteEmployee(@PathVariable int employeeId) {
//        Employee tempEmployee = employeeService.findById(employeeId);
//        if(tempEmployee == null) {
//            throw new RuntimeException("Employee id not found - " + employeeId);
//        }
//        employeeService.deleteById(employeeId);
//        return "Delete employee id - " + employeeId;
//    }
//}
