package com.wiredbrain.friends.controller;

import javax.xml.bind.ValidationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wiredbrain.friends.util.ErrorMessage;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ResponseBody
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler
	ErrorMessage exceptionHanlder(ValidationException e) {
		return new ErrorMessage("400", e.getMessage());
	}
}
