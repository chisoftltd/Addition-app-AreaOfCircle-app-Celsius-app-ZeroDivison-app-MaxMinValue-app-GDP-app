/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 *
 * (a) declare a double variable and assign the number 2.56×10 to
 *
 * (b) store the result of 27	/	4 in an integer variable ; what value will have?
 *
 * (c) store the decimal result of 27	/	4 in a double variable ; what value will
 * have?
 *
 * (c) store the decimal result of 27.0	/	4 in a double variable ; what value
 * will have?
 *
 * (d) assign the result of − in a double variable !
 */
public class JavaStatementsNo8 {

    /**
     * @param args the command line arguments
     */
    static double x;
    static int n;
    static double y;
    static double z;
    static double w;

    public static void main(String[] args) {
        // TODO code application logic here
        x = 2.56 * Math.pow(10, 13);
        System.out.println("x = " + x);

        n = 27 / 4;
        System.out.println("n = " + n);

        y = 27 / 4;
        System.out.println("y = " + y);

        z = 27.0 / 4;
        System.out.println("z = " + z);

        w = x - (y + z) / n;
        System.out.println("w = " + w);
    }
}
