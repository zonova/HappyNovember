package com.happynovember.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.happynovember.DataBase;
import com.happynovember.Services;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/registrationForm.jsp").include(request, response);
		Services.article();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.println("username " + user + " ");
		out.println("email " + email + " ");
		out.println("password " + pass + " ");
		
		DataBase db = new DataBase();
		String sql = "INSERT INTO users (username, email, password)  "
				+ "VALUES ('" + user + "', '" + email + "', '" + pass + "')";
		db.execute(sql);
	}

}
