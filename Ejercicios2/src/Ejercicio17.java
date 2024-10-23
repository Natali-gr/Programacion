import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar que ingrese la primera distancia en milímetros
        System.out.print("Ingresa la primera distancia en milímetros: ");
        double milimetros = sc.nextDouble();

        // Solicitar que ingrese la segunda distancia en centímetros
        System.out.print("Ingresa la segunda distancia en centímetros: ");
        double centimetros = sc.nextDouble();

        // Solicitar que ingrese la tercera distancia en metros
        System.out.print("Ingresa la tercera distancia en metros: ");
        double metros = sc.nextDouble();

        // Convertir milímetros a centímetros
        double milimetrosEnCentimetros = milimetros / 10;

        // Convertir metros a centímetros
        double metrosEnCentimetros = metros * 100;

        // Calcular la suma de las distancias en centímetros
        double sumaTotalCentimetros = milimetrosEnCentimetros + centimetros + metrosEnCentimetros;

        //muestra el resultado
        System.out.println("La suma de las tres distancias es: " + sumaTotalCentimetros + " centímetros.");

        sc.close();
    }
}
