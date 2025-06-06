package ExamenBD;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pide un número y muestra cuántos divisores tiene (sin mostrarlos, solo el conteo).

        System.out.println("Ingrese un número: ");
        int n= sc.nextInt();

        int i=1;
        int cont=0;

        while(n >= i){
            if (n % i == 0 ){
                cont++;
            }
            i++;
        }
        System.out.print(n+" tiene "+cont+" divisores");
    }
}
