package ExamenJM;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //crea un programa para una pastelería que gestione pedidos de pasteles y galletas

        int pastel=15;
        int galleta=3;
        int total=0;
        int descuento=0;

        System.out.println("ingrese la cantidad de pasteles que desea comprar: ");
        int num1=sc.nextInt();
        System.out.println("ingrese la cantidad de galletas que desea comprar: ");
        int num2=sc.nextInt();

        total=num1*pastel + num2*galleta;
        if (num1>5 && num2>10){

            descuento=(int) (total * 0.10);
            System.out.println("total de compra: "+total+" €");
            System.out.println(("el descuento a aplicar es: "+descuento+" %"));
        }else{
            System.out.println("total de compra: "+total+" €");
        }
    }
}
