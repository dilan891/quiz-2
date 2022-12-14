package Arbol;

import cola.Cola;
import cola.NodoCola;
import listas.lista.Lista;

/**
 *
 * @author dilan
 */
public class ArbolBinario {
    
    private NodoArbol raiz;
    private Cola cola = new Cola();
    private Lista palabras;
    
    public ArbolBinario() {
        this.raiz = null;
        this.palabras = new Lista();
    }

    /**
     * Agrega un elemento a la izquierda o derecha de un nodo del arbol
     *
     * @param padre (NodoArbol) es el nodo al que se agrega el elemento
     * @param elemento (String) es el contenido que ira en el nodo a agregar
     * @param dirrecion (int) si es 0 se envia a la izquierda si es 1 se envia a la derecha 
    *
     */
    public NodoArbol agregar(NodoArbol padre, String elemento,int direccion) {
        NodoArbol nodo = new NodoArbol(elemento);
        if (raiz == null) {
            raiz = nodo;
        } else {
            nodo.setPadre(padre);
            if (direccion == 1) {
                padre.setDerecha(nodo);
            }else if (direccion == 0) {
                padre.setIzquierda(nodo);
            }else{
                System.out.println("direccion invalida");
            }
        }
        return nodo;
    }

    /**
     * euncuentra un nodo con un elemento como referencia
     *
     * @param elemento es el elemento a buscar
    *
     */
    public NodoArbol encontrarNodo(String elemento, NodoArbol nodo) {
        if (nodo != null) {
            if (nodo.getInfo().equals(elemento)) {
                return nodo;
            } else {
                NodoArbol derecha = encontrarNodo(elemento, nodo.getDerecha());
                if (derecha != null) {
                    return derecha;
                }
                NodoArbol izquierda = encontrarNodo(elemento, nodo.getIzquierda());
                if (izquierda != null) {
                    return izquierda;
                }
            }            
        }
        return null;
    }
    
    public void recorrer(NodoArbol nodo,Cola listaCola){
        if(nodo == null){
            return;
        }
        cola.insertar(nodo.getInfo());
        if (nodo.getDerecha() == null && nodo.getIzquierda() == null) {
            cola.mostrar();
            palabras.append(cola.encolarString());
        }
        recorrer(nodo.getIzquierda(), listaCola);
        recorrer(nodo.getDerecha(), listaCola);
        
        cola.removeLast();
    }
    
    public void buscarPalabra(){
        recorrer(raiz,cola);
        palabras.mostrar();
    }
    
    public NodoArbol getRaiz() {
        return raiz;
    }
    
    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    
    public Lista getPalabras(){
        if (palabras != null) {
            return palabras;
        }
        return null;
    }
    
}
