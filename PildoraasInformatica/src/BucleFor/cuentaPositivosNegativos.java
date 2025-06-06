package BucleFor;
import java.util.Random;
public class cuentaPositivosNegativos {
    public static void main(String[] args) {
        Random random= new Random();
        /*Escribe un programa que lea una lista de diez números y determine cuántos
        son positivos, y cuántos son negativos.*/

        int positivos=0;
        int negativos=0;
        System.out.println("generando 10 números aleatorios:");

        for(int i=1;i<=10;i++){
            int num= random.nextInt(100)-50;
            System.out.println("número "+i+": "+num);
            if(num>0){
                positivos++;
            }else{
                negativos++;
            }
        }
        System.out.println("números positivos: "+positivos);
        System.out.print("números negativos: "+negativos);
    }
}
