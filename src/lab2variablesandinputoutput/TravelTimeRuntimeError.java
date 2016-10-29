/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class TravelTimeRuntimeError {

    public static void main(String[] args) {
        String number1, number2;
        Double dist, speed;
        dist = JOptionPane.showInputDialog("Enter dist (in miles) "); 
        speed = JOptionPane.showInputdialog("Enter speed (in mph) ");
        distance = Double.parseDouble(number1);
        speed = Double.parseDouble(number2);
        JOptionPane.showMessageDialog(null, "Time taken  = " + (dist / speed) + " hours");
    }
}
