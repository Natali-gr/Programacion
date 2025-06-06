public class Ejercicio11 {
    public static void main(String[] args) {
       /* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
        utilizando un bucle
        for(int i=320; i>=160; i=i-20){
            System.out.print(i+" ");
        }
        int i=320;
        while(i>=160){
            System.out.print(i+" ");
            i=i-20;
        }*/
        int i=320;
        do{
            System.out.print(i+" ");
            i=i-20;
        } while(i>=160);
    }
}
