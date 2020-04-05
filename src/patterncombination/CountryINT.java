//JAYDEEP RANGANI 2017016
// reference .. major part from class notes and Moodle Labs Projects. 
// credit (teacher): amilcar aponte ..
package patterncombination;

import java.util.ArrayList;

/**
 *
 * @author Jaydeep Rangani
 */
public interface CountryINT {

   public ArrayList<Country> getCountries() ;
   
   public Country SearchCountrybycode(String code);
   
   public Country SearchCountrybyname(String name);
    
   public boolean insertCountry(Country country);
    
   
}
