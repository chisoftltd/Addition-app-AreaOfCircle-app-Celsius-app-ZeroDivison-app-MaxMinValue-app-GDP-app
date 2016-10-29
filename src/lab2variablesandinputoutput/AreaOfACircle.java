/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author 1609963 (Benjamin Chinwe) 
 * 
 * 8.  Write a Java application to satisfy the following requirements.  
 *           • Prompt the user for a number representing the radius of a circle 
 *             (convert and store the input in a double variable called  ).  
 *           • Use the value to calculate the area of a circle of that radius 
 *             using the formula  =  ∗ ∗ (Math.PI is a constant stored in the 
 *             Math class holding the value  = 3.1415…) 
 *           • Output a message of the form “Circle of radius R has area ”  
 *             where  and  should be the numerical values stored in the program. 
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    static int radius;
    static double area;

    public static void main(String[] args) {
        // TODO code application logic here
        UIManager.put("OptionPane.minimumSize", new Dimension(150, 150));

        radius = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter radius of the circle: "));

        // calculate fahrenhet
        area = 3.1415 * radius * radius;

        JOptionPane.showMessageDialog(null, "Circle of raduis " + radius + " has area " + area);

    }
}
