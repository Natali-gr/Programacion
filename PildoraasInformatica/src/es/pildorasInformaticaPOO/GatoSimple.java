package es.pildorasInformaticaPOO;

public class GatoSimple {
    // atributos
    String color, raza, sexo;
    int edad;
    double peso;
    // métodos

    // constructor
    GatoSimple (String s) {
        this.sexo = s;
    }
    // getter
    String getSexo() {
        return this.sexo;
    }

     //Hace que el gato maulle
    void maulla() {
        System.out.println("Miauuuu");
    }

    //Hace que el gato ronronee
    void ronronea() {
        System.out.println("mrrrrrr");
    }

        /* Hace que el gato coma.
          A los gatos les gusta el pescado, si le damos otra comida
          la rechazará.*/
         // @param comida la comida que se le ofrece al gato
    void come(String comida) {
         if (comida.equals("pescado")) {
             System.out.println("Hmmmm, gracias");
    } else {
        System.out.println("Lo siento, yo solo como pescado");
    }
 }
  /* Pone a pelear dos gatos.
   Solo se van a pelear dos machos entre sí.
    @param contrincante es el gato contra el que pelear*/

    void peleaCon(GatoSimple contrincante) {
        if (this.sexo.equals("hembra")) {
             System.out.println("no me gusta pelear");
        } else {
         if (contrincante.getSexo().equals("hembra")) {
            System.out.println("no peleo contra gatitas");
         } else {
            System.out.println("ven aquí que te vas a enterar");
         }

        }
    }
}
