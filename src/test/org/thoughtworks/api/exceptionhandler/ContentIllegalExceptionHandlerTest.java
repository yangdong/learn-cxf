package org.thoughtworks.api.exceptionhandler;

import org.junit.Test;
import org.thoughtworks.api.exception.PostContainsIllegalException;
import org.thoughtworks.api.model.exception.PostContentDetailsException;

import javax.ws.rs.core.Response;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ContentIllegalExceptionHandlerTest {
    @Test
    public void shouldCreateResponseWithDetails() throws Exception {
        ContentIllegalExceptionHandler handler = new ContentIllegalExceptionHandler();
        Response response = handler.toResponse(new PostContainsIllegalException("content illegal"));

        assertThat((PostContentDetailsException)response.getEntity(), is(new PostContentDetailsException("post content illegal", "content illegal")));
    }
}
