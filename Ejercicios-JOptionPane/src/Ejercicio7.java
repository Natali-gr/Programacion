import javax.swing.*;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese el radio");
        double radio=Double.parseDouble(a);

        double longitud=2*Math.PI*radio;
        double area=Math.PI* radio*radio;

        JOptionPane.showMessageDialog(null,"el area es: "+area);
        JOptionPane.showMessageDialog(null,"la longitud es:"+longitud);
    }
}
