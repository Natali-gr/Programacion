import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Sumar números hasta que el usuario ingrese 0:
        Pide al usuario que ingrese números. El programa debe sumar todos los números ingresados y terminar cuando el usuario ingrese 0.
        Ejemplo: Si ingresa 5, 3 y 0, el resultado es 8.*/

        int suma=0;
        int num=0;

        do{
            System.out.print("ingrese un número: ");
            do {
                num = sc.nextInt();
                suma = suma + num;

                if (suma == 0) {
                    System.out.print("ingrese un número mayor de cero al menos una vez: ");
                }

            }while(suma==0);

        }while(num!=0);

        if(suma >= 1){
            System.out.print("resultado de la suma es: "+suma);
        }else {
            System.out.print("no seas cagón pe profe .l.");

        }
    }
}
