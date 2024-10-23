import javax.swing.*;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese la primera nota:");
        int nota1=Integer.parseInt(a);
        String b= JOptionPane.showInputDialog("ingrese la segunda nota:");
        int nota2=Integer.parseInt(b);

        double media=(nota1+nota2)/2;
        JOptionPane.showMessageDialog(null,"la media es:"+media);


    }
}
