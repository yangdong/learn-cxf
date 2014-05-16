package org.thoughtworks.servlet;

import org.apache.log4j.Logger;
import org.thoughtworks.io.StreamPipe;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StaticContentServlet extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(StaticContentServlet.class);
    static {
        LOGGER.info("StaticContentServlet has been loaded!");
    }

    public static final String STATIC_HTML = "staticHtml";

    public StaticContentServlet() {
        LOGGER.info("StaticContentServlet has been initialized!");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        String staticHtml = getServletConfig().getInitParameter(STATIC_HTML);

        StreamPipe.pipe(getServletContext().getResourceAsStream(staticHtml), outputStream).transfer();
    }

}
