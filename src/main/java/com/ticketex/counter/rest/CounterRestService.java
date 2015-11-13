package com.ticketex.counter.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.ticketex.counter.logging.Logged;
import com.ticketex.counter.model.Counter;
import com.ticketex.counter.model.StatisticCounter;
import com.ticketex.counter.service.CounterService;

@Path("/rest")
@Logged
@Produces("application/json")
public class CounterRestService {
		
  @POST
  @Path("/create")
  public Response create(@QueryParam("name") String name) {
    CounterService.getInstance().put(name);
    return Response.status(200).build();	
  }
    
  @POST
  @Path("/insert")
  public Response create(Counter counter) {
    CounterService.getInstance().put(counter);
    return Response.status(200).build();
  }
    
  @DELETE
  @Path("/delete")
  public Response delete(@QueryParam("name") String name) {
    CounterService.getInstance().remove(name);
    return Response.status(200).build();
  }
    
  @PUT
  @Path("/setValue")
  public Response setValue(@QueryParam("name") String name,@QueryParam("value") int value) {
    CounterService.getInstance().setValue(name, value);
    return Response.status(200).build();
  }
    
  @PUT
  @Path("/increase")
  public Response increase(@QueryParam("name") String name,@QueryParam("value") int value) {	
    CounterService.getInstance().increase(name, value);
    return Response.status(200).build();
  } 
    
    
  @GET
  @Path("/getall")
  public List<StatisticCounter> getAll() {
    return CounterService.getInstance().getAll();
  }
    
   
  @GET
  @Path("/get")
  public  StatisticCounter getByName(@QueryParam("name") String name) {
    return CounterService.getInstance().get(name);
  }
   
}
