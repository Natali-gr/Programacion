import java.util.Random;
public class Ejercicio9 {
    public static void main(String[] args) {
        // Definir tres arrays de 20 números enteros
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        // Generar valores aleatorios para "numero" y calcular sus potencias
        Random random = new Random();
        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(101); // Valores aleatorios entre 0 y 100
            cuadrado[i] = numero[i] * numero[i]; // Cuadrado del número
            cubo[i] = numero[i] * numero[i] * numero[i]; // Cubo del número
        }

        // Mostrar el contenido de los tres arrays en tres columnas
        System.out.printf("%-10s %-10s %-10s%n", "Número", "Cuadrado", "Cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d %-10d %-10d%n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
