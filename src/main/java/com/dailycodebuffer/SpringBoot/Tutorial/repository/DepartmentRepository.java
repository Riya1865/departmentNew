package com.dailycodebuffer.SpringBoot.Tutorial.repository;

import com.dailycodebuffer.SpringBoot.Tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
