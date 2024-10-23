import javax.swing.*;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String a = JOptionPane.showInputDialog("Ingresa un número");
        int num = Integer.parseInt(a);

        int residuo=num%7;
        int cantidadASumar=0;

        JOptionPane.showMessageDialog(null,"A "+num+" hay que sumarle "+cantidadASumar+" para que sea múltiplo de 7");
    }
}



