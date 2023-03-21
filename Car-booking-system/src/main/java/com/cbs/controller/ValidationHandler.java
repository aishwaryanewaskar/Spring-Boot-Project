package com.cbs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler 
{
   
	 @RequestMapping("/error")
	    public String handleError(HttpServletRequest request) 
	 {
	        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	        if (status != null) 
	        {
	            Integer statusCode = Integer.valueOf(status.toString());

	            if(statusCode == HttpStatus.NOT_FOUND.value()) 
	            {
	                return "error";
	            }
	            
	            else 
	            	if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) 
	                 {
	                    return "error";
	                 } 
	            else 
	            	if(statusCode == HttpStatus.BAD_REQUEST.value()) 
	            	{
	            		
	                return "error";
	                
	                }
	        }
	           return "error";
	    }
}
