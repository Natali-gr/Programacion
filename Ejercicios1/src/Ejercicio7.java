import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area= Math.PI * radio * radio;
        System.out.println("El area es: "+area);
        System.out.println("La longitud es: "+longitud);
        sc.close();
    }
}
