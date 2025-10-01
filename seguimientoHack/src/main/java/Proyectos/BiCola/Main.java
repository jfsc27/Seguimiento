package Proyectos.BiCola;

public class Main {
    public static void main(String[] args) {
        BiCola<String> biCola = new BiCola<>();

        biCola.encolarAlInicio("Juan");
        biCola.encolarAlInicio("Tomas");

        biCola.mostrar();

        biCola.desencolarDelFinal();
        biCola.mostrar();

    }

}
