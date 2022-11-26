package listas.lista;

/**
 *
 * @author dilan
 */
public class Nodo {
    
    private Object elemento;
    private Nodo next; 
    
    public Nodo(String elemnto){
        this.elemento = elemnto;
        this.next = null;
    }
    
    public Nodo(){
        this.elemento = "";
        this.next = null;
    }
    
    public Nodo(String elemnto, Nodo nodo){
        this.elemento = elemnto;
        this.next = nodo;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the next
     */
    public Nodo getSiguiente() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setSiguiente(Nodo next) {
        this.next = next;
    }
    
    
    
}
