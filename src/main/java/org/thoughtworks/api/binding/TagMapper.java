package org.thoughtworks.api.binding;

import org.apache.cxf.jaxrs.ext.ParameterHandler;
import org.thoughtworks.api.model.Tag;

public class TagMapper implements ParameterHandler<Tag>{
    @Override
    public Tag fromString(String s) {
        return Tag.fromString(s);
    }
}
