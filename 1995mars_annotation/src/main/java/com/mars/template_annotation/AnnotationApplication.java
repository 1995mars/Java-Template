package com.mars.template_annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotationApplication.class, args);
	}

}
