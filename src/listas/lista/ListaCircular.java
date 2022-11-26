package listas.lista;

/**
 *
 * @author dilan
 */
public class ListaCircular {

    private Nodo first;

    public ListaCircular() {
        this.first = null;
    }

    /**
     * recorre la lsita y aunmenta el contador con cada recorrido
     * @return retorna el numero de nodos que hay en la lista
    **/
    public int lenght() {
        if (first == null) {
            return 0;
        } else if (first.getSiguiente() == null) {
            return 1;
        } else {
            Nodo aux = first.getSiguiente();
            int count = 1;
            while (aux != first) {
                aux = aux.getSiguiente();
                count++;
            }
            return count;
        }
    }

    /**
     * añade un elemento a la lista
     * @param dato es el elemento que se quiere añadir a la lista
    **/
    public void append(String dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(first);
        if (this.first == null) {
            this.first = nuevo;
        } else if (first.getSiguiente() == null) {
            first.setSiguiente(nuevo);
        } else {
            Nodo aux = first.getSiguiente();
            while (aux.getSiguiente() != first) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    /**
     * Muestra todos los elementos de la lista
     *
     */
    public String mostrar() {
        String muestra = "--Lista--";
        if (this.first == null) {
            System.out.println("La lsita esta vacia");
        } else if (first.getSiguiente() == null) {
            System.out.println(first.getElemento());
        } else {
            Nodo aux2 = first;
            Nodo aux = first.getSiguiente();
            while (aux != first) {
                aux = aux.getSiguiente();
                System.out.println(aux2.getElemento());
                muestra = muestra + "\n" + aux2.getElemento();
                aux2 = aux2.getSiguiente();
            }
            System.out.println(aux2.getElemento());
            muestra = muestra + "\n" + aux2.getElemento();
            //System.out.println(aux2.getSiguiente().getElemento());
        }
        return muestra;
    }

    /**
     * elemina un valor de la lsita toamndo la posiscion del valor
     * @param position es la posicion del elemento a eliminar
    **/
    public void delete(int position) {
        if (first == null) {
            System.out.println("Lista ya esta vacia");
        } else {
            int lenght = lenght();
            if (lenght == 1 && position == 0) {
                first = null;
            }
            else if (position+1 > lenght || position<0){
                System.out.println("Posicion no existe");
            }
            else if (position == 0) {
                Nodo aux = first;
                while (aux.getSiguiente() != first) {                 
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == first) {
                    aux.setSiguiente(first.getSiguiente());
                 }
                first = first.getSiguiente();
            }
            else{
                Nodo aux = first;               
                for (int i = 0; i < lenght; i++) {
                    if (i == position - 1) {
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    }
                    aux = aux.getSiguiente();
                }
            }
        }

    }

}
