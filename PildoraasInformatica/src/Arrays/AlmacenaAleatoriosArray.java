package Arrays;
import java.util.Scanner;
import java.util.Random;
public class AlmacenaAleatoriosArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*En este ejercicio debes crear un array de 100 elementos que guarde en cada una de las posiciones un nº aleatorio entre 1 y 100.
         El programa debe imprimir en consola todos los valores almacenados en el array.
         Utiliza un bucle for-each para leer los valores almacenados. (Debes utilizar el método random() de la clase Math).
         */

        int [] elemento= new int[11];

        for (int i=0; i<elemento.length; i++){
            elemento[i]=(int)(Math.random()*100) +1;
        }
        for (int num:elemento){
            System.out.print(num+" ");
        }
    }
}
