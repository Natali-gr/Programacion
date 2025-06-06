import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
        las horas extras. Escribe un programa que calcule el salario semanal de un
        trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
        trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
        euros la hora.*/

        System.out.print("ingrese el número de horas trabajadas: ");
        int horas=sc.nextInt();

        int salario=0;
        if (horas<=40){
            salario =12*horas;
        }else {
            salario = 16 * horas;
        }
        System.out.print("su salario por horas trabajadas es : "+salario);
    }
}
