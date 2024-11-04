public class Ejercicio1 {
    public static void main(String[] args){

    int[] num1=new int[10];

    for(int i=0; i< num1.length; i++){
        num1[i]= (int)(Math.random()*100)+1;
    }

    for(int j=0; j< num1.length-1; j++){
        System.out.print(num1[j]+":");
    }
       System.out.print(num1[num1.length-1]+".");
    }
}
