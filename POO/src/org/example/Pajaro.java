package org.example;

public class Pajaro {
    private char color;
    private int edad;

    // Asignar valores a las variables
    public void setEdad(int e) {
        edad=e;
    }
    public void setColor(char c) {
        color=c;
    }

    public void printEdad(){
        System.out.println(edad);
    }
    public void printColor(){
        switch (color){
            case 'v' -> System.out.println("Verde");
            case 'a' -> System.out.println("Amarillo");
            case 'g' -> System.out.println("Gris");
            case 'n' -> System.out.println("Negro");
            case 'b' -> System.out.println("Blanco");
            default -> System.out.println("Color no establecido");
        }
    }
}
