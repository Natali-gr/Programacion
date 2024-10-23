import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //solicitar un numero
        System.out.println("ingresa un número: ");
        int num=sc.nextInt();

        //calcular el residuo de la división
        int residuo = num % 7;

        //si el residuo es 0 el número ya es múltiplo de 7
        int cantidadASumar;
        if (residuo == 0) {
            cantidadASumar = 0;
        } else {
            //se suma 7 menos el residuo
            cantidadASumar = 7 - residuo;
        }

        //mostrar el resultado
        System.out.println("A " + num + " hay que sumarle " + cantidadASumar + " para que sea múltiplo de 7.");

        sc.close();



    }
}
