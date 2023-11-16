package BT1_2;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/form")
/**
 * Servlet implementation class FormMultiValuesDemo
 */

public class FormMultiValuesDemo extends HttpServlet {

       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
         
		  PrintWriter out = response.getWriter();

	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Form Multi Values Demo</title>");
	        out.println("</head>");
	        out.println("<body>");

	        // Lấy mảng các giá trị của tham số "topic"
	        String[] topics = request.getParameterValues("topic");

	        if (topics != null && topics.length > 0) {
	            out.println("<h3>Selected Topics:</h3>");
	            out.println("<ul>");

	            for (String topic : topics) {
	                out.println("<li>" + topic + "</li>");
	            }

	            out.println("</ul>");
	        } else {
	            out.println("<h3>No topics selected.</h3>");
	        }

	        out.println("</body>");
	        out.println("<h3>Array Values:</h3>");
	        out.println("<ul>");
	        for (int i = 0; i < topics.length; i++) {
	        	out.println("<li>" + topics[i] + "</li>");
	        }
	        out.println("</ul>");
	        // Lấy chiều dài của mảng
	        int length = topics.length;
	        out.println("<p>Array Length: " + length + "</p>");
	        out.println("</html>");

	        out.close();
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

