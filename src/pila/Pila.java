package pila;

import Arbol.NodoArbol;

/**
 *
 * @author dilan
 */
public class Pila {
    NodePila top;
    int iN;
    
    /**
     * Devuelve el tamaño de la pila
    **/
    public int size() {
        return iN;
    }
    
    /**
     * devuelve si la pila esta vacia o no
    **/
    public boolean isEmpty() {
        return iN == 0;
    }
    
    /**
     * devuelve el ultimo elemento insertado en la pila
    **/
    public NodoArbol top() {
        return top.getNodoArbol();
    }
    
    /**
     * inserta un nuevo nodo en la pila
     * @param nodo el es nuevo nodo a insertar en la pila
    **/
    public void push(NodoArbol nodo) {
        NodePila pNew = new NodePila(nodo);
        pNew.setNext(top);
        top = pNew;
        iN++;
    }
    
    /**
     * elimina el ultimo elemento insertado de la pila
    **/
    public void pop() {
        top = top.getNext();
        iN--;
    }
}
