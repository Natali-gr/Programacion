package ArraysVectores;
public class Ejercicio2 {
    public static void main(String[] args) {
        // Crea un programa que pida al usuario 5 números enteros, los almacene en un array y luego muestre el mayor y el menor.

        int [] numeroArray={4,15,12,1,7,0,54};

        int mayor=numeroArray[0],menor=numeroArray[0];

        for (int i=0; i<numeroArray.length; i++) {

            if (numeroArray[i] > mayor) {
                mayor = numeroArray[i];

            }else{
                if (numeroArray[i]<menor) {
                    menor = numeroArray[i];
                }
            }
        }
        System.out.println("el número mayor es: "+mayor);
        System.out.println("el número menor es: "+menor);
    }
}
