package Proyectos.ListasSimplementeEnlazada;


import java.util.Iterator;

public class ListSimpleEnlazada<T extends Comparable<T>> implements Iterable<T> {
    private Nodo<T> primero;
    private int tam;

    public ListSimpleEnlazada() {
        primero = null;
        tam = 0;
    }

    public void agregarPrimero(T dato){
        Nodo<T> newNodo = new Nodo(dato);
        if (primero == null){
            primero = newNodo;
            tam++;
        } else {
            newNodo.setProximo(primero);
            primero = newNodo;
            tam++;
        }
    }

    public void agregarUltimo(T dato) {
        Nodo<T> newNodo = new Nodo(dato);
        if (primero == null){
            primero = newNodo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != null){
                actual = actual.getProximo();
            }
            actual.setProximo(newNodo);
        }
        tam++;
    }

    public void agregarEn(int pos, T dato){
        if (pos == 0) {
            agregarPrimero(dato);
        }

        if (pos == tam) {
            agregarUltimo(dato);
        }
        Nodo<T> actual = primero;
        int i = 0;

        while (i < pos - 1 && actual != null) {
            actual = actual.getProximo();
            i++;
        }
        Nodo<T> newNodo = new Nodo<>(dato);
        newNodo.setProximo(actual.getProximo());
        actual.setProximo(newNodo);
        tam++;
    }

    public void mostrar(){
        Nodo<T> actual = primero;
        String mensaje = "[";
        while (actual != null){
            if (actual.getProximo() == null){
                mensaje += actual.getDato() + "";

            }else{
                mensaje += actual.getDato() + ",";

            }
            actual = actual.getProximo();

        }
        mensaje += "]";
        System.out.println(mensaje);
    }

    public void ordenarAsc() {
        if (primero == null || primero.getProximo() == null) {
            return;
        }
        Nodo<T> actual = primero;
        while (actual != null) {
            Nodo<T> siguiente = actual.getProximo();
            while (siguiente != null) {
                if (actual.getDato().compareTo(siguiente.getDato()) > 0) {
                    T temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                }
                siguiente = siguiente.getProximo();
            }
            actual = actual.getProximo();
        }
    }

    public void insertarOrdenado(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null || dato.compareTo(primero.getDato()) < 0) {
            nuevo.setProximo(primero);
            primero = nuevo;
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != null && actual.getProximo().getDato().compareTo(dato) <
                    0) {
                actual = actual.getProximo();
            }
            nuevo.setProximo(actual.getProximo());
            actual.setProximo(nuevo);
        }
        tam++;
    }

    public boolean esVacia(){
        return (primero == null && tam == 0) ? true : false;
    }

    public int localizar(T datoBusqueda){
        Nodo<T> actual = primero;
        int indexBusqueda = 0;

        while (actual != null){
            if (actual.getDato().equals(datoBusqueda)){
                return indexBusqueda;
            }
            indexBusqueda++;
            actual = actual.getProximo();
        }
        return -1;
    }

    public boolean buscar (T datoBusqueda){
        Nodo<T> actual = primero;
        boolean flag = false;

        while (actual != null){
            if (actual.getDato().equals(datoBusqueda)){
                flag = true;
            }
            actual = actual.getProximo();
        }
        return flag;
   }

    public boolean eliminar(T datoBusqueda){
        Nodo<T> actual = primero;
         if (actual.getDato().equals(datoBusqueda)){
             primero = actual.getProximo();
             tam--;
             return true;
         }else {
             while (actual.getProximo() != null){
                 if (actual.getProximo().getDato().equals(datoBusqueda)){
                     actual.setProximo(actual.getProximo().getProximo());
                     tam--;
                     return true;
                 }
                 actual = actual.getProximo();
             }
         }
         return false;
    }
    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Nodo<T> getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Nodo<T> actual = primero;

            @Override
            public boolean hasNext() {
                return actual != null;
            }

            @Override
            public T next() {
                T dato = actual.getDato();
                actual = actual.getProximo();
                return dato;
            }
        };
    }
}
