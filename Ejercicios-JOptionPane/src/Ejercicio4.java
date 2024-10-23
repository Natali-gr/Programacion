import javax.swing.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String numero= JOptionPane.showInputDialog("ingrese el año actual");
        int año= Integer.parseInt(numero);

        String num=JOptionPane.showInputDialog("ingrese su año de nacimiento");
        int fechaNac= Integer.parseInt(num);

        int edad=año-fechaNac;
        JOptionPane.showMessageDialog(null,"su edad es: "+edad);
    }
}
