package com.zxf.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zxf.demo.application.StudentService;
import com.zxf.demo.web.request.InsertStudentRequest;
import com.zxf.demo.web.response.InsertStudentResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/StudentController")
@Api(tags = "StudentController", description = "学生信息及操作")
public class StudentController {
	@Autowired
	StudentService studentService;

@RequestMapping(value = "/insertStudent", method = { RequestMethod.POST })
@ResponseBody
@ApiOperation(value = "插入学生")
public InsertStudentResponse insertStudent(@RequestBody InsertStudentRequest request) {
	int i=studentService.insertStudent(request);
	InsertStudentResponse response =new InsertStudentResponse();
	response.setI(i);
	return response;
}
}
