package com.springboot.auctionservice.exception;
import com.springboot.auctionservice.model.ErrorInfo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("unused")
@ResponseStatus(HttpStatus.BAD_REQUEST)

public class ReservePriceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private List<ErrorInfo> errors;
	public List<ErrorInfo> getErrors() {
        return this.errors;
	}
	
	public ReservePriceException()
	{
		super();
	}
	public ReservePriceException(final String message,final Throwable throwable){
		super(message,throwable);
	}
	public ReservePriceException(List<ErrorInfo> errors){
		super();
        this.errors = errors;
	}
	public ReservePriceException(final String message){
		super(message);
	}
	
	
}

