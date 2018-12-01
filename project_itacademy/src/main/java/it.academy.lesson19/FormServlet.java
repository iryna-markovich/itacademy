package it.academy.lesson19;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = "/addplumber")
public class FormServlet extends HttpServlet {
    private PlumberWorkers plumberWorkers = PlumberWorkers.INSTANCE;

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        plumberWorkers.addPlumber(
                new Plumber(
                        request.getParameter("name"),
                        Integer.valueOf(request.getParameter("experience")),
                        Boolean.valueOf(request.getParameter("fresh"))
                ));
        PrintWriter out = response.getWriter();
        out.println(plumberWorkers);
    }
}