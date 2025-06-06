package Ejercicios2;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crea un programa que pida la base y la altura de un triángulo y muestre su área.  Á𝑟𝑒𝑎 𝑡𝑟𝑖𝑎𝑛𝑔𝑢𝑙𝑜 = 𝑏𝑎𝑠𝑒 ∗𝑎𝑙𝑡𝑢𝑟𝑎 2

        System.out.println("ingrese la base del triángulo: ");
        int base=sc.nextInt();
        System.out.println("ingrese la altura del triángulo: ");
        int altura=sc.nextInt();

        int area=(base*altura)/2;
        System.out.print("El área del triángulo es: "+area);
    }
}
