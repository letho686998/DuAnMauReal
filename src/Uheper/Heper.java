/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uheper;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Heper {

    public static boolean checkRong(JTextField tf, String mss) {
        if (tf.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, mss);
            tf.requestFocus();
            return true;
        }
        return false;
    }
    
}
