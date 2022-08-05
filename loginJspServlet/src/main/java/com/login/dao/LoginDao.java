package com.login.dao;

import java.util.*;
import java.sql.*;

public class LoginDao {
	
	
	String url= "jdbc:mysql://localhost:3306/UserDB";
	String username="root";
	String password1="sahal123";
	String query = "select * from login where uname=? and pass=?";
	
	public boolean check(String uname, String password) {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password1);

			
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		}
		catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		
		
		
		return false;
	}

}
