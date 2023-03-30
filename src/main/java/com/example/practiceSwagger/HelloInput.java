package com.example.practiceSwagger;

import io.swagger.annotations.ApiModelProperty;

public class HelloInput {
	@ApiModelProperty(value = "User ID", example = "1")
	private String wording;

	public String getWording() {
		return wording;
	}

	public void setWording(String wording) {
		this.wording = wording;
	}
	
}
