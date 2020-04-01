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
     
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBconnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://52.50.23.197:3306/world","cctstudent","Pass1234!");
             st=con.createStatement();
                         
             
        }catch (Exception ex){
            System.out.println("Error :"+ex);
        }
        
    }
    public void getData(){
        
        try{
            String query= "select * from country;" ;
            rs =st.executeQuery(query);
            
            System.out.println("Records from database :");
             while (rs.next()){
                 String Code=rs.getString("Code");
                 String Name=rs.getString("Name");
                 String Continent=rs.getString("Continent");
                 String SurfaceArea=rs.getString("SurfaceArea");
                 String HeadOfState=rs.getString("HeadOfState");
                 
                 System.out.println("Code :"+Code+"\t"+"Name :"+Name+"\t"+"Continent :"+Continent+"\t"+"SurfaceArea :"+SurfaceArea+"\t"+"HeadOfState :"+HeadOfState);
                 
                 
             }
            
            
        }catch (Exception ex){
            System.out.println("Error :"+ex);
        } 
        
    }
    
}
