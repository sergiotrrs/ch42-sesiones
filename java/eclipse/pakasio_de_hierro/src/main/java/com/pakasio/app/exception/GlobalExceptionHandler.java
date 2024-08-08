package com.pakasio.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice // Este componente se utiliza para manejar excepciones globalmente
public class GlobalExceptionHandler {
	
	ErrorDetails errorDetails;
	
	public GlobalExceptionHandler(ErrorDetails errorDetails) {
		this.errorDetails = errorDetails;		
	}
	
	@ExceptionHandler(IllegalStateException.class)
	ResponseEntity<ErrorDetails> handleIllegalStateException(Exception exception, WebRequest webRequest ){
		errorDetails.setTimestamp( LocalDateTime.now() );
		errorDetails.setMessage( exception.getMessage()  );
		errorDetails.setPath( webRequest.getDescription(false) );
		errorDetails.setErrorCode("Resource not found");
		
		return new ResponseEntity<ErrorDetails>( errorDetails, HttpStatus.NOT_FOUND );
	}

}

