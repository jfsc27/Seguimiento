package Proyectos.ListasSimplementeEnlazada;

public class Nodo <T> {
    private T dato;
    private Nodo<T > proximo; //Referencia siguiente elemento

    public Nodo(T dato) {
        this.dato = dato;
        proximo = null; // Null inicialmente ya que no hay nada antes de estar en la lista
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getProximo() {
        return proximo;
    }

    public void setProximo(Nodo<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", proximo=" + proximo +
                '}';
    }
}
