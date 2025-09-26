package Proyectos.ListDoblementeEnlazada;

import Proyectos.ListCircular.Nodo;

public class ListaDoblementeEnlazada<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListaDoblementeEnlazada() {
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public NodoDoble<T> getUltimo() {
        return ultimo;
    }

    public void setUltimo(NodoDoble<T> ultimo) {
        this.ultimo = ultimo;
    }

    public NodoDoble<T> getPrimero() {
        return primero;
    }

    public void setPrimero(NodoDoble<T> primero) {
        this.primero = primero;
    }
}
