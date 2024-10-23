import javax.swing.*;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("Ingrese la primera distancia en milimetros");
        double milimetro= Double.parseDouble(a);
        String b= JOptionPane.showInputDialog("Ingrese la primera distancia en centimetros");
        double centimetro= Double.parseDouble(b);
        String c= JOptionPane.showInputDialog("Ingrese la primera distancia en metros");
        double metro= Double.parseDouble(c);

        double milimetroEnCentimetro=milimetro/10;
        double metroEnCentimetro=metro*100;
        double sumaTotalCentimetro=milimetroEnCentimetro+centimetro+metroEnCentimetro;

        JOptionPane.showMessageDialog(null,"la suma de las tres distancias: "+sumaTotalCentimetro+" centimetros");
    }
}
