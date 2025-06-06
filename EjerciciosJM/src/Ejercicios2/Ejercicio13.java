package Ejercicios2;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //  Modifica el ejercicio 12 para que, indicando dos números n y m, diga qué cantidad hay que sumarle a n para que sea múltiplo de m.

        System.out.println("ingrese dos números: ");
        int n=sc.nextInt();
        int m=sc.nextInt();

        int mood=n%m;

        if (mood==0){
            System.out.print("no hace falta sumarle nada");
        }else{
         int faltante=m-mood;
            System.out.print("a "+n+" le falta "+faltante+" para ser multiplo de "+m);
        }
    }
}
