package Proyectos.Cola;

public class Main {
    public static void main(String[] args) {
        Cola<String> cola = new Cola<>();

        cola.encolar("Juan");
        cola.mostrar();
        cola.desencolar("Juan");
        cola.mostrar();
    }
}
