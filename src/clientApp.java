//JAYDEEP RANGANI 2017016
// reference .. this class is majority part from class notes and Moodle Labs Projects. 
// credit (teacher): amilcar aponte ..



import java.util.ArrayList;
import java.util.Scanner;
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
         
         
        System.out.println("1. Show all country ");
        System.out.println("2. Retrieve records by country name");
        System.out.println("3. Retrieve records by country code ");
        System.out.println("4. Add new records into the database ");
        System.out.println("Enter Numer to select  : default is 1");
     
        
        new choiceprocessor();
     }
               
        public static class choiceprocessor {
            
            public choiceprocessor(){
                              
                Scanner scn= new Scanner(System.in);
                String userinput=scn.nextLine();
                
                               
                int choice=Integer.parseInt(userinput);
                
                
                 CountryINT  data= new CountryDAO();
                
                 if(choice==1){
            //this method brought from main method 
             
             ArrayList<Country> Countries = data.getCountries();
          
                for(Country c : Countries){
                System.out.println(c);
        }if(choice==2){
          Country noc = data.SearchCountrybyname("ireland");
        // PRINTING MATCHING RECORD.
                System.out.println(noc);
            
        }else if (choice==3){
                Country c = data.SearchCountrybycode("353");
            // PRINTING COUNTRY DETAIL THAT HAS BEEN MATCH 
                System.out.println(c);
        }else if (choice==4){
            
            System.out.println("Enter all detail first ");   
            
            System.out.println("Enter country code : ");   
            String code=userinput;
            System.out.println("Enter country code : "); 
            String name=userinput;
            System.out.println("Enter country code : "); 
            String Continent= userinput;
            System.out.println("Enter country code : "); 
            String Surfacearea=userinput;
            System.out.println("Enter country code : "); 
            String HeadofState=userinput;
            
                // THIS REFERNCES TO METHOD TO ADD COUNTRY DEATAIL (CELL IN DB)
                Country newentry = new Country( code,name, Continent, Surfacearea,HeadofState);
                //PREVIUS SETUP OBJECT CREATS SQL SENTENCE  
                //PRINT ST. GETTING CONFIRMATION OF PROCESS DONE..
                System.out.println(data.insertCountry(newentry));
        }else {
        
                System.out.println("You are entering wrong detail");   
        }
                
            }
                
        }
        
        
       

            
        
        
        
        
        
        
         
     }
    
    
     }
