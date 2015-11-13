package com.ticketex.counter.logging;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Logged
@Provider
public class RequestLoggingFilter implements ContainerRequestFilter{

	private final Logger log = LoggerFactory.getLogger(RequestLoggingFilter.class);
	
	public void filter(ContainerRequestContext req) throws IOException {
		
	  URI url = req.getUriInfo().getRequestUri();
	  String method = req.getMethod();
	  String log = method+" "+url;
		
	  // extract json data
	  if(req.getEntityStream() != null){
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    IOUtils.copy(req.getEntityStream(), baos);
	    byte[] bytes = baos.toByteArray();
	    log+=" "+new String(bytes, "UTF-8");
	    log = log.replaceAll("\t", "").replaceAll("\n", "");
	    req.setEntityStream(new ByteArrayInputStream(bytes));
	   }
		 
	  this.log.info(log);
	}
	 
}
