package com.example.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.Employee;

/** 
 * @author khushbu
 * @Description This class will use as a repository class which will communicate with the databases.
 *
 */
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}