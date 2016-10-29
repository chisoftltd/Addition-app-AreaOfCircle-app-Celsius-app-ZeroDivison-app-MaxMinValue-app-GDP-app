/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe) 
 * 
 * 3. Edit, compile and run a class called
 * Addition.java that will request the user to input two integers, and which
 * will then display their sum.
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    static int firstNumber;
    static int secondNumber;

    public static void main(String[] args) {
        // TODO code application logic here
        /*
         *  (a)  First use JOptionPane.showInputDialog and 
         *       JOptionPane.showMessageDialog method for the input and output 
         *       aspects of the task         
         */
        firstNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter first ineger number"));
        secondNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter second integer number"));

        JOptionPane.showMessageDialog(null, "Sum of the two integers " + firstNumber + " "
                + "and " + secondNumber + " is " + (firstNumber + secondNumber) + "\n (b) Then extend the program "
                + "to repeat the same task but using a \n"
                + "        *      Scanner object to deal with user input, and simple println() \n"
                + "        *      methods to System.out for output.");

        /*
        *  (b) Then extend the program to repeat the same task but using a 
        *      Scanner object to deal with user input, and simple println() 
        *      methods to System.out for output.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first ineger number");
        firstNumber = input.nextInt();
        System.out.println("Enter second ineger number");
        secondNumber = input.nextInt();
        System.out.println("Sum of the two integers " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber));
    }
}
