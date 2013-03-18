package org.thoughtworks.api.exception;

import org.thoughtworks.api.model.exception.PostContentDetailsException;

public class PostContainsIllegalException extends RuntimeException {
    private String type;
    private String details;

    public PostContainsIllegalException(String details) {
        this.details = details;
        this.type = "post content illegal";
    }


    public PostContentDetailsException getDetails() {
        return new PostContentDetailsException("post content illegal", this.details);
    }
}
