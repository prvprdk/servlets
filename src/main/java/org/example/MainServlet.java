package org.example;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.stream.Collectors;

@WebServlet(urlPatterns = {"/cool-servlet", "/my-cool-servlet/*"})
public class MainServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Method init =)");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Method start service\n");
        super.service(req, resp);
        resp.getWriter().write("Method finished service\n");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestURI = req.getRequestURI();
        String parameterMap = getCollect(req);

        resp.getWriter().write("doGet service\n");
        resp.getWriter().write("Method doGet \nURI" + requestURI + "\nParams: \n" + parameterMap + "\n");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String requestURI = req.getRequestURI();
        String parameterMap = getCollect(req);

        resp.getWriter().write("doPost service\n");
        resp.getWriter().write("Method doPost \nURI" + requestURI + "\nParams: \n" + parameterMap + "\n");
    }

    @Override
    public void destroy() {
        log("Method destrou =)");
    }


    private static String getCollect(HttpServletRequest req) {
        return req.getParameterMap()
                .entrySet()
                .stream()
                .map(entry -> {
                    String param = String.join(" and ", entry.getValue());
                    return  entry.getKey() + " => " + param;
                })
                .collect(Collectors.joining("\n"));
    }
}

