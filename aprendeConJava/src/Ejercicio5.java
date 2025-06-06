import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Realiza un programa que calcule la media de tres notas.
        /*luego amplia para que diga la nota del boletín (insuficiente,
        suficiente, bien, notable o sobresaliente).*/

        System.out.print("ingrese sus 3 notas");
        double nota1=sc.nextDouble();
        double nota2=sc.nextDouble();
        double nota3=sc.nextDouble();

        double media=(nota1+nota2+nota3)/3;
       if (media<5){
           System.out.print("insuficiente");
       } else if (media==5) {
           System.out.print("suficiente");
       } else if (media>=6 && media<7) {
           System.out.print("bien");
       } else if (media>=7 && media<9) {
           System.out.print("notable");
   }else if (media>=9 && media<=10){
           System.out.print("sobresaliente");
       }
    }
}
