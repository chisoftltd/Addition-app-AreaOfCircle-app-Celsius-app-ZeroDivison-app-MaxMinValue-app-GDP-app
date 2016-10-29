/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

/**
 *
 * @author 1609963 (Benjamin Chinwe) 2. Implement a Java program that attempts
 * to divide an int (say 100) by 0. What is the outcome of trying to run the
 * program?
 */
public class DivisonByZero {

    /**
     * @param args the command line arguments
     */
    static int a;
    static int b;

    public static void main(String[] args) {
        // TODO code application logic here
        a = 100;
        b = 0;
        //System.out.println("a / b =" + a / b);
        System.out.println("a % b =" + a % b);
    }
}
