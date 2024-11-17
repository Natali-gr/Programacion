import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Escribe un programa que ordene tres números enteros introducidos por
        teclado.*/
        System.out.println("ingrese 3 números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int mayor = 0;
        int medio = 0;
        int menor = 0;
        if (num1>num2 && num1>num3 && num2>num3){
            mayor=num1;
            medio=num2;
            menor=num3;
        } else if(num1>num2 && num1>num3 && num3>num2){
            mayor=num1;
            medio=num3;
            menor=num2;
        } else if (num2>num1 && num2>num3 && num1>num3){
            mayor=num2;
            medio=num1;
            menor=num3;
        } else if (num2>num1 && num2>num3 && num3>num1){
            mayor=num2;
            medio=num3;
            menor=num1;
        } else if (num3>num1 && num3>num2 && num1>num2) {
            mayor=num3;
            medio=num1;
            menor=num2;
        } else if (num3>num1 && num3>num2 && num2>num1) {
            mayor=num3;
            medio=num2;
            menor=num1;
        }
        System.out.println("los números ordenados serían: "+mayor+", "+medio+" ,"+menor);
    }
}
