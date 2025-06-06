import java.util.IllegalFormatCodePointException;

public class Ejercicio31 {
    /*Escribir una función que reciba como parámetro un número entero y devuelva un
    valor booleano. True si el entero pasado como parámetro es un número perfecto y false
    si no.*/
    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 0) {
            return false; // Los números perfectos son positivos
        }

        int sumaDivisores = 0;

        // Sumar los divisores propios del número
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Un número es perfecto si la suma de sus divisores propios es igual al número
     /*
        if (sumaDivisores == numero) {
            return true;
        }else {
            return false;
        }
    */
        return sumaDivisores == numero;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero = 6; // Cambia este valor para probar otros números

        boolean resultado = esNumeroPerfecto(numero);

        System.out.println("¿El número " + numero + " es perfecto? " + resultado);
    }
}
