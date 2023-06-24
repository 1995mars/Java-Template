package com.mars.template_annotation.annotation;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = NotEmptyExtValidator.class)
public @interface NotEmptyExt {
    String message() default "";
    String label();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
