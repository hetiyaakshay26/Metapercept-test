package com.employeemanagement;

import com.employeemanagement.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAO {

    @Autowired
    Employee employee;

    List<Employee> empList = new ArrayList<>();

    public List<Employee> getEmployee(){
        empList.add(new Employee(1,"Akshay","Hetiya"));
        empList.add(new Employee(2,"Vijay","Kumar"));
        return empList;
    }
    public void addEmployee(Employee employee){
        empList.add(employee);
        System.out.println(empList);
    }
    public void editEmployee(Employee employee){
        for(Employee e : empList){
            if(e.getId() == employee.getId()){
                e.setFname(employee.getFname());
                e.setLname(employee.getLname());
                System.out.println("emp edited");
            }
        }
    }
    public void deleteEmp(int id){
        for(Employee e : empList){
            if(e.getId()==id){
                empList.remove(e);
                System.out.println("emp deleted with id " + id);
            }
        }
    }
}
