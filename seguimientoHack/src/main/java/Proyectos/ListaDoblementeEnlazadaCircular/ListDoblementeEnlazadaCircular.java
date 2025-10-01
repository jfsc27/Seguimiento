package Proyectos.ListaDoblementeEnlazadaCircular;

public class ListDoblementeEnlazadaCircular<T> {
    private NodoDoble<T> primero;
    private NodoDoble<T> ultimo;
    private int tam;

    public ListDoblementeEnlazadaCircular() {
        primero = null;
        ultimo = null;
        tam = 0;
    }

    public void agregarPrimero(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (primero == null) { // lista vacía
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setProximo(primero);
            nuevo.setAnterior(ultimo);
            primero.setAnterior(nuevo);
            ultimo.setProximo(nuevo);
            primero = nuevo;
        }
        tam++;
    }

    public void agregarUltimo(T dato) {
        NodoDoble<T> nuevo = new NodoDoble<>(dato);
        if (ultimo == null) { // lista vacía
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setAnterior(ultimo);
            nuevo.setProximo(primero);
            ultimo.setProximo(nuevo);
            primero.setAnterior(nuevo);
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

            for (int i = 0; i < posicion; i++) {
                actual = actual.getProximo();
            }

            NodoDoble<T> anterior = actual.getAnterior();
            anterior.setProximo(nuevo);
            nuevo.setAnterior(anterior);
            nuevo.setProximo(actual);
            actual.setAnterior(nuevo);

            tam++;
        }
    }

    public void mostrar() {
        if (primero == null) {
            System.out.println("[]");
            return;
        }

        NodoDoble<T> actual = primero;
        StringBuilder mensaje = new StringBuilder("[");
        int contador = 0;

        while (contador < tam) {
            mensaje.append(actual.getDato());
            actual = actual.getProximo();
            if (contador < tam - 1) {
                mensaje.append(", ");
            }
            contador++;
        }

        mensaje.append("]");
        System.out.println(mensaje.toString());
    }

    // Getters
    public int getTam() {
        return tam;
    }

    public NodoDoble<T> getPrimero() {
        return primero;
    }

    public NodoDoble<T> getUltimo() {
        return ultimo;
    }
}
