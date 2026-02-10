package com.springboot.rest_api_jparepository.repository;

import com.springboot.rest_api_jparepository.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer > {
}
