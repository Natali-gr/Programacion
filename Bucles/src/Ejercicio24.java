import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declarar e inicializar las variables
        int suma=0;
        int cont=0;
        int numeroImpar=1;

        //sumamos los primeros 10 números impares
        while(cont<10) {
            suma = suma + numeroImpar;
            numeroImpar = numeroImpar + 2;
            cont++;
        }
            //mostar el resultado
            System.out.println("La suma de los 10 primeros números impares es: "+suma);

    }
}
