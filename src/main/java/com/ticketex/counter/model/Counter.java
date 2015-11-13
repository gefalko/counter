package com.ticketex.counter.model;

import com.ticketex.counter.rest.error.CounterIllegalArgumentException;

public class Counter implements StatisticCounter{
	
	private int value = 0;
	private String name;
	
	public Counter(){}
	
	public Counter(String name){
		this.setName(name);
	}
	
	public Counter(String name,int val) {
		this.setName(name);
		this.setValue(val);
	}

	public void setValue(int val) {
		if (val < 0) throw new CounterIllegalArgumentException("Value cannot be negative.");
		this.value = val;
	}

	public void increaseValue(int number) {
		if (number < 0) throw new CounterIllegalArgumentException("Value cannot be negative.");
		this.value += number;
	}

	public int getValue() {
		return this.value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
