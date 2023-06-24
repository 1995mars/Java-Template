package com.mars.template_annotation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.util.StringUtils;



public class NotEmptyExtValidator implements ConstraintValidator<NotEmptyExt, String> {

    private NotEmptyExt notEmptyExt;

    @Override
    public void initialize(NotEmptyExt constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        this.notEmptyExt = constraintAnnotation;
    }

    @Override
    public boolean isValid(String fieldValue, ConstraintValidatorContext constraintValidatorContext) {
        if (StringUtils.isEmpty(fieldValue)) {
            return false;
        }
        return true;
    }
}
