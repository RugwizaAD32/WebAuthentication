package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/form";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "3200";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get the data from the request parameters
        int id = Integer.parseInt(request.getParameter("id"));
        String fname = request.getParameter("fname");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
//        int age = Integer.parseInt(request.getParameter("age"));
        
        // Create a connection to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Create the SQL statement
            String sql = "UPDATE admission SET email=?,fname=?,password=?, phonenumber=?  WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, fname);
            statement.setString(2, email);
            statement.setString(3, phone);
            statement.setString(4, password);
            statement.setInt(5, id);
            
            // Execute the statement
            int rowsUpdated = statement.executeUpdate();
            
            if (rowsUpdated > 0) {
                response.getWriter().println("Data updated successfully!");
                response.sendRedirect("View.jsp");
            } else {
                response.getWriter().println("No data updated!");
            }
        } catch (SQLException e) {
            response.getWriter().println("Error: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                response.getWriter().println("Error: " + e.getMessage());
            }
        }
    }
}
