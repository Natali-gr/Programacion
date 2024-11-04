import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int[] num =new int[10];
        try {
            int positives=0,negatives=0,zero=0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for(int i=0; i<num.length ; i++){
            num[i]=(int)(Math.random()*50)+1;
        }

      //  String pares="",impares="";
    int suma=0;

        for(int j=num.length-1; j>=0; j--){

            if( num[j] % 2 ==0 ){
                System.out.print(num[j]+" ");
                //pares=pares+num[j]+" ";
       
                }else{
                     System.out.print(num[j]+" ");

                // impares=impares+num[j]+ ", ";
            }

        }

  /*      System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
*/
    }
}
