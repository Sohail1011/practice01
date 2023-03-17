package Idat.Java.Programas;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenidos a Macarena-Salon de belleza", "Inicio", JOptionPane.PLAIN_MESSAGE);
        int x = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto costo tu cabello?"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto costo el laceado?"));
        float resx = (float) (x - 0.54);
        float resy = (float) (y + 10);
        JOptionPane.showMessageDialog(null, "El corto de cabello con descuento: " + resx
                + "\nEl coste de laceado junto con pintado de uña: " + resy);
    }
}
