package BT2_1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Servlet implementation class SearchProcessServlet
 */
public class SearchProcessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String searchString = request.getParameter("searchString");
	      if ((searchString == null) || (searchString.length() == 0)) {
	         reportProblem(response, "Missing search string");
	         return;
	      }
	      // The URLEncoder changes spaces to "+" signs and other
	      // non-alphanumeric characters to "%XY", where XY is the
	      // hex value of the ASCII (or ISO Latin-1) character.
	      searchString = URLEncoder.encode(searchString, "UTF-8");


	      String searchEngineName = request.getParameter("searchEngine");
	      if ((searchEngineName == null) || (searchEngineName.length() == 0)) {
	         reportProblem(response, "Missing search engine name");
	         return;
	      }
	      String searchURL = SearchUtilities.makeURL(searchEngineName, searchString);
	      if (searchURL != null) {
	         response.sendRedirect(searchURL);
	      } else {
	         reportProblem(response, "Unrecognized search engine");
	      }
	   }

	 private void reportProblem(HttpServletResponse response, String message) 
	           throws IOException {
	      response.sendError(response.SC_NOT_FOUND, message);
	   }
	}



