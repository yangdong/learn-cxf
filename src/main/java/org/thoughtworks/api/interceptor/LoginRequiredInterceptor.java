package org.thoughtworks.api.interceptor;

import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import java.util.logging.Logger;

public class LoginRequiredInterceptor extends AbstractPhaseInterceptor<Message> {
    private static final Logger LOG = LogUtils.getL7dLogger(LoginRequiredInterceptor.class);

    public LoginRequiredInterceptor() {
        super(Phase.UNMARSHAL);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        LOG.warning("this is the in interceptor in the unmarshal phase!");
    }
}
