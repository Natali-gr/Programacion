package BucleFor;
import java.util.Scanner;
public class Suma100Numeros {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*Realiza un programa que sume los 100 números siguientes a un número entero
        y positivo introducido por teclado. Se debe comprobar que el dato introducido
        es correcto (que es un número positivo).*/

        System.out.println("ingrese un número:");
        int num=sc.nextInt();

        int suma=0;
        if(num>0){
            for (int i=num+1; i<=num+100; i++){
                suma=suma+i;
            }
            System.out.print("la suma es: "+suma);
        }else{
            System.out.print("debes introducir un número entero:");
        }
    }
}
