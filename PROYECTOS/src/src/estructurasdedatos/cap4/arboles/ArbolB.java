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

___________________________________________________________________________________________________________________________

package Nodos;

import Arboles.ArbolB;

//
public class NodoArbolB {
    public ArbolB hijoderecho;
    public ArbolB hijoizquierdo;
    public int dato;
    
    public void NodoArbolB (){
        this.hijoderecho = null;
        this.hijoizquierdo = null;
        this.dato=0;
    }
}
__________________________________________________________________________________________________________________________
//
public class EstructuraDeDatosArbol {
    /**
     *
     * @param args
     */
    public static void main (String [] args) {
    
ArbolB nuevo = new ArbolB();
nuevo.insertar(10);
nuevo.insertar(23);
nuevo.insertar(22);
nuevo.insertar(44);
nuevo.insertar(11);
nuevo.orden();
    }
}
//---
