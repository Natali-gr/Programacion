import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("Ingresa la base imponible");
        double base=Double.parseDouble(a);
        String b= JOptionPane.showInputDialog("ingresa el porcentaje del IVA");
        double porcentaje=Double.parseDouble(b);

        double importeIva= base*(porcentaje/100);
        double total=base+importeIva;

        JOptionPane.showMessageDialog(null,"importe del iva es: "+importeIva);
        JOptionPane.showMessageDialog(null,"el total con iva es: "+total);
    }
}
