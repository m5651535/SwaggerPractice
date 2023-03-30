package com.example.practiceSwagger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "myApi", tags = "測試swagger")
public class HelloController {
	
    @ApiResponses(value = {
    		@ApiResponse(code = 200, message = "nice"),
            @ApiResponse(code = 201, message = "User created successfully"),
            @ApiResponse(code = 400, message = "Invalid input"),
            @ApiResponse(code = 409, message = "User already exists")
    })
	@ApiOperation("hello的接口")
    @PostMapping("/hello")
    public String hello(HelloInput input) {
        return input.getWording();
    }
}
