package com.mars.template_annotation.dao;

import com.mars.template_annotation.annotation.LengthCheck;
import lombok.Data;

@Data
public class MyData {

    @LengthCheck(maxLength = 3)
    private String name;

    @LengthCheck(maxLength = 3)
    private String description;

    // getters and setters
}