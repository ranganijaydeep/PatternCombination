//JAYDEEP RANGANI 2017016
// reference .. major part from class notes and Moodle Labs Projects. 
// credit (teacher): amilcar aponte ..
package patterncombination;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Jaydeep Rangani
 */
public  class CountryDAO implements CountryINT {
    
    
        @Override // THIS METHOD IS TO CREATE LIST OF ALL COUNTRY AND DEFULL DETAIL ABOUT IT.
         public ArrayList<Country> getCountries() {
        
       
		
            // CREATING ARRAY LIST TO PULL COUNTRY LIST 
            // THAT ARE GOING TO BE DISPLAYED
	ArrayList<Country> Countries = new ArrayList<Country>();
		
	// THIS IS THE METHOD TO CREATE MAIN QUERY (IN CHARGE)
	String query = "select  *  from  country;";
		
	// CONNECTING DATABSE 
	DBconnect db = new DBconnect();
		
	// RUNNING QUERY ON DATABASE 
	ResultSet rs =db.select(query);
		
	// LOOP FOR QUERY RESULT SET 
	try {
		while( rs.next() ) {
		// FOR EACH VALUE WE WANT TO PULL DATA 
		String Code= rs.getString(1);
		String Name = rs.getString(2);
		String Continent = rs.getString(3);
		String SurfaceArea = rs.getString(4);
                                String HeadofState=rs.getString(5);
			
		Countries.add(new Country(Code, Name, Continent, SurfaceArea, HeadofState));	
			}
			
			// CLOSING CONNECTION 
			db.closing();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// RETURN THE ARRAYLISTS
		return Countries;
	}
    
        @Override ////THIS METHOD IS TO GET ALL DETAIL ABOUT COUNTRY BY COUNTRY CODE 
        public Country SearchCountrybycode(String code) {
		
		// CREATING OBJECTS THAT IS GOING TO BE RETURN 
		Country cntry = null;
		
		// QUERY METHOD IN CHARGE MAIN QUERY 
		String query = "select * from country where code = " + code;
		
		// CONNECTING DATABASE 
		DBconnect db = new DBconnect();
		
		// RUNNING QUERY 
		ResultSet rs = db.select(query);
		
		// GETTING DATA THROUGH RESULT SET AND SETTING IN COUNTRY INTERFACE 
		try {
			rs.next();
                                                code=rs.getString(1);
                                                String name = rs.getString(2);
			String continent = rs.getString(3);
			String surfacearea   = rs.getString(4);
                                                String headofstate = rs.getString(5);
			cntry = new Country(code, name, continent, surfacearea,headofstate);
			
			// CLOSING THE CONNECTION 
			db.closing();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		// RETURN THE COUNTRY 
		return cntry;
	}
        
        @Override //THIS METHOD IS TO GET ALL DETAIL ABOUT COUNTRY BY NAME
        public Country SearchCountrybyname(String name){
            
            // RETURNBALE OBJECT 
		Country cntry = null;
            
            
            // MAIN QUERY 
		String query = "select * from country where name = '" + name +"'";
            
                // CONNECING DATABASE 
		DBconnect db = new DBconnect();
            
                
                // QUERY RUNNING
		ResultSet rs = db.select(query);
                
                
		// GETTING DATA AND SETTING IN COUNTRY INTERFACE.
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
            
        @Override // THIS METHOD IS TO INSERTING COUJNRTY IN DATABASE 
        public boolean insertCountry(Country country) {
		
		// ACCESSING THE DATABASE
		DBconnect db = new DBconnect();
		
		// FROM THE OBJECT, GETTING THE DATA
                                String Code =country.getCode();
		String Name = country.getName();
		String Continent= country.getContinent();
		String SurfaceArea  = country.getSurfacearea();
		String HeadOfState = country.getHeadofstate();
                
		// MAIN QUERY 
		String query = "insert into country (Code,name, Continent, SurfaceArea,HeadOfState) values ("+Code +",'" + Name + "','" + Continent +"'," + SurfaceArea+",'"+HeadOfState+"')";
		
		// REQUEST TO SAVE QUERY DATA
		boolean result = db.save(query);
		
		// CLOSING THE DATABASE
		db.closing();
		
		return result;
	}
             
 }

    
    
    

