package Proyectos.Pila;

public class Main {
    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();

        pila.empilar("Juan");
        pila.empilar("Tomas");
        pila.mostrar();

        String desempilado = pila.desempilar();
        System.out.println("Se elimino el elemento que esta en la cima, equivale a: "+desempilado);
        pila.mostrar();
    }
}
