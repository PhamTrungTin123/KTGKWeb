package BT1_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SubmitServlet
 */
public class SubmitServlet extends HttpServlet {
	  
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitServlet() {
        super();
      


       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		


		      // Kiem tra tinh hop le cua cac tham so
		      boolean ok = true;


		      // doc cac tham so
		      String firstName = request.getParameter("firstname");
		      String lastName = request.getParameter("lastname");
		      String email = request.getParameter("email");
		      String password = request.getParameter("password");
		      boolean nu = request.getParameter("sex").equalsIgnoreCase("nu");
		    
		      int yearOfBirth = 0;
			try {
		         yearOfBirth = Integer.parseInt(request.getParameter("yearOfBirth"));
		      } catch (NumberFormatException e) {
		         ok = false;
		      }
		      String industry = request.getParameter("industry");
		      String jobTitle = request.getParameter("jobtitle");
		      String company = request.getParameter("company");
		      String city = request.getParameter("city");
		      String telephone = request.getParameter("telephone");
		      String[] favorites = request.getParameterValues("favorite");
		      String desiredPlatform = request.getParameter("platform");


		      if ((firstName == null) || (firstName == "")) {
		         ok = false;
		      }
		      if ((lastName == null) || (lastName == "")) {
		         ok = false;
		      }
		      if ((email == null) || (email == "")) {
		         ok = false;
		      }
		      if ((password == null) || (password == "")) {
		         ok = false;
		      }


		      if (ok) {
		         boolean female = false;
				// if hop le: tao bean user
		         User user = new User(firstName, lastName, email, password, female,
		               yearOfBirth, industry, jobTitle, company, city, telephone,
		               favorites, desiredPlatform);


		         // Dat bean user vao pham vi request
		         request.setAttribute("registeredUser", user);


		         // forward toi trang welcome.jsp
		         getServletContext().getRequestDispatcher("/BT3Welcome.jsp").forward(
		               request, response);
		      } else {
		         getServletContext().getRequestDispatcher("/BT3Regagain.jsp").forward(
		               request, response);
		      }

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
