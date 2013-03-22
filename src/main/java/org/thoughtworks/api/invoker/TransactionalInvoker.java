package org.thoughtworks.api.invoker;

import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.jaxrs.model.OperationResourceInfo;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;
import org.apache.cxf.message.Exchange;
import org.apache.cxf.service.invoker.AbstractInvoker;

public class TransactionalInvoker extends AbstractInvoker {

    @Override
    public Object getServiceObject(Exchange exchange) {
        Object root = exchange.remove(JAXRSUtils.ROOT_INSTANCE);
        if (root != null) {
            return root;
        }

        OperationResourceInfo ori = exchange.get(OperationResourceInfo.class);
        ClassResourceInfo cri = ori.getClassResourceInfo();

        return cri.getResourceProvider().getInstance(exchange.getInMessage());
    }
}
