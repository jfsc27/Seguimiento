package Proyectos.ListasSimplementeEnlazada;

public class Main {
    public static void main(String[] args) {
        ListSimpleEnlazada<String> lista = new ListSimpleEnlazada<>();


        lista.agregarPrimero("Juan");
        lista.agregarPrimero("Peñita");
        lista.agregarPrimero("Serio Bernal");
        lista.agregarPrimero("8");
        lista.agregarPrimero("9");

        lista.agregarUltimo("Serio Ramos");

        lista.agregarEn(3, "Manuela");

        lista.insertarOrdenado("Angel");
        lista.insertarOrdenado("Agus");
        lista.mostrar();
        lista.ordenarAsc();
        lista.mostrar();

    }
}
