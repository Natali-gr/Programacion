import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Contar números pares entre 1 y 50:
        Imprime todos los números pares del 1 al 50 usando un bucle while.
        Ejemplo: 2, 4, 6, ..., 50.*/

       /* int i=0;
        while (i<50){
            i=i+2;
            System.out.print(i+" ,");+
        }*/
        System.out.println("ingresa un numero:");
        int num = sc.nextInt();

        int i = 1;
        String par= " ";
        String impar=" ";
        while (i <= num) {

            if (i %2==0) {
                par=par +i+" ";
            } else {
                impar= impar+i+ " ";
                     }
            i++;
        }
        System.out.println("Pares: "+par);
        System.out.print("Impar: "+impar);
    }
}

//resolver como quitarle la coma al antepenultimo si fuera impar