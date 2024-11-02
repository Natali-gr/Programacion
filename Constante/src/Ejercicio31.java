import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        // Precios por kilo
        final double PrecioManzanas = 2.35;
        final double PrecioPeras = 1.95;

        // Solicitamos ventas del primer semestre:
        System.out.println("Ingresa las ventas en kilos para el primer semestre:");
        System.out.print("Ventas de manzanas: ");
        double ventasManzana = sc.nextDouble();
        System.out.print("Ventas de peras: ");
        double ventasPera = sc.nextDouble();

        // Solicitamos ventas del segundo semestre
        System.out.println("Ingresa las ventas en kilos para el segundo semestre:");
        System.out.print("Ventas de manzanas: ");
        double ventasManzana2 = sc.nextDouble();
        System.out.print("Ventas de peras: ");
        double ventasPera2 = sc.nextDouble();

        // Calcular los beneficios
        double totalManzanas = (ventasManzana+ventasManzana2) * PrecioManzanas;
        double totalPeras = (ventasPera+ventasPera2) * PrecioPeras;
        double totalBeneficios = totalManzanas + totalPeras;

        // Mostrar los resultados
        System.out.println("Total beneficios de manzanas:€ "+ totalManzanas);
        System.out.println("Total beneficios de peras: €"+ totalPeras);
        System.out.println("Beneficio total anual: €"+totalBeneficios);
    }
}
