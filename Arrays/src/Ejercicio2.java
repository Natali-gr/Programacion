public class Ejercicio2 {
    public static void main(String[]args) {

        int[] num = new int[10];

        //recorre para guarda valores en num
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 100) + 1;
        }
        //recorre los datos e imprime
        for(int j=num.length-1; j>=0; j--) {
            System.out.print(num[j]+":");
        }
    }
}
