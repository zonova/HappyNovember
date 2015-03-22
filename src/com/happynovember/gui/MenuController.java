package com.happynovember.gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.happynovember.DataBase;



public class MenuController {
	
	public List<MenuItemModel> getMenuByType(String type){
		List<MenuItemModel> menu = new ArrayList<MenuItemModel>();
		
		ResultSet rs = null;
		DataBase db = new DataBase();
		try {
			String sql = "SELECT * FROM menu WHERE type='" + type + "'";
			rs = db.getResult(sql);
			
	        while (rs.next()) {
        		MenuItemModel menuItem = new MenuItemModel();
        		menuItem.setId(rs.getInt("id"));
        		menuItem.setText(rs.getString("text"));
        		menuItem.setUrl(rs.getString("url"));
        		menuItem.setType(rs.getString("type"));
        		
        		menu.add(menuItem);
	        } 
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return menu;		
	}
}
