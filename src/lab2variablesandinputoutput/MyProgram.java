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
 * What  values are displayed by the following program: 
 */
public class MyProgram {

    public static void main(String[] args) {
        int x1, x2, x3, x4;
        int y = 31, z = 28;
        x1 = y + z / 7;
        x2 = (y + z) / 7;
        x3 = y + z % 7;
        x4 = (y + z) % 7;
        System.out.println("x1 = " + x1 + "\n x2 = " + x2);
        System.out.println("x3 = " + x3 + "\n x4 = " + x4);
    }
}
