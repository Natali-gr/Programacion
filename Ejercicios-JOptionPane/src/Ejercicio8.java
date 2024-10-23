import javax.swing.*;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese su edad:");
        int edad= Integer.parseInt(a);

        boolean mayorEdad= edad>17? true:false;
        JOptionPane.showMessageDialog(null,"mayor de edad= "+mayorEdad);
    }
}
