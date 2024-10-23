import javax.swing.*;
import java.util.Scanner;

public class Ejercio15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingresa el coeficiente a: ");
        double coefA=Double.parseDouble(a);
        String b= JOptionPane.showInputDialog("ingresa el coeficiente b: ");
        double coefB=Double.parseDouble(b);
        String c= JOptionPane.showInputDialog("ingresa el coeficiente c: ");
        double coefC=Double.parseDouble(c);

        String d= JOptionPane.showInputDialog("ingresa el valor de x: ");
        double x=Double.parseDouble(d);

        double y=coefA*x+x+coefB*x+coefC;
        JOptionPane.showMessageDialog(null,"el valor de y es: "+y);
    }
}
