import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //definimos que muestre la tabla del 1 al 10
        for (int i=0; i<=10; i++){
            System.out.println("tabla del "+i+ ":");
            //y para cada tabla muestra la multiplicación del 1 al 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
