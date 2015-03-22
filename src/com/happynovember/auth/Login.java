package com.happynovember.auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.happynovember.DataBase;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/loginForm.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		try {
			ResultSet rs = null;
			DataBase db = new DataBase();
			
            String sql = "SELECT * FROM users WHERE username = '" + username + "'";
            rs = db.getResult(sql);
            if (rs.next()) {
        		if (rs.getString("password").equals(pass)) {
        			out.print("Welcome to protected area");
        		} else {
        			out.print("Check your username or password");
        		}
        		
            } else {
            	out.print("There are no users with username " + username);
            }

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
