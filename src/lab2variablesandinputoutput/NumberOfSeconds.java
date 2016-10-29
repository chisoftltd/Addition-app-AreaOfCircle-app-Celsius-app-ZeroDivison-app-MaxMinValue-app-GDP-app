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
 * 5. Develop a program that will • prompt the user for three (integer) numbers
 *    hours, minutes and seconds representing a period of elapsed time • use the
 *    input values to assign a value to another integer called totalSeconds equal
 *    to the total number of seconds in the elapsed time • Display the result
 *
 */
public class NumberOfSeconds {

    /**
     * @param args the command line arguments
     */
    static int numberOfHours;
    static int numberOfMinutes;
    static int numberOfSeconds;

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();

        for (int index = 0; index < fontNames.length; index++) {
            System.out.println(fontNames[index]);
        }*/
        UIManager.put("OptionPane.minimumSize", new Dimension(150, 150));
        //UIManager.put("OptionPane.font", new Font("Times New Roman", Font.BOLD, 50));
        numberOfHours = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Hours! "));
        numberOfMinutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Minutes! "));
        numberOfSeconds = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Seconds! "));

        JOptionPane.showMessageDialog(null, numberOfHours + " hr, " + numberOfMinutes + " min and " + numberOfSeconds + " sec equals " + ((numberOfHours * 60 * 60) + (numberOfMinutes * 60) + (numberOfSeconds)));

    }
}
