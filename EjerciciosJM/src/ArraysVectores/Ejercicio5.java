package ArraysVectores;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Escribe un programa que pida 8 números, los almacene en un array y luego pregunte al usuario por un número. El programa debe indicar si el número está en el array o no.

        int arrayAleatorio[] = new int[100];

        for (int i=0; i<arrayAleatorio.length; i++){

            arrayAleatorio[i]=(int) ((Math.random()*100)+1);
            System.out.print(arrayAleatorio[i]+" ");
        }


    }
}
