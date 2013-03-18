package org.thoughtworks.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces( "application/json" )
public class HelloService {

    @GET
    @Path("/ge")
    public Response welcome(@Context HttpServletRequest request, @Context HttpServletResponse response) {
        return Response.status(Response.Status.OK).entity("{\"fuck\" : \"you\"}").build();
    }
}
