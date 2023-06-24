package com.mars.template_annotation.dao;

import com.mars.template_annotation.annotation.NotEmptyExt;
import lombok.Data;

@Data
public class Password {
    @NotEmptyExt(label = "username", message = "{field.notempty}")
    private String username;
}
