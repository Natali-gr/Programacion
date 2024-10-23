import javax.swing.*;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingresa la base del triángulo: ");
        double base=Double.parseDouble(a);
        String b= JOptionPane.showInputDialog("ingresa la altura del triángulo: ");
        double altura=Double.parseDouble(a);

        double area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"el área del triángulo es: "+area);
    }
}
