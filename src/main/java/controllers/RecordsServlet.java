package controllers;

import dao.RecordsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "controllers.Records", urlPatterns = "/records")
public class RecordsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RecordsDao recordsDao = new RecordsDao();


        req.setAttribute("records", records);
        req.getRequestDispatcher("/records.jsp").forward(req, resp);
    }

}
