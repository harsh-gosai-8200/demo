package com.springboot.rest_api_jparepository.services;

import com.springboot.rest_api_jparepository.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deletebyId(int id);

}
