import javax.swing.*;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese la nota del primer trimestre");
        int nota1=Integer.parseInt(a);
        String b= JOptionPane.showInputDialog("ingrese la nota del segundo trimestre");
        int nota2=Integer.parseInt(b);
        String c= JOptionPane.showInputDialog("ingrese la nota del tercer trimestre");
        int nota3=Integer.parseInt(c);

        int media=(nota1+nota2+nota3)/3;
        double mediaDecimal=(nota1+nota2+nota3)/3.0;
        JOptionPane.showMessageDialog(null,"la media entera es: "+media);
        JOptionPane.showMessageDialog(null,"la media con decimal es: "+mediaDecimal);
    }
}
