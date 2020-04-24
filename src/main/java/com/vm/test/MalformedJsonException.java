package com.vm.test;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MalformedJsonException extends Exception {
	
    private static final long serialVersionUID = -1144005343054070298L;
	
	public MalformedJsonException(String message) {
		super(message);
	}
}
