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
public  class CountryDAO implements CountryINT {
    
        @Override
         public ArrayList<Country> getCountries() {
        
       
		
            // CREATE THE ARRAYLIST TO PUT ALL THE CUSTOMERS
            // THAT ARE GOING TO BE RETURNED
	ArrayList<Country> Countries = new ArrayList<Country>();
		
	// THIS IS THE METHOD IN CHARGE OF CREATE THE QUERY
	String query = "select  *  from  country;";
		
	// ACCESSING THE DATABASE
	DBconnect db = new DBconnect();
		
	// QUERYING THE DATABASE
	ResultSet rs =db.select(query);
		
	// LOOP OVER THE RESULT SET
	try {
		while( rs.next() ) {
		// FOR EACH ONE OF THE VALUES, WE WANT TO
		// GET THE ATTRIBTUES
		String Code= rs.getString(1);
		String Name = rs.getString(2);
		String Continent = rs.getString(3);
		String SurfaceArea = rs.getString(4);
                                String HeadofState=rs.getString(5);
			
		Countries.add(new Country(Code, Name, Continent, SurfaceArea, HeadofState));	
			}
			
			// CLOSING THE CONNECTION TO THE DATABASE
			db.closing();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// RETURN THE ARRAYLIST WITH ALL THE CUSTOMERS
		return Countries;
	}
    
        @Override
        public Country SearchCountrybycode(String code) {
		
		// CREATING THE OBJECT THAT WE'RE GOING TO RETURN
		Country cntry = null;
		
		// THIS METHOD IS IN CHAGE OF CREATING THE QUERY
		String query = "select * from country where code = " + code;
		
		// ACCESSING THE DATABASE
		DBconnect db = new DBconnect();
		
		// QUERYING THE DATABASE
		ResultSet rs = db.select(query);
		
		// WITH THE RESULT GET THE DATA AND PUT IT IN THE INSTANCE 
		// OF COUNTRY
		try {
			rs.next();
                                                code=rs.getString(1);
                                                String name = rs.getString(2);
			String continent = rs.getString(3);
			String surfacearea   = rs.getString(4);
                                                String headofstate = rs.getString(5);
			cntry = new Country(code, name, continent, surfacearea,headofstate);
			
			// CLOSING THE CONNECTION FROM THE DATABASE
			db.closing();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		// RETURN THE COUNTRY 
		return cntry;
	}
        
        @Override
        public Country SearchCountrybyname(String name){
            
            // CREATING THE OBJECT THAT WE'RE GOING TO RETURN
		Country cntry = null;
            
            
            // THIS METHOD IS IN CHAGE OF CREATING THE QUERY
		String query = "select * from country where name = '" + name +"'";
            
                // ACCESSING THE DATABASE
		DBconnect db = new DBconnect();
            
                
                // QUERYING THE DATABASE
		ResultSet rs = db.select(query);
                
                
		// WITH THE RESULT GET THE DATA AND PUT IT IN THE INSTANCE 
		// OF COUNTRY
		try {
			rs.next();
                                                String code=rs.getString(1);
                                                name = rs.getString(2);
			String continent = rs.getString(3);
			String surfacearea   = rs.getString(4);
                                                String headofstate = rs.getString(5);
			cntry = new Country(code, name, continent, surfacearea,headofstate);
			
			// CLOSING THE CONNECTION FROM THE DATABASE
			db.closing();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
                
                
                return cntry;
            
        }
            
        @Override
        public boolean insertCountry(Country country) {
		
		// ACCESSING THE DATABASE
		DBconnect db = new DBconnect();
		
		// FROM THE OBJECT, GETTING THE DATA
                                String code =country.getCode();
		String name = country.getName();
		String continent= country.getContinent();
		String surfacearea  = country.getSurfacearea();
		String headofstate = country.getHeadofstate();
                
		// THIS METHOD IS IN CHARGE OF CREATING THE QUERY
		String query = "insert into country (code,name, continent, SurfaceArea, HaeadOfState) values ("+code +",'" + name + "', '" + continent + "'," + surfacearea+",'"+headofstate+"')";
		
		// REQUESTION TO SAVE THE DATA
		boolean result = db.save(query);
		
		// CLOSING THE DATABASE
		db.closing();
		
		return result;
	}
             
 }

    
    
    

