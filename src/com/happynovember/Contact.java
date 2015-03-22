package com.happynovember;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.happynovember.gui.MenuController;
import com.happynovember.gui.MenuItemModel;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			ResultSet rs = null;
			DataBase db = new DataBase();
			
            String sql = "SELECT * FROM posts WHERE page = 'contact'";
            rs = db.getResult(sql);
            if (rs.next()) {
            	request.setAttribute("title", rs.getString("title"));
            	request.setAttribute("text", rs.getString("text"));
            } 

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		MenuController mc = new MenuController();
		List<MenuItemModel> topMenu = mc.getMenuByType("top");
		List<MenuItemModel> bottomMenu = mc.getMenuByType("bottom");
		
		
		request.setAttribute("topMenu", topMenu);
		request.setAttribute("bottomMenu", bottomMenu);
		
		request.getRequestDispatcher("/page.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
