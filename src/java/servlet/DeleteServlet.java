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

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
   private static final String DB_URL = "jdbc:postgresql://localhost:5432/form";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "3200";
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get the ID of the data to be deleted from the request parameters
        int id = Integer.parseInt(request.getParameter("id"));
        
        // Create a connection to the database
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Create the SQL statement
            String sql = "DELETE FROM admission WHERE id=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            
            // Execute the statement
            int rowsDeleted = statement.executeUpdate();
            
            if (rowsDeleted > 0) {
                response.getWriter().println("Data deleted successfully!");
                response.sendRedirect("View.jsp");
            } else {
                response.getWriter().println("No data deleted!");
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
