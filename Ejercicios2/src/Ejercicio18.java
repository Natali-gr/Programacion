import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar ingrese el número de hormigas capturadas
        System.out.print("Ingresa el número de hormigas capturadas: ");
        int hormigas = sc.nextInt();

        // Solicitar ingrese el número de arañas capturadas
        System.out.print("Ingresa el número de arañas capturadas: ");
        int aranas = sc.nextInt();

        // Solicitar ingrese el número de cochinillas capturadas
        System.out.print("Ingresa el número de cochinillas capturadas: ");
        int cochinillas = sc.nextInt();

        // Calcular el número total de patas
        int patasHormigas = hormigas * 6;
        int patasAranas = aranas * 8;
        int patasCochinillas = cochinillas * 14;
        int totalPatas = patasHormigas + patasAranas + patasCochinillas;

        //muestra el resultado
        System.out.println("El número total de patas es: " + totalPatas);

        sc.close();
    }
}
