import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        /*Escribe un programa que pinte una pirámide rellena con un carácter introducido
        por teclado que podrá ser una letra, un número o un símbolo como *, +,
        -, $, &, etc. El programa debe permitir al usuario mediante un menú elegir si
        el vértice de la pirámide está apuntando hacia arriba, hacia abajo, hacia la
        izquierda o hacia la derecha.*/

        System.out.print("ingrese un caracter :");
        char caracter=sc.nextLine().charAt(0);

        System.out.print("selecciona la orientación de la pirámide: ");
        System.out.print("1. vértice hacia arriba");
        System.out.print("2. vértice hacia abajo");
        System.out.print("3. vértice hacia derecha");
        System.out.print("4. vértice hacia izquierda");
        int opcion=sc.nextInt();

        System.out.print("seleccione la altura: ");
        int altura=sc.nextInt();

        switch(opcion){
            case 1:
                for(int i=1;i<=altura;i++) {
                    for (int j = 0; j < altura - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < (2 * i - 1); j++) {
                        System.out.print(caracter);
                    }
                }
        }
    }
}
