import javax.swing.*;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        String a= JOptionPane.showInputDialog("ingrese un número");
        int num=Integer.parseInt(a);

        boolean numeroPar=num%2==0? true:false;
        JOptionPane.showMessageDialog(null,"el número es par: "+numeroPar);
    }
}
