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
public class Country  {
    private int code; 
    private String name;
    private String continent;
    private float surfacearea;
    private char headofstate;
    
    
     public Country (int code,String name,String continent,float surfacearea,char headofstate) {
        this.code=code;
        this.name=name;
        this.continent=continent;
        this.surfacearea=surfacearea;
        this.headofstate=headofstate;     
     }

    Country(int code, String name, String Continent, float Surfacearea, String headofState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
  
    public int getCode() {
        return code;
    }

    
    
    public void setCode(int code) {
        this.code = code;
    }

       
    public String getName() {
        return name;
    }

   
  
    public void setName(String name) {
        this.name = name;
    }

    

    public String getContinent() {
        return continent;
    }

    
    
    public void setContinent(String continent) {
        this.continent = continent;
    }

   
    
    public float getSurfacearea() {
        return surfacearea;
    }

    

    public void setSurfacearea(float surfacearea) {
        this.surfacearea = surfacearea;
    }

   
  
    public char getHeadofstate() {
        return headofstate;
    }

    
   
    public void setHeadofstate(char headofstate) {
        this.headofstate = headofstate;
    }
    
    
    
    
}
