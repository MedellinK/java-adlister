package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.PizzaPostServlet", urlPatterns = "/pizza")
public class PizzaPostServlet extends HttpServlet{

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String crust = request.getParameter("crust");
            String size = request.getParameter("size");
            String sauce = request.getParameter("sauce");
            String[] toppings = request.getParameterValues("toppings");
            String address = request.getParameter("address");

            models.Pizza submittedPizza = new models.Pizza(crust, size, sauce, toppings, address);
            request.setAttribute("pizza", submittedPizza);
            request.getRequestDispatcher("/pizza_order.jsp").forward(request, response);
            System.out.println(crust);
            System.out.println(size);
            System.out.println(sauce);
            for (String topping : toppings ) {
                System.out.println(topping);
            }
            System.out.println(address);



        }
}
