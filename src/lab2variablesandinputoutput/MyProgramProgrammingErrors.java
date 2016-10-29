/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class MyProgramProgrammingErrors {

    public static void main(String[] args) {
        String strDays, strHours;
        int days, hours;
        strDays = JOptionPane.showinputDialog("Enter number of days: ");
        days = Integer.parseInt(strDays);
        strHours = JOptionPane.showInputDialog("Enter number of hours:");
        totalHours = days * 24 + hours;
        JOptionPane.showMessageDialog(null, "totalHours = "  totalHours) ;  
    } 
}
