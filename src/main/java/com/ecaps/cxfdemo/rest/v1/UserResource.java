package com.ecaps.cxfdemo.rest.v1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.ecaps.cxfdemo.rest.v1.model.Hello;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/")
@Api(value = "User resource Version 1", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UserResource {
	@GET
	@Path("v1/user/{name}")
	@ApiOperation(value = "Gets a user resource. Version 1 - (version in URL)")
	@ApiResponses(value = { 
		@ApiResponse(code = 200, message = "User resource found", response = Hello.class),
		@ApiResponse(code = 404, message = "User resource not found")
	})
	Response getUser(@PathParam("name") @ApiParam(value = "The name") String name);
}
