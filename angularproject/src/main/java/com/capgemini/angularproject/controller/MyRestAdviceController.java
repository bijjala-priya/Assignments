package com.capgemini.angularproject.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.angularproject.bean.ProductResponse;
import com.capgemini.angularproject.exception.ProductException;

@RestController
public class MyRestAdviceController {
	
	@ExceptionHandler
	public ProductResponse myExceptionHandler(ProductException proException) {
		
		ProductResponse response=new ProductResponse();
		response.setError(true);
		response.setMessage(proException.getMessage());
		
		return response;
		
	}

}
