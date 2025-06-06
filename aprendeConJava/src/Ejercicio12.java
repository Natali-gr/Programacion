import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int clave=1234;
         int intento=0;

         while(intento!=clave){
             System.out.print("ingrese la combinación de la caja fuerte: ");
             intento=sc.nextInt();


         }
    }
}
