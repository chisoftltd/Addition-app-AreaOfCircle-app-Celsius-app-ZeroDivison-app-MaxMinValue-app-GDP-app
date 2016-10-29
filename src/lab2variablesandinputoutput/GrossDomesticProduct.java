/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2variablesandinputoutput;

import java.math.BigInteger;

/**
 *
 * @author 1609963 (Benjamin Chinwe) 
 * 
 * The gross domestic product (GDP -- the
 * value of all goods, services traded) of the United Kingdom amounts to
 * approximately 1,550,000,000,000 pounds sterling per year.
 *
 * Could a Java program using variables of the type int, be used to store the
 * GDP? Explain and suggest an alternative data type if necessary.
 */
public class GrossDomesticProduct {

    /**
     * @param args the command line arguments
     */

    //static int grossDomisticValue;  Value too large for data type int
    static BigInteger grossDomisticValue = BigInteger.ZERO;

    public static void main(String[] args) {
        // TODO code application logic here
        grossDomisticValue = new BigInteger("1550000000000");
        /*
        We can use BigInteger variable to store values that are bigger than
        the max value of "int" or "long"
         */

        System.out.println("GrossDomesticProduct = " + grossDomisticValue + "\n"
                + "We can use BigInteger variable to store values that are bigger than\n"
                + "        the max value of \"int\" or \"long\"");
    }

}
