import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in) ;
        /*Escribe un programa que nos diga el horóscopo a partir del día y el mes de
        nacimiento.*/

        System.out.print("ingrese el dia de su nacimiento: ");
        int dia=sc.nextInt();
        System.out.print("ingrese el mes de su nacimiento (1-12): ");
        int mes=sc.nextInt();

        String horoscopo;
        switch (mes){
            case 1: //enero
                horoscopo=(dia <=19)?"capricornio":"acuario";
                break;
            case 2: //febrero
                horoscopo=(dia <=18)?"acuario":"piscis";
                break;
            case 3: //marzo
                horoscopo=(dia <=20)?"piscis":"aries";
                break;
            case 4: //abril
                horoscopo=(dia <=19)?"aries":"tauro";
                break;
            case 5: //mayo
                horoscopo=(dia <=20)?"tauro":"géminis";
                break;
            case 6: //junio
                horoscopo=(dia <=20)?"géminis":"cáncer";
                break;
            case 7: //julio
                horoscopo=(dia <=22)?"cáncer":"leo";
                break;
            case 8: //agosto
                horoscopo=(dia <=22)?"leo":"virgo";
                break;
            case 9: //septiembre
                horoscopo=(dia <=22)?"virgo":"libra";
                break;
            case 10: //octubre
                horoscopo=(dia <=22)?"libra":"escorpio";
                break;
            case 11: //noviembre
                horoscopo=(dia <=21)?"escorpio":"sagitario";
                break;
            case 12: //diciembre
                horoscopo=(dia <=21)?"sagitario":"capricornio";
                break;
            default:
                horoscopo="fecha inválida";
        }
        if(mes==2 && dia>29){
            System.out.print("fecha inválida ");
        }
        System.out.print("su horoscopo es: "+horoscopo);
    }
}
