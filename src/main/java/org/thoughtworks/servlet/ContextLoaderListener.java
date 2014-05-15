package org.thoughtworks.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    public ContextLoaderListener() {
    }

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("SERVLET CONTEXT INITIALIZED: " + getClass().getName() + " is handling the context initialized event");
        System.out.println("Spring has loaded all the bean definition and resolved all dependencies!");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("SERVLET CONTEXT DESTROYED: " + "Oh I am dead, say you later!");
    }
}
