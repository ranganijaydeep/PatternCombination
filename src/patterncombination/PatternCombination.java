/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncombination;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jaydeep Rangani
 */
public class PatternCombination extends JFrame  {

    /**
     * @param args the command line arguments
     */
    public PatternCombination(){
        GUI();
        
        
    }
    
    public  void GUI(){
        JPanel mainpanel= new JPanel();
        JButton firstbutton=new JButton();
        mainpanel.add(firstbutton);
        this.add(mainpanel);
         System.out.println(mainpanel);
        
        
    }
        
    public static void main(String[] args) {
        new PatternCombination(); 
        
    }
    
}
