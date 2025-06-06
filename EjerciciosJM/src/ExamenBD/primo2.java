package ExamenBD;

import java.util.Scanner;

public class primo2 {

    public static int hallar_primo(int num){
        int cont = 0;

        for (int i=2; i<=num; i++) {
            if (num % i == 0){
             cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero= hallar_primo(25);

        if (numero==1){
            System.out.print("es primo");
        }else{
            System.out.print("no es primo");
        }
    }
}
