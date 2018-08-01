package com.deloitte.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.deloitte.web.model.UserBean;

/**
 * Servlet implementation class ProcessRequestServlet
 */
@WebServlet("/process")
public class ProcessRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserBean mrBean = new UserBean();

		boolean status = mrBean.authenticate(username, password);
		if (status) {
			HttpSession session=request.getSession(true);
			
			session.setMaxInactiveInterval(10);
			
			session.setAttribute("ub", mrBean);
			request.getRequestDispatcher("/homeGFDGHS21.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("/loginJHSDGSSH.jsp?flag=true").forward(request, response);
		}
	}
}
