package org.thoughtworks.api.exceptionhandler;

import org.thoughtworks.api.exception.PostContainsIllegalException;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@Produces("application/json")
public class ContentIllegalExceptionHandler implements ExceptionMapper<PostContainsIllegalException> {
    @Override
    public Response toResponse(PostContainsIllegalException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(exception.getDetails())
                .build();
    }
}
