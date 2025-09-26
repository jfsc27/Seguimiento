package Proyectos.ListDoblementeEnlazada;

import Proyectos.ListasSimplementeEnlazada.Nodo;

public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> proximo;
    private NodoDoble<T> anterior;

    public NodoDoble(T dato) {
        this.dato = dato;
        proximo = null;
        anterior = null;// Null inicialmente ya que no hay nada antes de estar en la lista
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoDoble<T> getProximo() {
        return proximo;
    }

    public void setProximo(NodoDoble<T> proximo) {
        this.proximo = proximo;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", proximo=" + proximo +
                '}';
    }
}
