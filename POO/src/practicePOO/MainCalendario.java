package practicePOO;
import java.util.Scanner;
public class MainCalendario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear un calendario con una fecha inicial
        System.out.println("Introduce el año:");
        int año = sc.nextInt();
        System.out.println("Introduce el mes:");
        int mes = sc.nextInt();
        System.out.println("Introduce el día:");
        int dia = sc.nextInt();

        try {
            Calendario calendario = new Calendario(año, mes, dia);
            calendario.mostrar();

            // Incrementar un día
            System.out.println("Incrementando un día...");
            calendario.incrementarDia();
            calendario.mostrar();

            // Incrementar un mes
            System.out.println("Incrementando un mes...");
            calendario.incrementarMes();
            calendario.mostrar();

            // Incrementar 5 años
            System.out.println("Incrementando 5 años...");
            calendario.incrementarAño(5);
            calendario.mostrar();

            // Comparar con otra fecha
            Calendario otraFecha = new Calendario(2025, 1, 1);
            System.out.println("¿Las fechas son iguales? " + calendario.iguales(otraFecha));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
