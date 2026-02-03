import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Search Redirect</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; }");
        out.println(".navbar { background-color: #f8f9fa; padding: 1rem; border-bottom: 1px solid #dee2e6; }");
        out.println(".navbar a { text-decoration: none; color: #007bff; margin-right: 2rem; font-weight: bold; }");
        out.println(".navbar a:hover { text-decoration: underline; }");
        out.println(".container { max-width: 800px; margin: 2rem auto; padding: 0 1rem; }");
        out.println(".footer { background-color: #f8f9fa; text-align: center; padding: 1rem; border-top: 1px solid #dee2e6; position: fixed; bottom: 0; width: 100%; }");
        out.println("</style></head><body>");
        out.println("<nav class='navbar'>");
        out.println("<a href='login'>WebAssignment</a>");
        out.println("<a href='login'>LOGIN</a>");
        out.println("<a href='redirect'>REDIRECT</a>");
        out.println("</nav>");
        out.println("<div class='container'>");
        out.println("<h2>Search Redirect</h2>");
        out.println("<form method='post' action='redirect'>");
        out.println("<input type='text' name='query' placeholder='Enter search term' required><br><br>");
        out.println("<button type='submit'>Fetch</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("<footer class='footer'>© 2026 - WebAssignment</footer>");
        out.println("</body></html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String query = request.getParameter("query");
        response.sendRedirect("https://www.google.com/search?q=" + query);
    }
}