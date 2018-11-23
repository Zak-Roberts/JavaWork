package com.cognizant.libraryDatabaseTests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Library {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Library l = new Library();
		
		System.out.println(l.seeLibrary());
		
//		System.out.println(l.addPerson("Nichola", "Ward", "Manchester"));
//		System.out.println(l.removePerson(4, "Zak", "Roberts"));
//		System.out.println(l.updatePersonFirstName("Nic", "Ward", "Nichola"));
//		System.out.println(l.updatePersonLastName("Zak", "Robertss", "Roberts"));
//		System.out.println(l.updatePersonAddress("Zak", "Robertss", "Salford"));
	}

	public ArrayList<String> seeLibrary() throws ClassNotFoundException, SQLException  {
		ArrayList <String> results = new ArrayList <String>();
		
		Connection conn = null;
		Statement stmt = null;

		Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root",""); // go to mysql and open database 'myShop', default username, default password
		stmt = conn.createStatement();
		String sql = "select * from items";
		ResultSet rs = stmt.executeQuery(sql);
		String result = "";
		while(rs.next()) {
			String name = rs.getString("Name");		// can use column index as well
			String author = rs.getString("Author");
			String numCopies = rs.getString("numCopies");
			result = name + ", " + author + ", " + numCopies + "\n";
			results.add(result);
		}
		
		stmt.close();
		conn.close();
		return results;
	}
	
	public String addPerson(String firstName, String lastName, String address) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;

		Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root",""); // go to mysql and open database 'myShop', default username, default password
		stmt = conn.createStatement();
		String sql = "insert into people (firstName, lastName, address)" + "values (?,?,?)";
		 PreparedStatement preparedStmt = conn.prepareStatement(sql);
	     preparedStmt.setString (1, firstName);
	     preparedStmt.setString (2, lastName);
	     preparedStmt.setString (3, address);
	     preparedStmt.execute();

		stmt.close();
		conn.close();
		return "You have added " + firstName + " " + lastName + " to the people database";
	}
	
	public String removePerson(int id, String firstName, String lastName) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;

		Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root",""); // go to mysql and open database 'myShop', default username, default password
		stmt = conn.createStatement();
		String sql = "delete from people where id = ? and firstName = ? and lastName = ?";
		 PreparedStatement preparedStmt = conn.prepareStatement(sql);
	     preparedStmt.setInt(1, id);
	     preparedStmt.setString (2, firstName);
	     preparedStmt.setString (3, lastName);
	     preparedStmt.execute();

		stmt.close();
		conn.close();
		return "You have removed " + firstName + " " + lastName + " from the people database";
	}
	
	public String updatePersonFirstName(String firstName, String lastName, String newFirstName) throws ClassNotFoundException, SQLException {
		
		Connection conn = null;
		Statement stmt = null;

		Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root",""); // go to mysql and open database 'myShop', default username, default password
		stmt = conn.createStatement();
		String sql = "update people set firstName = ? where firstName = ?";
		 PreparedStatement preparedStmt = conn.prepareStatement(sql);
	     preparedStmt.setString (1, newFirstName);
	     preparedStmt.setString (2, firstName);
	     preparedStmt.execute();

		stmt.close();
		conn.close();
		return "You have updated " + newFirstName + " " + lastName + " in the people database";
	}
		
		public String updatePersonLastName(String firstName, String lastName, String newLastName) throws ClassNotFoundException, SQLException {
			
			Connection conn = null;
			Statement stmt = null;

			Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root",""); // go to mysql and open database 'myShop', default username, default password
			stmt = conn.createStatement();
			String sql = "update people set lastName = ? where firstName = ?";
			 PreparedStatement preparedStmt = conn.prepareStatement(sql);
		     preparedStmt.setString (1, newLastName);
		     preparedStmt.setString (2, firstName);
		     preparedStmt.execute();

			stmt.close();
			conn.close();
			return "You have updated " + firstName + " " + newLastName + " in the people database";
		
	}
		
		public String updatePersonAddress(String firstName, String lastName, String newAddress) throws ClassNotFoundException, SQLException {
			
			Connection conn = null;
			Statement stmt = null;

			Class.forName("com.mysql.cj.jdbc.Driver");		// finds Driver class in mysql files
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root",""); // go to mysql and open database 'myShop', default username, default password
			stmt = conn.createStatement();
			String sql = "update people set address = ? where firstName = ?";
			 PreparedStatement preparedStmt = conn.prepareStatement(sql);
		     preparedStmt.setString (1, newAddress);
		     preparedStmt.setString (2, firstName);
		     preparedStmt.execute();

			stmt.close();
			conn.close();
			return "You have updated the address for " + firstName + " " + lastName + " in the people database";
			
		}
		
		
}
