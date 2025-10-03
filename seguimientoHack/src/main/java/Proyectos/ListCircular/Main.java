package Proyectos.ListCircular;

public class Main {
    public static void main(String[] args) {
        ListCircular<String> listCircular = new ListCircular();
        listCircular.agregarPrimero("9");
        listCircular.agregarPrimero("8");
        listCircular.agregarUltimo("Juan");
        listCircular.agregarUltimo("Marco");
        listCircular.agregarPrimero("Pedro");
        listCircular.agregarOrdenado("Aomas");
        listCircular.agregarOrdenado("Zomas");
        listCircular.mostrar();
        listCircular.ordenarAsc();
        listCircular.mostrar();
    }
}
