package controller;
import java.io.*;
import java.util.*;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class FishListServlet extends HttpServlet {
    private static final String DB_URL = "jbdc:derby:fishdb";
    private static final String DB_USER = "";
    private static final String DB_PASS = "";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        List<Fish> fishList = new ArrayList<>();

        try {
            Class.forName("org.apach.derby.jdbc.EmbeddeDriver");

            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

            String sql = "SELECT id, fish_name, price, feature, status, stock FROM fish";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Fish fish = new Fish(
                    rs.getString("fish_name"),
                    rs.getInt("price"),
                    rs.getString("feature"),
                    rs.getString("status"),
                    rs.getInt("stock")
                );
                fishList.add(fish);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        req.setAttribute("fishList", fishList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/list.jsp");
        dispatcher.forward(req, res);
    }
}