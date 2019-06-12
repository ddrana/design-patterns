package com.learn.design.pattern.java;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet(
		name="StudentServlet",
		urlPatterns="/student-record")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService = new StudentService();
	
	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentId = request.getParameter("id");
		if( studentId != null) {
			int id = Integer.parseInt(studentId);
			studentService.getStudent(id).ifPresent(s -> request.setAttribute("studentRecord", s));
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("student-record.jsp");
		dispatcher.forward(request, response);
	}

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
