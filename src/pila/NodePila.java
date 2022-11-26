package pila;

import Arbol.NodoArbol;

/**
 *
 * @author dilan
 */
public class NodePila {
    
    private NodePila next;
    private NodoArbol info;
    
    public NodePila(NodoArbol x) {
        info = x;
        next = null;
    }
    
    public NodoArbol getNodoArbol() {
        return info;
    }

    /**
     * @param tInfo the tInfo to set
     */
    public void setInfo(NodoArbol tInfo) {
        this.info = tInfo;
    }

    /**
     * @return the next
     */
    public NodePila getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(NodePila next) {
        this.next = next;
    } 
    
}
