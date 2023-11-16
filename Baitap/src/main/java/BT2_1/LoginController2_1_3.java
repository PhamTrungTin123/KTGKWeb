package BT2_1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginController2_1
 */
public class LoginController2_1_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController2_1_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String name = request.getParameter("name");
	        String password = request.getParameter("password");
	        LoginBean2_1_3 bean = new LoginBean2_1_3();
	        bean.setName(name);
	        bean.setPassword(password);
	        request.setAttribute("bean", bean);
	        boolean status = bean.validate();
	        if (status) {
	            RequestDispatcher rd = request
	                    .getRequestDispatcher("BT2_1_3LoginSuccess.jsp");
	            rd.forward(request, response);
	        } else {
	            RequestDispatcher rd = request
	                    .getRequestDispatcher("BT2_1_3LoginError.jsp");
	            rd.forward(request, response);
	            
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);

}
}
