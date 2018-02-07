package org.yan.hibernate;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login_For_Meat_System {
	
	public static void main(String[] argv) throws SQLException {
		 
		System.out.println("-------- Oracle JDBC Connection Testing ------");
 
		try {
 
			Class.forName("oracle.jdbc.driver.OracleDriver");
 
		} catch (ClassNotFoundException e) {
 
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;
 
		}
 
		System.out.println("Oracle JDBC Driver Registered!");
 
		Connection connection = null;
 
		try {
 
			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@[10.64.151.235:1521:CCB2502", "cisadm",
					"cisadm");
 
		} catch (SQLException e) {
 
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
 
		}
 
		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
	    String sql ="select *  from sc_user";

        //creating PreparedStatement object to execute query
        PreparedStatement preStatement = connection.prepareStatement(sql);
        
        ResultSet result = preStatement.executeQuery();
        
     
       
        while(result.next()){
        	
        	   if ( result.getString("user_id")=="ROCK"){
               	
               	System.out.println("you enter the correct name");
               }
            System.out.println("Current Date from Oracle : " +  result.getString("user_id"));
        }
        System.out.println("done");






	}

	
	
}
