package com.ticketex.counter.model;

public interface StatisticCounter {
	
	void setValue(int val);
	
	void increaseValue(int number);
	
	int getValue();
	
}
