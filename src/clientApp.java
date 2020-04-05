//JAYDEEP RANGANI 2017016
// reference .. this class is majority part from class notes and Moodle Labs Projects. 
// credit (teacher): amilcar aponte ..



import java.util.ArrayList;
import patterncombination.Country;
import patterncombination.CountryDAO;
import patterncombination.CountryINT;



/**
 *
 * @author Jaydeep Rangani
 */
public class clientApp {
    
    
    
    public clientApp(){
        
    }
    
    
     public static void main(String[] args) {
         CountryINT  data= new CountryDAO();
         
        System.out.println("1. Show all country ");
        System.out.println("2. Retrieve records by country name");
        System.out.println("3. Retrieve records by country code ");
        System.out.println("4. Add new records into the database ");
        System.out.println("Enter Numer to select  : default is 1");
     
        int selection = 2;
        
        if(selection==1){
            //this method brought from main method 
             
             ArrayList<Country> Countries = data.getCountries();
          
                for(Country c : Countries){
                System.out.println(c);
        }if(selection==2){
                 Country noc = data.SearchCountrybyname("ireland");
        // PRINTING MATCHING RECORD.
                System.out.println(noc);
            
        }else if (selection==3){
                Country c = data.SearchCountrybycode("353");
            // PRINTING COUNTRY DETAIL THAT HAS BEEN MATCH 
                System.out.println(c);
        }else if (selection==4){
            
            System.out.println("Enter all detail first ");   
            
            String code=null;
            String name=null;
            String Continent= null;
            String Surfacearea=null;
            String HeadofState=null;
            
                // THIS REFERNCES TO METHOD TO ADD COUNTRY DEATAIL (CELL IN DB)
                Country newentry = new Country( code,name, Continent, Surfacearea,HeadofState);
                //PREVIUS SETUP OBJECT CREATS SQL SENTENCE  
                //PRINT ST. GETTING CONFIRMATION OF PROCESS DONE..
                System.out.println(data.insertCountry(newentry));
        }else {
        
                System.out.println("You are entering wrong detail");   
        }

            
        
        
        
        
        
        
         
     }
    
    
     }}
