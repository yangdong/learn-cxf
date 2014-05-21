package org.thoughtworks.web.listener;

import org.apache.log4j.Logger;
import org.springframework.format.annotation.DateTimeFormat;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.*;
import java.util.Date;
import java.util.Enumeration;

public class SessionListener implements HttpSessionListener, HttpSessionAttributeListener {
    private static final Logger LOGGER = Logger.getLogger(SessionListener.class);
    public SessionListener() {
    }

    public void sessionCreated(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        LOGGER.info(String.format("Http session has been created at %s with session id=%s",
                    session.getCreationTime(), session.getId()));
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        LOGGER.info("Http session has been destroyed!");
    }

    public void attributeAdded(HttpSessionBindingEvent sbe) {
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {

    }
}
