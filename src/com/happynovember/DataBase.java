package com.happynovember;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DataBase(){
        String url = "jdbc:mysql://localhost:3306/";
        String db = "firstspring";
        String driver = "com.mysql.jdbc.Driver";
        String user = "spring";
        String pass = "spring";

        try {
			Class.forName(driver);
			con = DriverManager.getConnection(url + db, user, pass);
	        st = con.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
	}
	
	public ResultSet getResult(String sql){
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public void execute(String sql){
		try {
			st.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
