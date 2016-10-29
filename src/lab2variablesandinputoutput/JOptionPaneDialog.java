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
 */
public class JOptionPaneDialog {

    /**
     * @param args the command line arguments
     */
    static int value;
    static double area;

    public static void main(String[] args) {
        // TODO code application logic here
        UIManager.put("OptionPane.minimumSize", new Dimension(150, 150));

        value = JOptionPane.showConfirmDialog(null, "Please press  Yes, No or Cancel", "Choose!", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (value == JOptionPane.NO_OPTION) {
            System.out.println("The value returned by pressing the confirm button dialog was: " + value);
        } else if (value == JOptionPane.YES_OPTION) {
            System.out.println("The value returned by pressing the confirm button dialog was: " + value);
        } else if (value == JOptionPane.CANCEL_OPTION) {
            System.out.println("The value returned by pressing the confirm button dialog was: " + value);
        }

    }
}
