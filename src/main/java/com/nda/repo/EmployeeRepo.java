package com.nda.repo;

import com.nda.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    Optional<Employee> findByEmail(String email);
    @Query("SELECT e FROM Employee e ORDER BY id DESC")
    List<Employee> orderBySalary();
}