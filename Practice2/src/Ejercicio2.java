import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Suma de los primeros 5 números naturales

        int i=1;
        int suma=0;
        String resultado="";


        while (i<=5) {
            suma = suma + i;
            if (i < 5) {
                resultado = resultado + i + "+";
            } else {
                resultado = resultado + i;
            }
            i++;
        }
        System.out.print(resultado+" ="+suma);
    }
}
