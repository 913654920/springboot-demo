package com.zxf.demo.web.request;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@ApiModel
public class InsertStudentRequest implements Serializable {

	private static final long serialVersionUID = 7330864312163926661L;
	@ApiModelProperty(value="姓名",example="张三",dataType="String")
	private String name;
	@ApiModelProperty(value="年龄",example="19",dataType="String")
	private String age;
}
