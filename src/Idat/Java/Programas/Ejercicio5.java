package Idat.Java.Programas;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Información de atletas", "Maratón Athenas 2022", JOptionPane.INFORMATION_MESSAGE);
        int li = Integer.parseInt(JOptionPane.showInputDialog("Lima"));
        int ic = Integer.parseInt(JOptionPane.showInputDialog("Ica"));
        int ta = Integer.parseInt(JOptionPane.showInputDialog("Tacna"));
        int tu = Integer.parseInt(JOptionPane.showInputDialog("Tumbes"));

        int total = li + ic + ta + tu;

        JOptionPane.showMessageDialog(null, "El total de concursantes son de: " + total);
    }
}
