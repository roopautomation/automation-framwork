package com.optum.synergy.reference.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DataUtility {

	static ResultSet resultSet = null;
	static Connection dbConn = null;

	public static void connectDatabase(String query) throws SQLException {
		String dbClass = "com.mysql.jdbc.Driver";

		String bc4DbServer = "dbsrt1407.uhc.com";

		String bc4DbUserName = "phst_own";

		String bc4DbPassword = "CFRw6FmI";

		String bc4DbName = "phst01";

		int longTimeout = 60;

		// String dbUrl = "jdbc:mysql://" + bc4DbServer + "/" + "databaseName="
		// + bc4DbName + ";user=" + bc4DbUserName
		// + ";password=" + bc4DbPassword + ";";

		String dbUrl = "jdbc:mysql://" + bc4DbServer + "/" + bc4DbName + "," + bc4DbUserName + "," + bc4DbPassword;

		// String mynewurl="jdbc:mysql://dbsrt1407.uhc.com:3306/phst01","",""";
	
		try {
			// load the driver
			Class.forName(dbClass);

			// Create connection
			dbConn = DriverManager.getConnection("jdbc:mysql://dbsrt1407.uhc.com:3306/phst01", "phst_own", "CFRw6FmI");

		} catch (Exception e) {

			System.out.println("Connection failed " + e.getMessage());
		}

		// create statement so that we can ee=xecute any query
		try {
			Statement statement = dbConn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		
			statement.setQueryTimeout(longTimeout);
			
			resultSet = statement.executeQuery(query);
			

		
			
		} catch (SQLException e) {
			e.printStackTrace();
			Assert.fail("FAIL - Failed to execute query on [" + dbUrl + "]");
		}

		

	}

	// Reusable method
	public static void getMemberName(int Expectednumber) throws SQLException
	{
		while (resultSet.next()) {

			String name = resultSet.getString("first_name");
			System.out.println("Data from tbale is " + name);
			
			Assert.assertEquals(name, "Point");
		
			int number = (int) resultSet.getDouble("phone_num");
			System.out.println("Number is " + number);
			Assert.assertEquals(number, Expectednumber);

		}
	}
	



}
