package practicePOO;
import  java.util.Scanner;
public class MainHora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer hora inicial
        System.out.println("Introduce la hora (0-23):");
        int hora = sc.nextInt();
        System.out.println("Introduce el minuto (0-59):");
        int minuto = sc.nextInt();
        System.out.println("Introduce el segundo (0-59):");
        int segundo = sc.nextInt();

        // Crear objeto Hora
        Hora tiempo = new Hora(hora, minuto, segundo);

        // Leer cantidad de segundos a incrementar
        System.out.println("Introduce el número de segundos:");
        int n = sc.nextInt();

        // Mostrar las n horas siguientes
        System.out.println("Hora inicial:");
        tiempo.mostrarHora();

        for (int i = 0; i < n; i++) {
            tiempo.avanzarSegundo();
            tiempo.mostrarHora();
        }

        sc.close();
    }
}
