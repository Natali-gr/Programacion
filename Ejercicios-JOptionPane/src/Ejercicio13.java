import javax.swing.*;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String a = JOptionPane.showInputDialog("Ingresa el número n");
        int n = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog("Ingresa el número m");
        int m = Integer.parseInt(b);

        int residuo=n%m;
        int cantidadASumar=m-residuo;

        JOptionPane.showMessageDialog(null,"A "+n+" hay que sumarle "+cantidadASumar+" para que sea múltiplo de "+m);
    }
}
