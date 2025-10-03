package Proyectos.ListCircular;

public class ListCircular<T extends Comparable<T>>{
    private Nodo<T> primero;
    private int tam;

    public ListCircular() {
        primero = null;
        tam = 0;
    }
    public void agregarPrimero(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
            nuevo.setProximo(primero);
        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != primero) {
                actual = actual.getProximo();
            }

            nuevo.setProximo(primero);
            actual.setProximo(nuevo);
            primero = nuevo;
        }
        tam++;
    }


    public void agregarUltimo(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
            nuevo.setProximo(primero);
        } else {
            Nodo<T> actual = primero;

            while (actual.getProximo() != primero) {
                actual = actual.getProximo();
            }
            actual.setProximo(nuevo);
            nuevo.setProximo(primero);
        }
        tam++;
    }

    public void mostrar() {
        if (primero == null) {
            System.out.println("[]");
            return;
        }

        Nodo<T> actual = primero;
        StringBuilder mensaje = new StringBuilder("[");
        do {
            mensaje.append(actual.getDato());
            actual = actual.getProximo();
            if (actual != primero) {
                mensaje.append(", ");
            }
        } while (actual != primero);
        mensaje.append("]");

        System.out.println(mensaje.toString());
    }
    public void agregarOrdenado(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);

        if (primero == null) {
            primero = nuevo;
            nuevo.setProximo(primero);
        } else if (dato.compareTo(primero.getDato()) < 0) {

            Nodo<T> actual = primero;
            while (actual.getProximo() != primero) {
                actual = actual.getProximo();
            }
            actual.setProximo(nuevo);
            nuevo.setProximo(primero);
            primero = nuevo;

        } else {
            Nodo<T> actual = primero;
            while (actual.getProximo() != primero &&
                    actual.getProximo().getDato().compareTo(dato) < 0) {
                actual = actual.getProximo();
            }
            nuevo.setProximo(actual.getProximo());
            actual.setProximo(nuevo);
        }
        tam++;
    }

    public void ordenarAsc() {
        if (primero == null || primero.getProximo() == primero) {
            return;
        }
        boolean cambiado;
        do {
            cambiado = false;
            Nodo<T> actual = primero;

            do {
                Nodo<T> siguiente = actual.getProximo();
                if (actual != siguiente && actual.getDato().compareTo(siguiente.getDato()) > 0) {
                    T temp = actual.getDato();
                    actual.setDato(siguiente.getDato());
                    siguiente.setDato(temp);
                    cambiado = true;
                }
                actual = actual.getProximo();
            } while (actual.getProximo() != primero);

        } while (cambiado);
    }
    public int size() {
        return tam;
    }
}
