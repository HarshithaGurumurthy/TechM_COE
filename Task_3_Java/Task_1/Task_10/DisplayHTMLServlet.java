package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayHTMLServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Get the PrintWriter to write response
        PrintWriter out = response.getWriter();

        // Get the HTML file from the WebContent folder
        String filePath = getServletContext().getRealPath("/index.html");
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null) {
            out.println(line);
        }
        reader.close();
    }
}
