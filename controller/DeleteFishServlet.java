package controller;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DeleteFishServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int index = Integer.parseInt(req.getParameter("index"));
        FishListServlet.getFistList().remove(index);

        res.sendRedirect("list");
    }
}
