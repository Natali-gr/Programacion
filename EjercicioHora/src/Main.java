public static void main(String[] args) {
    HoraExacta reloj1 = new HoraExacta(12, 30, 45);
    HoraExacta reloj2 = new HoraExacta(12, 30, 45);
    HoraExacta reloj3 = new HoraExacta(10, 15, 20);

    System.out.println("Hora 1: " + reloj1);
    System.out.println("Hora 2: " + reloj2);
    System.out.println("Hora 3: " + reloj3);

    System.out.println("¿Hora 1 y Hora 2 son iguales? " + reloj1.esIgual(reloj2));
    System.out.println("¿Hora 1 y Hora 3 son iguales? " + reloj1.esIgual(reloj3));
}