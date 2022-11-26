
package cola;

/**
 *
 * @author dilan
 */
public class NodoCola {
    
    private String elemento;
    private NodoCola anterior;
    
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
    
   
    
}
