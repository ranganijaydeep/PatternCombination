/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncombination;

/**
 *
 * @author Jaydeep Rangani
 */
public class PatternCombination   {

    
    public PatternCombination(){     
        //int to get nuber for selcection 
        int sn =1 ;
      //  DBconnect connect= new DBconnect();
        System.out.println("1. Show all country ");
        System.out.println("2. Retrieve records by country name");
        System.out.println("3. Retrieve records by country code ");
        System.out.println("4. Add new records into the database ");
        System.out.println("Enter Numer to select  :" + sn );
        
         if (sn==1){
             //DBconnect connect= new DBconnect();
            // connect.getAllCountryData();
         }
         if (sn==2){
             System.out.println("2. Retrieve records by country name");
         }
         if (sn==3){
             System.out.println("3. Retrieve records by country code ");
         }
         if (sn==4){
             System.out.println("4. Add new records into the database ");
         }else{
             System.out.println(" Enter valid number :  ");
         }
         
    }
    public static void main(String[] args) {
        PatternCombination patternCombination = new PatternCombination(); 
        
    }
    
}
