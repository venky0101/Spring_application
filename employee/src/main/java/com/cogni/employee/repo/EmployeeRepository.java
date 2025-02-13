package com.cogni.employee.repo;

import com.cogni.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Employee entity.
 * Provides CRUD operations through JpaRepository.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}