package org.thoughtworks.api.provider;

import org.apache.cxf.jaxrs.provider.JSONProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.Provider;

@Produces("application/gson")
@Provider
public class GsonProvider extends JSONProvider {
}
