package Proyectos.ListDoblementeEnlazada;

public class main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada<String> lista = new ListaDoblementeEnlazada<>();
        lista.agregarPrimero("Juan");
        lista.agregarPrimero("Pepe");
        lista.agregarUltimo("Peña");
        lista.agregarPosicion(1, "Tomas");
        lista.insertarOrdenado("Laura");
        System.out.println(lista.getTam());
        lista.mostrar();
        lista.ordenarAsc();
        lista.mostrar();
    }
}
