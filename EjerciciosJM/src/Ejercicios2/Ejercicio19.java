package Ejercicios2;
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar
         en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el usuario).
         Existen dos tipos de entrada: infantiles, que cuestan 15,50€; y de adultos, que cuesta 20€.  */

        System.out.println("Ingrese la cantidad de entradas que requiere:");
        System.out.print("Cuantas entradas infantiles necesita: ");
        int entradasInfantil=sc.nextInt();
        System.out.print("Cuantas entradas de adultos necesita: ");
        int entradasAdultos=sc.nextInt();

        double precioInfantil=15.50 * entradasInfantil;
        int precioAdulto=20 * entradasAdultos;

        double precioTotal= precioInfantil + precioAdulto;
        System.out.print("El precio total de las entradas es : "+precioTotal);
    }
}
