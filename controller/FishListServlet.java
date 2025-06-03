package controller;
import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FishListServlet extends HttpServlet {
    private static List<Fish> fishList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        List<Fish> fishList = getFistList();

        req.setAttribute("fishList", fishList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/list.jsp");
        dispatcher.forward(req, res);
    }

    public static List<Fish> getFistList() {
        return fishList;
    }
}