package org.thoughtworks.api;

import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

import javax.ws.rs.core.Response;

public class RequestCheck implements RequestHandler {
    @Override
    public Response handleRequest(Message m, ClassResourceInfo resourceClass) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
