/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncombination;


import java.sql.*;


/**
 *
 * @author Jaydeep Rangani
 */
public class DBconnect {
     
    private Connection connection;
    private Statement statement;
    
    
    // public method to check database connection 
    /*public DBconnect(){
        try {
            // getting jdbc driver from lib.
            Class.forName("com.mysql.cj.jdbc.Driver");            
            // creating and calling connection  elements
            con = DriverManager.getConnection("jdbc:mysql://52.50.23.197:3306/world","cctstudent","Pass1234!"); 
             st=con.createStatement(); // creating satatement through statement lib.
           }catch (Exception ex){
            System.out.println("Error :"+ex);
        }
        
    }
    */
    
            // Creating Variable to setup sql query object 
            private String database = "jdbc:mysql://apontejaj.com:3306/customer";
            private String username = "cctstudent";
            private String password = "Pass1234!";
    
            public DBconnect() {
		
		// NOW THE CONSTRUCTOR ONLY HAS TO CREATE THE CONNECTION 
		// AND THE STATEMENT
		try{
			
		// Get a connection to the database
		connection = DriverManager.getConnection( database, username, password ) ;

		// Get a statement from the connection
		statement = connection.createStatement() ;
			
		}
		catch( SQLException se ){
			System.out.println( "SQL Exception:" ) ;

			// Loop through the SQL Exceptions
			while( se != null ){
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e ){
			System.out.println( e ) ;
		}
	}
	
    
    
    // finnaly clossing sql method.
    public void closing() {
		try {
                    
			statement.close(); //statement close 
			connection.close(); //connection with database close
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    
}
