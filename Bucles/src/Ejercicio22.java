import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //se define la cantidad de números
        int numTotal = 0;

        //inicializamos,comparamos e incrementamos para conseguir los 10 números
      for ( int i=1; i<=10; i++) {
          System.out.println("ingresa un número entero");
          int num=sc.nextInt();
          //se suma el número ingresado a la cantidad total
          numTotal=numTotal+num;
      }
      //se calcula la media luego se muestra el resultado
        double media=numTotal/10;
            System.out.println("la media de los números introducidos son: " + media);
    }
}
