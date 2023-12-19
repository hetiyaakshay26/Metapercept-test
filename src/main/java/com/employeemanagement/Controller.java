package com.employeemanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    EmployeeDAO employeeDAO;
    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        System.out.println("in get emp");
        return employeeDAO.getEmployee();
    }
    @PostMapping("/addemployee")
    public void addEmployee(@RequestBody Employee employee){
        employeeDAO.addEmployee(employee);
    }
    @PutMapping("/editemployee")
    public void edidEmployee( @RequestBody Employee employee){
      employeeDAO.editEmployee(employee);
    }
    @DeleteMapping("/deleteemployee/{}")
    public void deleteEmployee(@RequestParam String id){
      employeeDAO.deleteEmp(Integer.parseInt(id));
    }
}
