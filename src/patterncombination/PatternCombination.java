/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncombination;

import java.util.ArrayList;

/**
 *
 * @author Jaydeep Rangani
 */
public class PatternCombination   {

    
    public PatternCombination(){     
      
     
         
    }
    public static void main(String[] args) {
       // PatternCombination patternCombination = new PatternCombination(); 
         
       // calling reference from interface 
       // client dont have direct access to database ..
      CountryINT  data= new CountryDAO();
         
            
       //assign array list to country data .. 
      ArrayList<Country> Countries = data.getCountries();
      
      //using for loop to get all country detail from database in squencial order.
      for(Country c : Countries){
           System.out.println(c);// printing each record in text 
        }
      
      
      // THIS REFERCES TO INTERFACE METHOD TO VIEW COUNTRY BY COUNTRY CODE 
                               
        Country c = data.SearchCountrybycode("353");
        // PRINTING COUNTRY DETAIL THAT HAS BEEN MATCH 
        System.out.println(c);
        
        
        //THIS IS METHOD REFERENCES FROM INTERFACE TO GET COUNTRY BY NAME
        Country noc = data.SearchCountrybyname("ireland");
        // PRINTING MATCHING RECORD.
        System.out.println(noc);
       
          // THIS REFERNCES TO METHOD TO ADD COUNTRY DEATAIL (CELL IN DB)
        Country newentry = new Country( "990","jaydeep", "Asia", "99999","xx");
        //PREVIUS SETUP OBJECT CREATS SQL SENTENCE  
        //PRINT ST. GETTING CONFIRMATION OF PROCESS DONE..
        System.out.println(data.insertCountry(newentry));
         
    }
    
}
