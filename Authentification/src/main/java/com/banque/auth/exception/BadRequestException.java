package com.banque.auth.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 620308085064384196L;
	
	private static final Logger logger = LoggerFactory.getLogger(BadRequestException.class);
	
	public BadRequestException(String message) {
        super(message);
        logger.error(message);
    }
	

}
