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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostContentDetailsException that = (PostContentDetailsException) o;

        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    public String getType() {
        return type;

    }
}
