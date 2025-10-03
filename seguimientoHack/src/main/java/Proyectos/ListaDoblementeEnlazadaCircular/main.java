package Proyectos.ListaDoblementeEnlazadaCircular;

public class main {
    public static void main(String[] args) {
        ListDoblementeEnlazadaCircular<String> lista = new ListDoblementeEnlazadaCircular<>();

        lista.insertarOrdenado("Aura");
        lista.insertarOrdenado("Bola");
        lista.insertarOrdenado("Pedro");
        lista.insertarOrdenado("Zarlos");
        lista.mostrar();
        lista.ordenarAsc();
        lista.mostrar();
    }
}
