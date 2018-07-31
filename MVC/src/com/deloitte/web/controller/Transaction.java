package com.deloitte.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Transaction
 */
@WebServlet("/transct")
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action!=null) {
			if(action.equals("Inbox")) {
				request.getRequestDispatcher("inbox34283sk.jsp").forward(request, response);
			} else if(action.equals("Compose")) {
				request.getRequestDispatcher("compose34283sk.jsp").forward(request, response);
			}  else if(action.equals("sent")) {
				request.getRequestDispatcher("sent34283sk.jsp").forward(request, response);
			}  else if(action.equals("logout")) {
				request.getRequestDispatcher("index.html").forward(request, response);
			} else {
				request.getRequestDispatcher("index.html").forward(request, response);
			} 
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
