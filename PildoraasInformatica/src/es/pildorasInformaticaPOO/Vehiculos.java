package es.pildorasInformaticaPOO;

public class Vehiculos {

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;

    public Vehiculos(){ //constructor de la clase.Mismo nombre q la clase

        ruedas=4;
        largo=2;
        ancho=1;
        peso=2;
        color="sin color";
    }
    public void setColor(String colorVehiculo){  //método setter que establece valor de propiedad
    color=colorVehiculo;
    }



    public String getColor(){   //método getter que devuelve valor de propiedad

        return color;
    }
}
