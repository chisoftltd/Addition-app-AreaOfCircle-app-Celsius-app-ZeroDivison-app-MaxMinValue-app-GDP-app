/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.UIManager;

/**
 *
 * @author 1609963 (Benjamin Chinwe) 
 * 
 * 6.  Write a Java application to satisfy the following requirements. 
 *     Prompt the user for a five digit number. Separate the number into its 
 *     constituent digits. Print all digits in the order that they appear 
 *     inside the original number. Each digit should be separated from 
 *     its neighbour by 3 spaces 
 */
public class SeparateDigits2 {
    static String number;
    static char firstDigit;
    static char secondDigit;
    static char thirdDigit;
    static char fouthDigit;
    static char fifthDigit;

    public static void main(String[] args) {
        // TODO code application logic here
       
        UIManager.put("OptionPane.minimumSize", new Dimension(150, 150));
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five digits number: ");
        number = input.next();

        if (number.length() != 5) {
            System.out.println("Number most be five digits! ");
            System.out.print("Enter five digits number: ");
            number = input.next();
        }
        firstDigit = number.charAt(0);
        secondDigit = number.charAt(1);
        thirdDigit = number.charAt(2);
        fouthDigit = number.charAt(3);
        fifthDigit = number.charAt(4);

        //JOptionPane.showMessageDialog(null, firstDigit + "\t\t\t" + secondDigit + "\t\t\t" + thirdDigit + "\t\t\t" + fouthDigit + "\t\t\t" + fifthDigit);
        System.out.println("input of " + number + " will display     " + firstDigit + "\t" + secondDigit + "\t" + thirdDigit + "\t" + fouthDigit + "\t" + fifthDigit);
    }
}
