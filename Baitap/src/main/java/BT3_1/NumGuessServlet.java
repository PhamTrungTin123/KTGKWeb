package BT3_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import BT3_1.NumberGuessBean;

import java.io.IOException;

/**
 * Servlet implementation class BT3_1NumGuessServlet
 */
public class NumGuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  HttpSession session = request.getSession(true);
	      NumberGuessBean numguess = (NumberGuessBean) session.getAttribute("numguess");
	      if (numguess == null) {
	         numguess = new NumberGuessBean();
	         session.setAttribute("numguess", numguess);
	      }
	      numguess.guess(request.getParameter("guess"));
	      
	      if (numguess.getSuccess()) {
	         getServletContext().getRequestDispatcher("/BT3_1done.jsp").forward(request, response);
	   }else {
		     getServletContext().getRequestDispatcher("/BT3_1again.jsp").forward(request, response);
	   }
	   }

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
