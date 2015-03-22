package com.happynovember;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.happynovember.DataBase;



public class ServiceController {
	private ResultSet rs = null;
	private DataBase db = new DataBase();
	
	public List<ServicesItemModel> getServices(){
		List<ServicesItemModel> services = new ArrayList<ServicesItemModel>();
		
		try {
			String sql = "SELECT * FROM services";
			rs = db.getResult(sql);
			
	        while (rs.next()) {
        		ServicesItemModel serviceItem = new ServicesItemModel();
        		int id = rs.getInt("id");
        		serviceItem.setId(id);
        		int date = rs.getInt("date");
         		serviceItem.setDate(date);
         		int views = rs.getInt("views");
        		serviceItem.setViews(views);
        		String title = rs.getString("title");
        		serviceItem.setTitle(title);
        		String text = rs.getString("text");;
        		serviceItem.setText(text);
        		String image = rs.getString("image");
        		serviceItem.setImage(image);
        		String author = rs.getString("author");
        		serviceItem.setAuthor(author);
        		
        		services.add(serviceItem);
	        } 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return services;		
	}
	
	public ServicesItemModel getServiceById(String id){
		ServicesItemModel serviceById = new ServicesItemModel();

		try {
			String sql = "SELECT * FROM services WHERE id='" + id + "'";
			rs = db.getResult(sql);
			
			if (rs.next()) {
        		int idFromSql = rs.getInt("id");
        		serviceById.setId(idFromSql);
        		serviceById.setDate(rs.getInt("date"));
        		serviceById.setViews(rs.getInt("views"));
        		serviceById.setTitle(rs.getString("title"));
        		serviceById.setText(rs.getString("text"));
        		serviceById.setImage(rs.getString("image"));
        		serviceById.setAuthor(rs.getString("author"));
        		
		    } 
	   } catch (SQLException e) {
		   e.printStackTrace();
	   }
        return serviceById;
	}
}
