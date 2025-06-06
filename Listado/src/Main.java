public static void main(String[] args) {
    Lista lista = new Lista();

    // Insertando números al final
    lista.insertarAlFinal(10);
    lista.insertarAlFinal(20);
    lista.insertarAlFinal(30);
    lista.mostrarElementos();

    // Insertando un número al principio
    lista.insertarAlPrincipio(5);
    lista.mostrarElementos();

    // Insertando en una posición específica
    lista.insertarEnIndice(2, 15);
    lista.mostrarElementos();

    // Crear otra lista y añadirla a la lista principal
    Lista lista2 = new Lista();
    lista2.insertarAlFinal(100);
    lista2.insertarAlFinal(200);
    lista.añadirLista(lista2);
    lista.mostrarElementos();

    // Obtener un elemento
    System.out.println("Elemento en el índice 3: " + lista.obtenerElemento(3));

    // Buscar un número en la lista
    System.out.println("El número 15 se encuentra en el índice: " + lista.buscarNumero(15));

    // Mostrar la cantidad de elementos
    System.out.println("Número de elementos en la lista: " + lista.obtenerNumeroDeElementos());

    Pila pila = new Pila();

    // Apilar algunos elementos
        pila.apilar(10);
        pila.apilar(20);
        pila.apilar(30);
        pila.mostrarPila();  // Muestra la pila después de apilar

    // Ver la cima de la pila
        System.out.println("Cima de la pila: " + pila.cima());

        // Desapilar un elemento
        System.out.println("Elemento desapilado: " + pila.desapilar());
        pila.mostrarPila();  // Muestra la pila después de desapilar

    // Ver la nueva cima
        System.out.println("Nueva cima de la pila: " + pila.cima());

}