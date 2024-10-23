import javax.swing.*;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese una cantidad de segundos");
        int totalSeg=Integer.parseInt(a);

        int hora=totalSeg/3600;
        int segundosRestantes=totalSeg%3600;
        int min=segundosRestantes/60;
        int seg=segundosRestantes%60;

        JOptionPane.showMessageDialog(null,"horas: "+hora);
        JOptionPane.showMessageDialog(null,"minutos: "+min);
        JOptionPane.showMessageDialog(null,"segundos: "+seg);

    }
}
