import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese el número de hormigas capturadas");
        int hormiga=    Integer.parseInt(a);
        String b= JOptionPane.showInputDialog("ingrese el número de arañas capturadas");
        int araña=    Integer.parseInt(b);
        String c= JOptionPane.showInputDialog("ingrese el número de cochinillas capturadas");
        int cochinilla=    Integer.parseInt(c);

        int pataHormiga=hormiga*6;
        int pataAraña=araña*8;
        int pataCochinilla=cochinilla*14;
        int totalPatas=pataCochinilla+pataAraña+pataHormiga;

        JOptionPane.showMessageDialog(null,"el número total de patas es: "+totalPatas);
    }
}
