package com.mars.template_annotation.controller;

import com.mars.template_annotation.dao.MyData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @PostMapping("") // Thay đổi thành @PostMapping
    public MyData home(@RequestBody MyData myData) {
        return myData;
    }
}