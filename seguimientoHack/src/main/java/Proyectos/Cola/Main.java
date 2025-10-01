package Proyectos.Cola;

public class Main {
    public static void main(String[] args) {
        Cola<String> cola = new Cola<>();

        cola.encolar("Juan");
        cola.encolar("Tomas");
        cola.mostrar();

        String elimidado= cola.desencolar("Juan");
        System.out.println("Se elimino a: "+elimidado);

        cola.mostrar();

        System.out.println(cola.esVacia());
    }
}
