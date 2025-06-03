package controller;
import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class EditFishServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int index = Integer.parseInt(req.getParameter("index"));
        Fish fish = FishListServlet.getFistList().get(index);

        req.setAttribute("fish", fish);
        req.setAttribute("index", index);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/edit.jsp");
        dispatcher.forward(req, res);
    }
}
