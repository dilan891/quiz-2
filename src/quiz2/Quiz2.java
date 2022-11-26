package quiz2;

import Arbol.ArbolBinario;
import Arbol.NodoArbol;
import quiz2.arvhivo.AccestTxt;

/**
 *
 * @author dilan
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AccestTxt txt = new AccestTxt("A:/programa/programacion/java/quiz2/src/quiz2/arvhivo/palabras.txt");
        String datos = txt.readTxt();
        ArbolBinario arbol = new ArbolBinario();
        String[] linea = datos.split("\n");
        NodoArbol aux = arbol.getRaiz();
        Boolean agregado = false;
        for (int i = 0; i < linea.length; i++) {
            String[] data = linea[i].split(",");
            for (int j = 0; j < data.length; j++) {
                data[j] = data[j].replace(" ", "");
            }
            if (!agregado) {
                arbol.setRaiz(new NodoArbol(data[0]));
                agregado = true;
            }else{
                int dirrecion = -1;
                aux = arbol.encontrarNodo(data[1], arbol.getRaiz());
                if (data[2].equals("left")) {
                    dirrecion = 0;
                }else{
                    dirrecion = 1;
                }
                arbol.agregar(aux, data[0],dirrecion);
            }          
        }
        
        arbol.buscarPalabra("hola");
        
        //System.out.println(arbol.getRaiz().getDerecha().getDerecha().getDerecha().getInfo());
        
        //System.out.println(linea[0]);
        //System.out.println(data);
    }
    
}
