package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;

public class AddFishServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        String fishName = req.getParameter("fishName");
        String priceStr = req.getParameter("price");
        String feature = req.getParameter("feature");
        String status = req.getParameter("status");
        String stockStr = req.getParameter("stock");

        int price = Integer.parseInt(priceStr);
        int stock = Integer.parseInt(stockStr);

        Fish fish = new Fish(fishName, price, feature, status, stock);

        List<Fish> fishList = FishListServlet.getFistList();

        fishList.add(fish);

        res.sendRedirect("list");
    }


}
