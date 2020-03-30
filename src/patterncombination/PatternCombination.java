/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterncombination;


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
        
        JFrame mainframe =new JFrame();
         mainframe.setVisible(true);
         mainframe.setSize(300,300);
        
        JPanel mainpanel= new JPanel();
        mainpanel.setVisible(true);
        mainpanel.setSize(250, 250);
        JButton firstbutton=new JButton();
        mainpanel.add(firstbutton);
        
        mainframe.add(mainpanel);
        
        this.add(mainpanel);
         System.out.println(mainpanel);
        
        
    }
        
    public static void main(String[] args) {
        new PatternCombination(); 
        
    }
    
}
