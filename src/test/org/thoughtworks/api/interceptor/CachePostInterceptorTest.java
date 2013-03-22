package org.thoughtworks.api.interceptor;

import org.apache.cxf.message.Message;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CachePostInterceptorTest {
    private CachePostInterceptor interceptor;
    private Message message;
    private HttpServletResponse servletResponse;

    @Before
    public void setUp() throws Exception {
        interceptor = new CachePostInterceptor();
        message = mock(Message.class);

        servletResponse = mock(HttpServletResponse.class);
        when(message.get("HTTP.RESPONSE")).thenReturn(servletResponse);
    }

    @Test
    public void shouldAddEtagIntoHttpResponse() throws Exception {
        interceptor.handleMessage(message);

        verify(servletResponse).setHeader("ETag", "fake-etag");
    }
}
