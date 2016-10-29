/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

/**
 *
 * @author 1609963 (benjamin Chinwe)
 *
 * (a) declare a double variable and calculate and display the values of sin(	),
 * cos(), tan(	), log(), exp(	) and √
 *
 * (b) declare two int variables a and n and calculate and display 1
 *
 * (c) declare two double variables x and y and calculate and display the
 * maximum and minimum of the two.
 */
public class JavaStatementsNo9 {

    /**
     * @param args the command line arguments
     */
    static double x;
    static int a;
    static int n;
    static double y;
    static double z;

    public static void main(String[] args) {
        // TODO code application logic here
        x = 5.0;
        a = 5;
        n = 5;
        y = 5.0;
        z = 3.0;
        
        System.out.println("sin(x) : " + Math.sin(x));

        System.out.println("cos(x) : " + Math.cos(x));

        System.out.println("tan(x) : " + Math.tan(x));

        System.out.println("log(x) : " + Math.log(x));

        System.out.println("exp(x) : " + Math.exp(x));

        System.out.println("sqrt(x) : " + Math.sqrt(x));

        System.out.println("a^n : " + Math.pow(a, n));
        
        
    }
}
