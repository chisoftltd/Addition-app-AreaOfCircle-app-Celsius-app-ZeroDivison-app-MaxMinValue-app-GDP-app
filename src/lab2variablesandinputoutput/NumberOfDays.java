/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * Develop a program that will 
 *    • prompt the user for a number representing a period of time measured in days. 
 *    • convert the input number of days into two integer values representing the 
 *      equivalent  period in weeks and days.  
 *    • display the results.
 * 
 */
public class NumberOfDays {

    /**
     * @param args the command line arguments
     */
    static int numberOfDays;

    public static void main(String[] args) {
        // TODO code application logic here
       
        /*GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();

        for (int index = 0; index < fontNames.length; index++) {
            System.out.println(fontNames[index]);
        }*/

        UIManager.put("OptionPane.minimumSize", new Dimension(150, 150));
        //UIManager.put("OptionPane.font", new Font("Times New Roman", Font.BOLD, 50));
        numberOfDays = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of days! "));

        JOptionPane.showMessageDialog(null, numberOfDays + " days equals " + (numberOfDays / 7) + " weeks and " + (numberOfDays % 7) + " days");

    }
}
