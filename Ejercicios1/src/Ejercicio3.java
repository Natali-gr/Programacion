import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        int proximaEdad= edad+1;
        System.out.println("su edad del próximo año será: "+proximaEdad);
    }
}
