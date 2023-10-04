package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/main"})
public class JspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Car> cars = new ArrayList<Car>() {{
            add(new Car("audi", Color.black, "1994"));
            add(new Car("mazda", Color.RED, "1994"));
            add(new Car("lada", Color.WHITE, "1994"));
        }};
        req.setAttribute("cars", cars);
        getServletContext().getRequestDispatcher("/main.jsp").forward(req, resp);
    }
}
