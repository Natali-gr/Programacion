import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ingresar la distancia en millas
        System.out.println("Ingrese la distancia en millas marinas: ");
         final double milla= sc.nextDouble();

        //convertir distancia a metros
        final double metro=milla*1852;
        System.out.println("El valor de la distancia en metro es: "+metro);

    }
}
