import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Define los precios de las entradas
        double precioInfantil = 15.50;
        double precioAdulto = 20.00;

        // Solicitar ingrese el número de entradas infantiles
        System.out.print("Ingrese el número de entradas infantiles: ");
        int entradasInfantiles = sc.nextInt();

        // Solicitar ingrese el número de entradas de adultos
        System.out.print("Ingrese el número de entradas de adultos: ");
        int entradasAdultos = sc.nextInt();

        // Calcular el importe total
        double totalInfantil = entradasInfantiles * precioInfantil;
        double totalAdulto = entradasAdultos * precioAdulto;
        double importeTotal = totalInfantil + totalAdulto;

        //mostrar el resultado
        System.out.println("El importe total a cobrar es: " + importeTotal + " €");

        sc.close();
    }
}
