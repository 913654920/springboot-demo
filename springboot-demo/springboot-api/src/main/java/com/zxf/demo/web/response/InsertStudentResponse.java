package com.zxf.demo.web.response;

import com.zxf.framework.web.dto.ResponseDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class InsertStudentResponse extends ResponseDTO {
	private static final long serialVersionUID = -8377776255953839272L;
	@ApiModelProperty(value = "返回值", dataType = "List")
	private int i;
}
