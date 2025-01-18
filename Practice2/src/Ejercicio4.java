import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // Pide al usuario que indique cuántas veces quiere imprimir un mensaje y repite ese mensaje usando un bucle while.

        System.out.print("ingrese el mensaje: ");
        String mensaje=sc.nextLine();
        System.out.print("cuantas veces quiere imprimir el mensaje: ");
        int numeroMensaje=sc.nextInt();

        int i=1;
        while(i<=numeroMensaje){
            System.out.println(mensaje);
            i++;
        }
    }
}
