package com.sulavko.spring.rest.dao;

import com.sulavko.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEployee(int id);

    public void deleteEmplotee(int id);
}
