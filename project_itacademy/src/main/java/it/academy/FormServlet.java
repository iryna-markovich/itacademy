package it.academy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "plumbers", urlPatterns = "/plumbers")
public class FormServlet extends HttpServlet {
    List<Plumber> plumbers = new ArrayList<>();

    public List<Plumber> getPlumbers() {
        return plumbers;
    }

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp)
            throws ServletException, IOException {
        plumbers.add(
                new Plumber(
                        req.getParameter("name"),
                        Integer.valueOf(req.getParameter("experience")),
                        Boolean.valueOf(req.getParameter("fresh"))
                ));
        req.setAttribute("plumbers", plumbers.getPlumbers());
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext()
                .getRequestDispatcher("/plumbers.jsp");
        dispatcher.forward(req, resp);
    }
}