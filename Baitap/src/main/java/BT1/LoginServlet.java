package BT1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException {
      String userName = request.getParameter("username");
      String password = request.getParameter("password");
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<html>\n" + "<head><title>" + "Welcome" + "</title><head>\n");
     
      if (userName != "" && password != "")
         out.println("<h3>Welcome " + userName + "</h3>");
      else
    	  out.println("<h3 style='color: Red;'>No input, Please enter some</h3>");
      out.println("</body>");
      out.println("</html>");
   }
   public void doPost(HttpServletRequest request, 
                      HttpServletResponse response)
         throws IOException, ServletException {
      doGet(request, response);
   }
}
