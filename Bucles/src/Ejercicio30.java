import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //definimos las variables
        int suma = 0;
        int dinero;

        //se pide que repita e ingrese las cantidades de dinero
        do {
            System.out.println("ingrese las cantidades de dinero que dispone; si no desea introducir más ingrese 0 :");
             dinero = sc.nextInt();
             //se va sumando lo ingresado
            suma = suma + dinero;
        //se repite hasta q el usuario introduzca 0
        } while (dinero != 0);
        //se muestra el resultado de la suma
        System.out.println("La suma total de su dinero es: "+suma);
    }
}
