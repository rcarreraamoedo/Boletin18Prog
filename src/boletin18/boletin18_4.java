/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class boletin18_4 {
    public void DNIMuestra (int[] numero, char[] letra) {
        int DNI = Integer.parseInt(JOptionPane.showInputDialog("Introduce el DNI a comprobar"));
        int resto = DNI % 23;
        for (int i = 0; i < numero.length; i++) {
            if (resto == numero[i]) {
                JOptionPane.showMessageDialog(null, "La letra es: " + letra[i]);
            }
        }

    }
}
