import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
    las horas extras. Escribe un programa que calcule el salario semanal de un
    trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
    trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16
    euros la hora.*/

        int totalHoras=0;
        System.out.println("ingrese las horas trabajadas para calcular su salario:");
        int horas= sc.nextInt();

        if(horas>0 && horas<=40){
            totalHoras=12*horas;
            System.out.println("su salario por las horas trabajadas es: "+totalHoras);
        }else{
            totalHoras=16*horas;
            System.out.println("su salario por las horas trabajadas es: "+totalHoras);
        }
    }
}
