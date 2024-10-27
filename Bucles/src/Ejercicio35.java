import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        // pedimos ingresar el año de inicio y fin del rango
        System.out.print("ingresa el primer año: ");
        int anioInicio = sc.nextInt();

        System.out.print("ingresa el segundo año: ");
        int anioFin = sc.nextInt();

        System.out.println("Años bisiestos y múltiplos de 10 en el rango dado:");

        //se verifica las condiciones
        for (int anio = anioInicio; anio <= anioFin; anio++) {

            // Condición para verificar si el año es bisiesto y múltiplo de 10
            if (((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) && anio % 10 == 0) {
                System.out.println(anio);
            }
        }
    }
}
