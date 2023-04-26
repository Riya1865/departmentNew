package com.dailycodebuffer.SpringBoot.Tutorial.controller;

import com.dailycodebuffer.SpringBoot.Tutorial.entity.Department;
import com.dailycodebuffer.SpringBoot.Tutorial.service.DepartmentService;
import com.dailycodebuffer.SpringBoot.Tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment (@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
}
