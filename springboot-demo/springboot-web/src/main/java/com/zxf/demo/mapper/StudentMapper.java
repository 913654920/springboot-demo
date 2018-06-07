package com.zxf.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.zxf.demo.web.request.InsertStudentRequest;

@Mapper
public interface StudentMapper {
	public int insertStudent(InsertStudentRequest request);
}
