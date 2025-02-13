package com.cogni.employee.service;

import com.cogni.employee.entity.Employee;
import java.util.List;

/**
 * Service interface for managing Employee entities.
 */
public interface EmployeeService {
    
    /**
     * Adds a new employee.
     * @param employee the employee to add
     * @return the added employee
     */
    Employee addEmployee(Employee employee);
    
    /**
     * Retrieves all employees.
     * @return a list of employees
     */
    List<Employee> getAllEmployees();
    
    /**
     * Retrieves an employee by ID.
     * @param id the ID of the employee
     * @return the employee, or null if not found
     */
    Employee getEmployeeById(Long id);
    
    /**
     * Deletes an employee by ID.
     * @param id the ID of the employee to delete
     * @return a message indicating the result of the operation
     */
    String deleteEmployee(Long id);
    
    /**
     * Updates an existing employee.
     * @param id the ID of the employee to update
     * @param employee the updated employee data
     * @return the updated employee, or null if not found
     */
    Employee updateEmployee(Long id, Employee employee);
}