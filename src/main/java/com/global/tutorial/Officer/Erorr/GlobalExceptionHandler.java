package com.global.tutorial.Officer.Erorr;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	public GlobalExceptionHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<?> handleNotFound(NotFoundException ex){
		
		ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage(),Arrays.asList(ex.getMessage()));
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
		.body(error);
			
	}

}
