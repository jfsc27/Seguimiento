package Proyectos.Cola;

public class Cola <T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tam;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
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
