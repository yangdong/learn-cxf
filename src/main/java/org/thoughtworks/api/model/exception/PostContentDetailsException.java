package org.thoughtworks.api.model.exception;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PostContentDetailsException {
    public PostContentDetailsException() {
    }

    public String type;
    public String details;

    public PostContentDetailsException(String type, String details) {
        this.type = type;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public String getType() {
        return type;
    }
}
