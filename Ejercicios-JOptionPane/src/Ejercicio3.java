import javax.swing.*;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Ejercicio3 {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);

        String numero= JOptionPane.showInputDialog("ingrese su edad");
        int edad= Integer.parseInt(numero);
        int proximaEdad=edad+1;
        JOptionPane.showMessageDialog(null,"su edad del próximo año será: "+ proximaEdad);

    }
}
