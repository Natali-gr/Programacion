import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el año actual : ");
        int anioActual= sc.nextInt();
        System.out.println("Ingrese su año de nacimiento : ");
         int fechaNac = sc.nextInt();

         int edad= anioActual - fechaNac;
         System.out.println("su edad es: "+ edad);
    }
}
