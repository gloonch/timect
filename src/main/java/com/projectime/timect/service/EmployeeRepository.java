package com.projectime.timect.service;

import com.projectime.timect.model.Employee;
import org.springframework.data.repository.Repository;

@org.springframework.stereotype.Repository
public interface EmployeeRepository extends Repository<Employee, Long> {
}
