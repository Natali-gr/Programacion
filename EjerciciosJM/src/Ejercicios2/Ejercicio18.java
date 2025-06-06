package Ejercicios2;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar
    el número de patas que tienen en total de todos los animales capturados durante una jornada de trabajo.
    Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
    - El número de hormigas capturadas (6 patas)  - El número de arañas capturadas (8 patas)
    - El número de cochinillas capturadas (14 patas) La aplicación debe mostrar el número total de patas.  */

        System.out.print("Ingrese el número de hormigas capturadas: ");
        int hormigas=sc.nextInt();
        System.out.print("Ingrese el número de arañas capturadas: ");
        int arañas=sc.nextInt();
        System.out.print("Ingrese el número de cochinillas capturadas: ");
        int cochinillas=sc.nextInt();

        int patasHormigas= hormigas * 6;
        int patasArañas=arañas * 8;
        int patasCochinillas=cochinillas * 14;

        int totalPatas= patasHormigas + patasArañas + patasCochinillas;
        System.out.print("El número total de patas es: "+totalPatas);
    }
}
