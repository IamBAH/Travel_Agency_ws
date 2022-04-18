package com.travel.webservice.data;

import java.sql.*;

/**
 * This class integrates all the methods we need to interact with the database such as :
 * opening and closing the connections,executing queries,etc... 
 * 
 * @author MIAN Farooq and BAH Alpha Oumar
 */

public class DataBase_connection {

	private  Connection connexion;
	private PreparedStatement prepared_statement;
	private static DataBase_connection database;
	
	public static DataBase_connection getInstance()
	{
		if(database == null)
		{
			database = new DataBase_connection();
		}
		return database;
	}
	
	private DataBase_connection()
	{
		
	}

	private void openConnection() throws Exception 
	{
		try {
			if (connexion == null || connexion.isClosed()) 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/travel_agency_ws";
				String user = "root", password = "TRv@l22_ws";
				connexion = DriverManager.getConnection(url, user, password);
			}
		} 
		catch (Exception e) 
		{
			throw e;
		}
	}

	public void PrepareStatement_for_request(String sql) throws Exception {
		try {
			openConnection();
			prepared_statement = connexion.prepareStatement(sql);
		} catch (Exception e) {
			
			throw e;
		}
	}

	public void addParameters_request(Object[] parameters) throws SQLException {
		try {
			for (int i = 0; i < parameters.length; i++) 
			{
				prepared_statement.setObject(i + 1, parameters[i]);
			}
		} catch (SQLException e) {
			
			throw e;
		}
	}

	public ResultSet ExecuteQuery_request() throws Exception {
		try {
			return prepared_statement.executeQuery();
		} catch (Exception e) {
			
			throw e;
		}
	}

	public int ExecuteUpdate_request() throws Exception {
		try {
			return prepared_statement.executeUpdate();
		} catch (Exception e) {
			
			throw e;
		}
	}
	
	public void PrepareStatement_for_request_1(String sql) throws Exception {
		try {

			openConnection();
			if (sql.trim().toLowerCase().startsWith("insert")) {
				prepared_statement = connexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			} else {
				prepared_statement = connexion.prepareStatement(sql);
			}

		} catch (Exception e) {
			throw e;
		}
	}

	public int getkey() throws SQLException {
		ResultSet rs = prepared_statement.getGeneratedKeys();
		if (rs.next()) {
			return rs.getInt(1);
		}
		rs.close();
		return -1;
	}
	
	public void closeConnection() throws Exception
	{
		try 
		{
			prepared_statement.close();
			prepared_statement=null;
			connexion.close();
			connexion=null;
		} 
		catch (Exception e) {
			
			throw e;
		}
	}
}