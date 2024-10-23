import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        //solicitar ingresar la base del triángulo
        System.out.print("Ingresa la base del triángulo: ");
        double base = sc.nextDouble();

        //solicitar ingresar la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = sc.nextDouble();

        //calcula el área del triángulo
        double area = (base * altura) / 2;

        //mostrar el resultado:
        System.out.println("El área del triángulo es: " + area);

        sc.close();
    }
}
