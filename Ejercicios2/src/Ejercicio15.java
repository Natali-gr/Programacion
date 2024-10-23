import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar ingresar los coeficientes a, b y c
        System.out.print("Ingresa el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Ingresa el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Ingresa el coeficiente c: ");
        double c = sc.nextDouble();

        // Solicitar  ingrese el valor de x
        System.out.print("Ingresa el valor de x: ");
        double x = sc.nextDouble();

        // Calcular el valor de y usando la fórmula del polinomio de segundo grado
        double y = a * x * x + b * x + c;

        //mostrar resultado
        System.out.println("El valor de y es: " + y);

        sc.close();
    }
}
