package Arrays;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] valores= new int[5];
        valores[0]=15;
        valores[1]=7;
        valores[2]=1500;
        valores[3]=9;
        valores[4]=-5;

        /*for(int i=0;i<valores.length;i++){
            System.out.println(valores[i]);
        }*/
        for(int elemento:valores){
            System.out.println(elemento);
        }
    }
}
