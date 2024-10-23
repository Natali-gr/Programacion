import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de la semana (1=Lunes, 5=Viernes): ");
        int dia = sc.nextInt();

        System.out.print("Introduce la hora (formato 24 horas): ");
        int hora = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();

        // El viernes a las 15:00 son 5 días, 15 horas, 0 minutos
        int minutosFinSemana = (4 * 24 * 60) + (15 * 60); // Total minutos hasta el viernes a las 15:00

        // Convertir el día y hora actual a minutos
        int minutosActual = ((dia - 1) * 24 * 60) + (hora * 60) + minutos;

        // Calcular la diferencia
        int minutosRestantes = minutosFinSemana - minutosActual;

        System.out.println("Faltan " + minutosRestantes + " minutos para el fin de semana.");

        sc.close();
    }
}
