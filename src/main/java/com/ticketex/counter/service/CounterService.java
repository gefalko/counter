package com.ticketex.counter.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ticketex.counter.model.Counter;
import com.ticketex.counter.model.StatisticCounter;
import com.ticketex.counter.rest.error.CounterIllegalArgumentException;
import com.ticketex.counter.rest.error.CounterNotFoundException;

public class CounterService {
	
  private Map<String, StatisticCounter> counters = new HashMap<String, StatisticCounter>();
  private static CounterService instance = null;
  protected CounterService() {}
	   
  public static CounterService getInstance() {
    if(instance == null)instance = new CounterService();
    return instance;
  }
    
  public StatisticCounter get(String name){
    StatisticCounter c =  counters.get(name);
    if(c == null)throw new CounterNotFoundException("Counter "+name+" not exist");
    return c;
  }
    
  public void put(String name){
    if(name==null)throw new CounterIllegalArgumentException("null can`t be as name");
    if(counters.get(name)!=null)throw new CounterIllegalArgumentException("Counter "+name+" exist");
    counters.put(name, new Counter(name));
  }
    
  public void put(Counter counter){
    if(counter==null)throw new CounterIllegalArgumentException("null can`t be as counter");
    if(counters.get(counter.getName())!=null)throw new CounterIllegalArgumentException("Counter "+counter.getName()+" exist");
    counters.put(counter.getName(),counter);
  }
    
  public void setValue(String name,int value){
    this.get(name).setValue(value);	
  }
    
  public void increase(String name, int value) {
    this.get(name).increaseValue(value);
  }

    
  public void remove(String name){
    this.get(name); // check or exist
    counters.remove(name);
  }
    
  public List<StatisticCounter> getAll(){
    return new ArrayList<StatisticCounter>(counters.values());
  }

}
