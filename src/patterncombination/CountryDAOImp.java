/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncombination;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jaydeep Rangani
 */
public class CountryDAOImp implements CountryINT {

   
    // method to get all country detail 
  
    /*
    
    public void getAllCountryData(){
        
        
        try{
            // creating query instring 
            String query= "select * from country;" ;
            // result set to execute query 
            ResultSet rs =st.executeQuery(query);
            
            System.out.println("Records from database :"); 
         
            

        // loop to check and get all records from databse . 
          //untill database returns null value
            while (rs.next()){ 
                 String Code=rs.getString("Code");
                 String Name=rs.getString("Name");
                 String Continent=rs.getString("Continent");
                 String SurfaceArea=rs.getString("SurfaceArea");
                 String HeadOfState=rs.getString("HeadOfState");
                 
                 
                 // printing all get results in right order ..
                 System.out.println("Code :"+Code+"\t"+"Name :"+Name+"\t"+"Continent :"+Continent+"\t"+"SurfaceArea :"+SurfaceArea+"\t"+"HeadOfState :"+HeadOfState);
                                
             }       
        }catch (Exception ex){
            System.out.println("Error :"+ex);
        } 
        
    }*/
    
    // METHOD 1: GET ALL CUSTOMERS
	public ArrayList<Country> getCountrys() {
		
		// CREATE THE ARRAYLIST TO PUT ALL THE CUSTOMERS
		// THAT ARE GOING TO BE RETURNED
		ArrayList<Country> countrys = new ArrayList<Country>();
		
		// THIS IS THE METHOD IN CHARGE OF CREATE THE QUERY
		String query = "select * from customer";
		
		// ACCESSING THE DATABASE
		DBconnect dtbs = new DBconnect();
		
		// QUERYING THE DATABASE
		ResultSet rs = dtbs.select(query);
		
		// LOOP OVER THE RESULT SET
		try {
			while( rs.next() ) {
				// FOR EACH ONE OF THE VALUES, WE WANT TO
				// GET THE ATTRIBTUES
				  String Code=rs.getString("Code");
                                                                  String Name=rs.getString("Name");
                                                                  String Continent=rs.getString("Continent");
                                                                  String SurfaceArea=rs.getString("SurfaceArea");
                                                                  String HeadOfState=rs.getString("HeadOfState");
				
				customers.add(new Customer(id, name, phoneNumber, address));	
			}
			
			// CLOSING THE CONNECTION TO THE DATABASE
			db.closing();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// RETURN THE ARRAYLIST WITH ALL THE CUSTOMERS
		return customers;
	}

    
    
    
    
    
    
    
    
}
