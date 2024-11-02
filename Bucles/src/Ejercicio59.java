import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer el año
        System.out.print("Introduce un año: ");
        int año = sc.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        // Mostrar resultado
        if (esBisiesto) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}
