package org.thoughtworks.api.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import javax.servlet.http.HttpServletResponse;

public class CachePostInterceptor extends AbstractPhaseInterceptor<Message>{

    public CachePostInterceptor() {
        super(Phase.MARSHAL);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        HttpServletResponse response = (HttpServletResponse) message.get("HTTP.RESPONSE");
        response.setHeader("ETag", "fake-etag");
    }
}
