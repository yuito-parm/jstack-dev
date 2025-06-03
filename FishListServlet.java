import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import model.Fish;

public class FishListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
            List<Fish> fishList = AddFishServlet.getFistList();

            req.setAttribute("fishList", fishList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/list.jsp");
        dispatcher.forward(req, res);
    }
}