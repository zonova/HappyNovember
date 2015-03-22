package com.happynovember;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.happynovember.gui.MenuController;
import com.happynovember.gui.MenuItemModel;

/**
 * Servlet implementation class Services
 */
@WebServlet("/services")
public class Services extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Services() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static void article(){
    	String sql;
    	DataBase db = new DataBase();
    	for(int i = 20; i < 30; i++){
    		sql = "INSERT INTO services (title, text) values('Alises-"+i+"','Rabbit-Hole-"+i+"')";
    		db.execute(sql);
		}
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		try {
			ResultSet rs = null;
			DataBase db = new DataBase();
			
            String sql = "SELECT * FROM posts WHERE page='services'";
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
		request.setAttribute("topMenu", topMenu);
		
		List<MenuItemModel> bottomMenu = mc.getMenuByType("bottom");
		request.setAttribute("bottomMenu", bottomMenu);
		
		
		ServiceController servicesController = new ServiceController();
		
		if (id != null){
			ServicesItemModel serviceById = servicesController.getServiceById(id);
			request.setAttribute("serviceById", serviceById);
		} else {
			List<ServicesItemModel> servicesList = servicesController.getServices();
			request.setAttribute("servicesList", servicesList);			
		}		

		
		request.getRequestDispatcher("/page.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
