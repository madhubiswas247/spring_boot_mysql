package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
