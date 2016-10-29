package lab2variablesandinputoutput;


import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1609963
 */
public class CelsiusTemperature2 {
  

    /**
     * @param args the command line arguments
     */
    static int celsiusTemperature;
    static double fahrenheitTemperature;
    static int numberOfSeconds;

    public static void main(String[] args) {
        // TODO code application logic here
        UIManager.put("OptionPane.minimumSize", new Dimension(150, 150));
        
        celsiusTemperature = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter temperature in celsius! "));
        
        // calculate fahrenhet
        fahrenheitTemperature = 1.8 * celsiusTemperature + 32;

        JOptionPane.showMessageDialog(null, celsiusTemperature + " Celsius equals " + fahrenheitTemperature + " Fahrenheit");

    }
}


