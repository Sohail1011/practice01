package Idat.Java.Programas;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos a Daster Pio", "Inicio", JOptionPane.PLAIN_MESSAGE);
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa su cantidad de pollo"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de gaseosas personales"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad helado"));
        float res1 = (float) (n1 * 19.50);
        float res2 = (float) (n2 * 3.50);
        float res3 = (float) (n3 * 2.10);
        float tot = res1 + res2 + res3;
        JOptionPane.showMessageDialog(null, "El pollo es de: " + res1
                + "\nLas gaseosas es de: " + res2 + "\nLos helados es de: " + res3 + "\nEl total es: " + tot);
    }
}
