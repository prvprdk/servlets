package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.*;
import java.util.UUID;
import java.util.stream.Collectors;

@WebServlet (urlPatterns = {"img-servlet"})
@MultipartConfig (location = "/home/prvprdk/projects/servlets")
public class FileServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

         for (Part part : req.getParts()){
             if (part.getName().equals("img-name")){
                 InputStreamReader inputStreamReader = new InputStreamReader(part.getInputStream());
                 String imgName = new BufferedReader(inputStreamReader).lines().collect(Collectors.joining("\n"));
                 log(imgName);
             } else {
                 part.write(UUID.randomUUID().toString() + part.getName());
             }
             resp.sendRedirect("/test/cool-servlet");
        }

    }
}
