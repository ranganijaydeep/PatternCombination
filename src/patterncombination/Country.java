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
    
    //Steeing up all object for each row 
    private String code; // well i did int but database has errors so i can not use int 
    private String name;//  
    private String continent;
    private String surfacearea;
    private String headofstate;
    
    
     public Country (String code,String name,String continent,String surfacearea,String headofstate) {
        this.code=code;
        this.name=name;
        this.continent=continent;
        this.surfacearea=surfacearea;
        this.headofstate=headofstate;     
     }

    

      
  // setting getter and seeter method to uses and encapsulatiting DAO 
    public String getCode() {
        return code;
    }

    
    
    public void setCode(String code) {
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

   
    
    public String getSurfacearea() {
        return surfacearea;
    }

    

    public void setSurfacearea(String surfacearea) {
        this.surfacearea = surfacearea;
    }

   
  
    public String getHeadofstate() {
        return headofstate;
    }

    
   
    public void setHeadofstate(String headofstate) {
        this.headofstate = headofstate;
    }
    
    @Override
	public String toString() {
		return "Code: " + code + ", NAME: " + name + ", Continent: " + continent + ", SurfaceArea: " + surfacearea + ", HeadOfState: " + headofstate;
	}
    
    
}
