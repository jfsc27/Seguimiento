package Proyectos.ListDoblementeEnlazada;

public class ListaDoblementeEnlazada<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListaDoblementeEnlazada() {
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public void agregarPrimero(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (primero == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
        tam++;
    }

    public void agregarUltimo(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (ultimo == null) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setProximo(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
        tam++;
    }

    public void agregarPosicion(int posicion, T dato) {
        if (posicion < 0 || posicion > tam) {
            throw new IndexOutOfBoundsException("Posición inválida");
        }

        if (posicion == 0) {
            agregarPrimero(dato);
        } else if (posicion == tam) {
            agregarUltimo(dato);
        } else {
            NodoDoble<T> nuevo = new NodoDoble<>(dato);
            NodoDoble<T> actual = primero;
            int index = 0;

            while(index < posicion) {
                actual = actual.getProximo();
                index++;
            }

            NodoDoble<T> siguiente = actual.getProximo();

            actual.setProximo(nuevo);
            nuevo.setAnterior(actual);

            nuevo.setProximo(siguiente);
            siguiente.setAnterior(nuevo);

            tam++;
        }
    }

    public void mostrar() {
        if (primero == null) {
            System.out.println("[]");
            return;
        }

        NodoDoble<T> actual = primero;
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

    // Getters y Setters
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
