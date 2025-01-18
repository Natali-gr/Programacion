import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Adivina el número (juego simple):
        El programa debe generar un número entre 1 y 50. El usuario debe adivinar el número,
        y el programa debe guiarlo diciendo "muy alto" o "muy bajo" hasta que lo adivine.*/

        int num = 0;
        int aleatorio=(int)(Math.random()*10)+1;
        boolean validando=false;

        while(!validando){
            System.out.print("adivina el número (1-50): ");
            num=sc.nextInt();

            if(num<aleatorio){
                System.out.print("muy bajo, intenta de nuevo ");
            }else if(num>aleatorio){
                System.out.println("muy alto ");
            } else {
                System.out.println("haz acertado");
                validando=true;
            }
        }
    }
}
