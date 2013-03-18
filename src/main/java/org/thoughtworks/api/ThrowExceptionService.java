package org.thoughtworks.api;

import org.thoughtworks.api.exception.PostContainsIllegalException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/exception")
@Consumes("application/json")
@Produces({"application/json", "application/xml"})
public class ThrowExceptionService {
    @GET
    public Response throwException() {
        throw new PostContainsIllegalException("this is post contains illegal keywords!!");
    }
}
