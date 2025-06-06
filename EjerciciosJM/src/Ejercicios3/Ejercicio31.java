package Ejercicios3;
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras.
         Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta.
          La aplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.*/

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        // Entradas: kilos vendidos por semestre
        System.out.println("Introduce los kilos de manzanas vendidos en el primer semestre:");
        double manzanasSem1 = sc.nextDouble();

        System.out.println("Introduce los kilos de manzanas vendidos en el segundo semestre:");
        double manzanasSem2 = sc.nextDouble();

        System.out.println("Introduce los kilos de peras vendidos en el primer semestre:");
        double perasSem1 = sc.nextDouble();

        System.out.println("Introduce los kilos de peras vendidos en el segundo semestre:");
        double perasSem2 = sc.nextDouble();

        // Cálculo total anual por fruta
        double totalManzanas = manzanasSem1 + manzanasSem2;
        double totalPeras = perasSem1 + perasSem2;

        // Cálculo de ingresos
        double ingresoManzanas = totalManzanas * PRECIO_MANZANA;
        double ingresoPeras = totalPeras * PRECIO_PERA;
        double ingresoTotal = ingresoManzanas + ingresoPeras;

        // Resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.print("Importe por manzanas: % € \n"+ingresoManzanas);
        System.out.print("Importe por peras: %.2f €\n"+ ingresoPeras);
        System.out.print("Importe total: %.2f €\n"+ ingresoTotal);

    }
}
