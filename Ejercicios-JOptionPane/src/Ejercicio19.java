import javax.swing.*;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        double precioInfantil=15.50;
        double precioAdulto=20.00;

        String a= JOptionPane.showInputDialog("ingrese el número de entradas infantiles");
        int entradasInfantiles=Integer.parseInt(a);
        String b= JOptionPane.showInputDialog("ingrese el número de entradas adultos");
        int entradasAdultos=Integer.parseInt(b);

        double totalInfantil=entradasInfantiles+precioInfantil;
        double totalAdulto=entradasAdultos+precioAdulto ;
        double importeTotal=totalInfantil+totalAdulto;

        JOptionPane.showMessageDialog(null,"el importe total a cobrar es: "+importeTotal);
    }
}
