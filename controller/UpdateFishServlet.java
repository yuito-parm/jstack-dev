package controller;

import java.io.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class UpdateFishServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int index = Integer.parseInt(req.getParameter("index"));
        String fishName = req.getParameter("fishName");
        int price = Integer.parseInt(req.getParameter("price"));
        String feature = req.getParameter("feature");
        String status = req.getParameter("status");
        int stock = Integer.parseInt(req.getParameter("stock"));

        Fish fish = FishListServlet.getFistList().get(index);
        fish.setFishName(fishName);
        fish.setPrice(price);
        fish.setFeature(feature);
        fish.setStatus(status);
        fish.setStock(stock);

        res.sendRedirect("list");
    }
}
