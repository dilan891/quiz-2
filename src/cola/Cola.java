package cola;

/**
 *
 * @author dilan
 */
public class Cola {

    NodoCola last;
    NodoCola first;
    int size = 0;

    public Cola() {
        this.last = null;
        this.first = null;
    }

    public void insertar(String elemento){
        NodoCola nodo = new NodoCola(elemento); 
        if (first == null) {
            first = nodo;
            last = nodo;
            size++;
        }else{
            last.setAnterior(nodo);
            last = nodo;
            size++;
        }
    }
    
    public void clonar(Cola cola){
        NodoCola aux = cola.first;
        while(aux != null){
            insertar(aux.getElemento()); 
            aux = aux.getAnterior();
        }
        System.out.println(first.getElemento() + " last " + last.getElemento());
    }
    
    public NodoCola remover(){
        NodoCola aux = first;
        if (first != null) {
            first = first.getAnterior();
            size--;
        }
        return aux;
    }

    public void mostrar(){
        NodoCola aux = first;
        while(aux != null){
            System.out.println(aux.getElemento());
            aux = aux.getAnterior();
        }
        System.out.println("//\n");
    }
    
    public NodoCola getFirst() {
        return first;
    }
    
    public int getSize() {
        return size;
    }
    
    
}
