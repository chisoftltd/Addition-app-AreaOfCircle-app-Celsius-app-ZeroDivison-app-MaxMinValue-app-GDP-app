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
 * 9. Integer.MAX_VALUE and Integer.MIN_VALUE are class variables of the Integer
 * class. (note: The Integer class is a wrapper class for the int data type )
 *
 * (a) Use these to implement a Java program that will display the smallest and
 * largest integer values representable in a Java program. 
 * 
 * (b) Extend your Java
 * program to display the result of • subtracting 1 from the smallest integer
 * value representable in a Java program, and • adding 1 to the largest integer
 * value representable in a Java program. Can you explain the results? 
 * 
 * (c) Make
 * an educated guess about how you could extend your program to display the
 * largest and smallest possible double values in Java. *
 */
public class MaxMinValue {

    /**
     * @param args the command line arguments
     */
    static int radius;
    static double area;

    public static void main(String[] args) {
        // TODO code application logic here
        /*
         *(a) Use these to implement a Java program that will display the smallest
         *   and largest integer values representable in a Java program. 
         */
        System.out.println("Java Maxmum Integer value is : "
                + Integer.MAX_VALUE + " and Java mumnium Integer value is : " + Integer.MIN_VALUE);

        /* 
        *  (b) Extend your Java program to display the result of  
               • subtracting 1 from the smallest integer value representable 
                 in a Java program, and  
               • adding 1 to the largest integer value representable in a 
                 Java program. 
               Can you explain the results?         
         */
        System.out.println("Java Mumimum Integer value minus 1 is : "
                + (Integer.MIN_VALUE + 1) + " and Java Maximum Integer value plus 1 is : " + (Integer.MAX_VALUE + 1));
        
        /*
        * (c) Make an educated guess about how you could extend your program 
        *     to display the largest and smallest possible double values in 
        *     Java.
        */
        
        System.out.println("Java Maxmum double value is : "
                + Double.MAX_VALUE + " and Java mumnium double value is : " + Double.MIN_VALUE);
    }
}
