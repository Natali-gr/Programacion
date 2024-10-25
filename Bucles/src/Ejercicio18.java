import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaramos las variables
        int numeroSecreto=(int)(Math.random()*(100-1+1))+1;
        int intento;
        boolean hazAcertado=false;

        //se pide adivinar el número
        System.out.println("Adivina un número entre 1 y 100 ; si te quieres rendir introduce -1");

        while (!hazAcertado) {
            //empezar a intentar
            System.out.println("ingresa tu intento:");
            intento = sc.nextInt();

            //ingresar -1 para rendirse
            if (intento == -1) {
                System.out.println("te has rendido. El número secreto era: " + numeroSecreto);
            }
            //condición para ayudar a acertar
            if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor");
            } else if (intento < numeroSecreto) {
                    System.out.println("El número secreto es mayor");
                } else {
                    System.out.println("Haz acertado el número secreto");
                    hazAcertado=true;
            }

        }

    }
}
