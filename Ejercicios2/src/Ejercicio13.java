import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //solicitar que ingrese el número n
        System.out.println("Ingresa el número n: ");
        int n = sc.nextInt();

        //solicitar que ingrese el número m
        System.out.println("Ingresa el número m: ");
        int m = sc.nextInt();

        //calcular el residuo entre n y m
        int residuo = n % m;

        //si el residuo es 0, n ya es múltiplo de m
        int cantidadASumar;
        if (residuo == 0) {
            cantidadASumar = 0;
        } else {
            //sumamos m menos el residuo
            cantidadASumar = m - residuo;
        }

        //mostrar resultado
        System.out.println("A " + n + " hay que sumarle " + cantidadASumar + " para que sea múltiplo de " + m + ".");

        sc.close();
    }
}
