package com.ticketex.counter.rest.error;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class CounterIllegalArgumentException extends WebApplicationException{

	private static final long serialVersionUID = 3957914755222668643L;

	public CounterIllegalArgumentException(String message) {
	    super(Response.status(Status.BAD_REQUEST).
	    		entity(new CounterErrorResponce(message)).type("application/json").build());
	}
	
}
