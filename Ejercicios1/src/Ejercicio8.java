import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

         boolean mayorEdad= edad >17 ? true: false;

         System.out.println("mayor de edad= " +mayorEdad);

    }
}
