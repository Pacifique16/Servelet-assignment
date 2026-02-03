import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Login Page</title>");
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
        out.println("<h2>Login Page</h2>");
        out.println("<form method='post' action='login'>");
        out.println("Username: <input type='text' name='username' required><br><br>");
        out.println("Password: <input type='password' name='password' required><br><br>");
        out.println("<button type='submit'>Login</button>");
        out.println("</form>");
        out.println("</div>");
        out.println("<footer class='footer'>© 2026 - WebAssignment</footer>");
        out.println("</body></html>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Login Result</title>");
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
        
        if (password.length() < 8) {
            out.println("<h2>Hello " + username + ", your password is weak. Try a strong one.</h2>");
        } else {
            out.println("<h2>Welcome " + username + "</h2>");
        }
        
        out.println("</div>");
        out.println("<footer class='footer'>© 2026 - WebAssignment</footer>");
        out.println("</body></html>");
    }
}