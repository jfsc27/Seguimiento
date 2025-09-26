package Proyectos.ListCircular;

public class ListCircular<T> {
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

    public int size() {
        return tam;
    }
}
