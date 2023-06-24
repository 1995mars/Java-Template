package com.mars.template_annotation.controller;

import com.mars.template_annotation.dao.MyData;
import com.mars.template_annotation.dao.Password;
import com.mars.template_annotation.dao.Student;
import com.mars.template_annotation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private StudentService service;
    @PostMapping("") // Thay đổi thành @PostMapping
    public MyData home(@RequestBody MyData myData) {
//        service.findAllProducts();
        return myData;
    }

//    @PostMapping("") // Thay đổi thành @PostMapping
//    public Password home(@Validated @RequestBody Password password) {
//        return password;
//    }
}