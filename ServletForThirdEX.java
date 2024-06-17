package org.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;


@WebServlet("/")
public class ServletForThirdEX extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        String code = request.getParameter("code");
        String result = Base64.getEncoder().encodeToString((email + ":" + code).getBytes());

        response.setContentType("text/plain");
        response.getWriter().println(
                result
        );
    }
}
