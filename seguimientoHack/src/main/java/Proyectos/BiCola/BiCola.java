package Proyectos.BiCola;

import Proyectos.Cola.Nodo;

public class BiCola<T>{
    private Proyectos.Cola.Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tam;

    public BiCola() {
        this.primero = primero;
        this.ultimo = ultimo;
        this.tam = tam;
    }

    public void encolar(T dato) {
        Nodo<T> newNodo = new Nodo<>(dato);
        if (primero == null) {
            primero = newNodo;
            ultimo = newNodo;
        } else {
            ultimo.setProximo(newNodo);
            ultimo = newNodo;
        }
        tam++;
    }

    public T desencolar(T dato) {
        if (primero == null) {
            return null;
        }
        T datico = primero.getDato();
        primero = primero.getProximo();
        if (primero == null) {
            ultimo = null;
        }
        tam--;
        return dato;
    }

    public void encolarAlInicio(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero = nuevo;
        }
        tam++;
    }

    public T desencolarDelFinal() {
        if (primero == null) { 
            System.out.println("Cola vacía");
            return null;
        }

        if (primero == ultimo) {
            T dato = primero.getDato();
            primero = null;
            ultimo = null;
            tam--;
            return dato;
        }

        Nodo<T> actual = primero;
        while (actual.getProximo() != ultimo) {
            actual = actual.getProximo();
        }

        T dato = ultimo.getDato();
        actual.setProximo(null);
        ultimo = actual;
        tam--;

        return dato;
    }

    public void mostrar() {
        if (primero == null) {
            System.out.println("[]");
            return;
        }

        Nodo<T> actual = primero;
        String mensaje = "[";
        while (actual != null) {
            mensaje += actual.getDato();
            actual = actual.getProximo();
            if (actual != null) {
                mensaje += ", ";
            }
        }
        mensaje += "]";
        System.out.println(mensaje);
    }

    public boolean esVacia(){
        return primero == null;
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
