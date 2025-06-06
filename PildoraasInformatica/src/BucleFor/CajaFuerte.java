package BucleFor;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
        El programa nos pedirá la combinación para abrirla. Si no acertamos,
        se nos mostrará el mensaje “Lo siento, esa no es la combinación”
        y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
        Tendremos cuatro oportunidades para abrir la caja fuerte.*/

        int clave=1234;

        for(int i=0; i<4; i++) {
        System.out.println("ingrese la combinación de 4 cifras para abrirla: ");
        int combinacion=sc.nextInt();

        if(combinacion>999 && combinacion<=9999){
            if(combinacion!=clave){
                System.out.println("lo siento esa no es la combinación");
                }else {
                System.out.println("la caja se ha abierto satisfactoriamente");
                break;
                }
            }else{
            System.out.println("la combinación tiene que tener 4 cifras");
            }
        }
    }
}
