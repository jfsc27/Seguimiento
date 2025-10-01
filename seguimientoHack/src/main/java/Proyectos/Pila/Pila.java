package Proyectos.Pila;

public class Pila<T> {
    private Nodo<T> cima;
    private int tam;

    public Pila() {
        cima = null;
        tam = 0;
    }

    public void empilar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setProximo(cima);
        cima = nuevo;
        tam++;
    }

    public T desempilar() {
        if (cima == null) {
            System.out.println("La pila está vacía");
            return null;
        }
        T dato = cima.getDato();
        cima = cima.getProximo();
        tam--;
        return dato;
    }

    public void mostrar() {
        if (cima == null) {
            System.out.println("[]");
            return;
        }
        Nodo<T> actual = cima;
        String salida = "[";
        while (actual != null) {
            salida += actual.getDato();
            actual = actual.getProximo();
            if (actual != null) {
                salida += ", ";
            }
        }
        salida += "]";
        System.out.println(salida);
    }

    public boolean esVacia() {
        return cima == null;
    }

    public Nodo<T> getCima() {
        return cima;
    }

    public void setCima(Nodo<T> cima) {
        this.cima = cima;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
