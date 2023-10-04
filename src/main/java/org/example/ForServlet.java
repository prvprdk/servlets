package org.example;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = {"/for"})
public class ForServlet  extends HttpServlet {
    String [] daysOfWeek = new String [] {"monday", "tuesday", "wednesday", "thursday", "saturday", "sunday"};
   String numbers = "1, 2, 3, 4, 5";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        req.setAttribute("days", daysOfWeek);
        req.setAttribute("numbers", numbers);
        getServletContext().getRequestDispatcher("/for.jsp").forward(req,resp);
    }
}
