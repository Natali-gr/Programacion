package Ejercicios2;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  Solicita al usuario tres distancias:  - La primera, medida en milímetros  - La segunda, medida en centímetros.
        //  - La tercera, medida en metros. Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).

        System.out.print("Ingrese una distancia medida en milímetros: ");
        int milimetro=sc.nextInt();
        System.out.print("Ingrese una distancia medida en centimetros: ");
        int centimetro=sc.nextInt();
        System.out.print("Ingrese una distancia medida en metros: ");
        int metro=sc.nextInt();

        //convirtiendo a centimetros
        milimetro= milimetro / 10;
        metro= metro * 100;

        int suma= milimetro + centimetro + metro;
        System.out.print("la suma total en centimetros es: "+suma+" cm");
    }
}
