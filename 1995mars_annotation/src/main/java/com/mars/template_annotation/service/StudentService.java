package com.mars.template_annotation.service;

import com.mars.template_annotation.annotation.Loggable;
import com.mars.template_annotation.dao.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

	@Loggable
	public List<Student> findAllProducts() {
		return null;
	}

}
