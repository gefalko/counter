package com.ticketex.counter.rest.error;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class CounterNotFoundException extends WebApplicationException{

	private static final long serialVersionUID = -761449470377824021L;

	public CounterNotFoundException(String message) {
		super(Response.status(Status.NOT_FOUND).
				entity(new CounterErrorResponce(message)).type("application/json").build());
	}
}
