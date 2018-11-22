// get information from a local mySql database called 'myShop' - shows java and mySql linking functionality

package com.cognizant.Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = null;
		Statement stmt = null;

		Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myShop", "root",""); // go to mysql and open database 'myShop', default username, default password
		stmt = conn.createStatement();
		String sql = "select * from stock";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			String item = rs.getString("item");		// can use column index as well
			String price = rs.getString("price");
			System.out.println(item + " : " + price);
		}
		
		stmt.close();
		conn.close();
		
	}

}

// CRUD - Create Read Update Delete