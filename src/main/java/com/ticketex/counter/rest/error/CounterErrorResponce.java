package com.ticketex.counter.rest.error;

public class CounterErrorResponce {
	
	private String error;

	public CounterErrorResponce(String msg) {
		this.error = msg;
	}
	
	public String getError() {
		return error;
	}
	
}
