import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar ingrese una cantidad de segundos
        System.out.print("Ingresa una cantidad de segundos: ");
        int totalSegundos = sc.nextInt();

        // Calcula la cantidad de horas
        int horas = totalSegundos / 3600;

        // Calcula el residuo en segundos
        int segundosRestantes = totalSegundos % 3600;

        // Calcula la cantidad de minutos
        int minutos = segundosRestantes / 60;

        // Calcular los segundos restantes
        int segundos = segundosRestantes % 60;

        //muestra el resultado
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        sc.close();
    }
}
