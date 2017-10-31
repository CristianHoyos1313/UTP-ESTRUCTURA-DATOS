package estructurasdedatos.cap4.arboles;



public class ArbolB {
// llamamos el nodo
    private NodoArbolB raiz;
    // funcion booleada  para saber si esta vacio
    public boolean esVacia() {
        return raiz == null;
    }
    public void insertar (int nodo1) {
        if (esVacia()) {
            NodoArbolB nuevonodo = new NodoArbolB();
            nuevonodo.dato = nodo1;
            nuevonodo.hijoderecho = new ArbolB();
            nuevonodo.hijoizquierdo = new ArbolB();
            raiz = nuevonodo;
        } else {
            if (nodo1 > raiz.dato) {
                raiz.hijoderecho.insertar(nodo1);
            }
            if (nodo1 < raiz.dato) {
                raiz.hijoizquierdo.insertar(nodo1);
            }
        }
    }
    public void orden() {
        if (!esVacia()) {
            raiz.hijoizquierdo.orden();
            System.out.println(raiz.dato + ", ");
            raiz.hijoderecho.orden();
        }
    }
}
