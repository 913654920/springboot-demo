package com.zxf.demo.application.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxf.demo.application.StudentService;
import com.zxf.demo.mapper.StudentMapper;
import com.zxf.demo.web.request.InsertStudentRequest;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;

	@Override
	public int insertStudent(InsertStudentRequest request) {
		int i = studentMapper.insertStudent(request);
		return i;
	}
}
