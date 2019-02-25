package io.shijna.service;

import io.shijna.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findOne(String id);

    Employee create(Employee emp);

    Employee update(String id, Employee emp);

    void delete(String id);
}