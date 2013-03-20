package org.thoughtworks.api;

import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.Collections;

public class RequestCheck implements RequestHandler {
    @Override
    public Response handleRequest(Message m, ClassResourceInfo resourceClass) {
        HttpServletRequest request = (HttpServletRequest) m.get("HTTP.REQUEST");
        String accept = request.getHeader("Accept");
        Produces annotation = resourceClass.getResourceClass().getAnnotation(Produces.class);

        for (String value : annotation.value()) {
            if (value.equals(accept)) {
                return null;
            }
        }

        return Response.status(Response.Status.BAD_REQUEST)
                .entity("{\"error\":\"this service can't produce " + accept + "}")
                .build();
    }
}
