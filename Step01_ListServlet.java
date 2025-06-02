import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Step01_ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/list.jsp");
        dispatcher.forward(req, res);
    }
}