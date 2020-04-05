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
        //int to get nuber for selcection 
     
         
    }
    public static void main(String[] args) {
       // PatternCombination patternCombination = new PatternCombination(); 
         
        
      
       
        
      
      
      
      CountryINT  data= new CountryDAO();
         
            
        
      ArrayList<Country> Countries = data.getCountries();
        
      for(Country c : Countries){
           System.out.println(c);
        }
      
      
      
                          
        Country c = data.SearchCountrybycode("353");
        System.out.println(c);
        
        Country noc = data.SearchCountrybyname("ireland");
        System.out.println(noc);
       
          
        Country newentry = new Country( "990","jaydeep", "Asia", "99999","xx");
        System.out.println(data.insertCountry(newentry));
         
    }
    
}
