
package cola;

/**
 *
 * @author dilan
 */
public class NodoCola {
    
    private String elemento;
    private NodoCola anterior;
    private NodoCola siguiente;
    
    public NodoCola(String elemento) {
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    public NodoCola getAnterior() {
        return anterior;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void setAnterior(NodoCola anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }
    
   
    
}
