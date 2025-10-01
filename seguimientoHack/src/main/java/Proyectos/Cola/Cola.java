package Proyectos.Cola;

public class Cola <T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tam;

    public Cola(Nodo<T> primero, Nodo<T> ultimo) {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    public Nodo<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
}
