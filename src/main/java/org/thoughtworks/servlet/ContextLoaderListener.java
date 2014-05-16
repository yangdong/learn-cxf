package org.thoughtworks.servlet;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {
    private static final Logger LOGGER = Logger.getLogger(ContextLoaderListener.class);

    public ContextLoaderListener() {
    }

    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("SERVLET CONTEXT INITIALIZED: " + getClass().getName() + " is handling the context initialized event");
        LOGGER.info("Spring has loaded all the bean definition and resolved all dependencies!");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("SERVLET CONTEXT DESTROYED: " + "Oh I am dead, say you later!");
    }
}
