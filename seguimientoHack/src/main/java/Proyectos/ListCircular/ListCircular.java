package Proyectos.ListCircular;

public class ListCircular<T> {
    private Nodo<T> primero;
    private int tam;

    public ListCircular() {
        primero = null;
        tam = 0;
    }
    public void agregarPrimero(T dato){
        Nodo<T> newNodo = new Nodo(dato);
        if (primero == null){
            primero = newNodo;
            tam++;
        } else {
            Nodo<T> actual = primero;
            if (actual.getProximo() == null){
                newNodo.setProximo(primero);
                actual.setProximo(newNodo);
                primero = newNodo;
            }else {
                while (actual.getProximo() != primero){
                    actual = actual.getProximo();
                }
                actual.setProximo(newNodo);
                newNodo.setProximo(primero);
                primero = newNodo;
            }
        }
        tam++;
    }

    public void agregarUltimo(T dato) {
        Nodo<T> newNodo = new Nodo(dato);
        if (primero == null){
            primero = newNodo;
        } else {
            Nodo<T> actual = primero;
            if (actual.getProximo() == null){
                actual.setProximo(newNodo);
                newNodo.setProximo(primero);
            }else {
                while (actual.getProximo() != primero){
                    actual = actual.getProximo();
                }
                actual.setProximo(newNodo);
                newNodo.setProximo(primero);
            }
        }
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
}
