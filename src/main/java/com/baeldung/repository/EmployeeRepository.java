package com.baeldung.repository;

import com.baeldung.exception.EmployeeAlreadyExists;
import com.baeldung.exception.EmployeeNotFound;
import com.baeldung.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
    Employee getEmployee(int id) throws EmployeeNotFound;
    Employee updateEmployee(int id, String name) throws EmployeeNotFound;

    boolean deleteEmployee(int id) throws EmployeeNotFound;

    Employee addEmployee(int id, String name) throws EmployeeAlreadyExists;

    int count();

}
