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
 * 3. Which of the following are valid Java assignment statements. (all
 * variables have the type int). x = 123 ; y = -123 ; x + 1 = z ; 123 = x - z ;
 * z = (x + y ) / z ;
 *
 */
public class ValidJavaAssignmentStatement {

    /**
     * @param args the command line arguments
     */
    static int x;
    static int y;
    static int z;

    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println(x = 123); //Valid
        System.out.println(y = -123); //Valid
        //System.out.println(x + 1 = z); //Not Valid
        //System.out.println(123 = x - z ); //Not Valid
        System.out.println(z = (x + y) / z); // Valid
    }

}
