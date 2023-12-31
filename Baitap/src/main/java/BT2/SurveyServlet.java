package BT2;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class SurveyServlet
 */
@WebServlet("/SurveyProcess")
public class SurveyServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
        SurveyData data = (SurveyData) context.getAttribute("surveyData");
        if (data == null) {
            data = new SurveyData();
            context.setAttribute("surveyData", data);
        }
        String nghe = request.getParameter("nghe");
        data.increasingValue(nghe);
        getServletContext().getRequestDispatcher("/BT2_1result.jsp")
                .forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
