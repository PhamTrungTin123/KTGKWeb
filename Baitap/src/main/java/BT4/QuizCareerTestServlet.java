package BT4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import BT4.Conclusion;
import BT4.QuizTest;

/**
 * Servlet implementation class QuizCareerTestServlet
 */
public class QuizCareerTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	      HttpSession session = request.getSession();
	      QuizTest quizTest = (QuizTest) session.getAttribute("quizTest");


	      String nextPage = "BT4Start.jsp";
	      if (request.getParameter("next") != null) {
	         int choose;
	         try {
	            choose = Integer.parseInt(request.getParameter("choose"));
	         } catch (NumberFormatException e) {
	            choose = -1;
	         }
	         if (choose == -1) {
	            nextPage = "BT4Again.jsp";
	         } else {
	            quizTest.nextAction(choose);
	            if (quizTest.hasMoreQuestions()) {
	               quizTest.nextQuestion();
	            } else {
	               Conclusion conclusion = quizTest.getConclusionWhenDone();
	               request.setAttribute("conclusion", conclusion);
	               nextPage = "BT4Done.jsp";
	            }
	         }
	      }


	      if (request.getParameter("startAgain") != null) {
	         quizTest.reset();
	      }
	      request.getRequestDispatcher(nextPage).forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
