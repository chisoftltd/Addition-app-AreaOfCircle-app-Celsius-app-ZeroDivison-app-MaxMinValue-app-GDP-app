/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

/**
 *
 * @author 1609963
 */
public class RemoveAsManyBrackets {

    /**
     * @param args the command line arguments
     */
    static int a;
    static int b;
    static int x;
    static int y;

    public static void main(String[] args) {
        // TODO code application logic here
        a = 2;
        b = 2;
        x = 2;
        y = 2;

        System.out.println("((x * y) + 2) - ( 3 * ((a * b) - 4)) =" + (((x * y) + 2) - (3 * ((a * b) - 4))));
        System.out.println("(x * y + 2) - ( 3 * ((a * b) - 4)) =" + ((x * y + 2) - (3 * ((a * b) - 4))));
        System.out.println("(x * y + 2) - ( 3 * (a * b - 4)) =" + ((x * y + 2) - (3 * (a * b - 4))));
        System.out.println("");
        System.out.println("(x * y + 2) - ( 3 * a * b - 4) =" + ((x * y + 2) - (3 * a * b - 4)));
        System.out.println("");
        System.out.println("x * y + 2 - ( 3 * (a * b - 4)) =" + (x * y + 2 - (3 * (a * b - 4))));
        System.out.println("x * y + 2 -  3 * (a * b - 4) =" + (x * y + 2 - 3 * (a * b - 4)));
        System.out.println("");
        System.out.println("x * y + 2 -  3 * a * b - 4 =" + (x * y + 2 - 3 * a * b - 4));
    }
}
