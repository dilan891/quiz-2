package quiz2.arvhivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author dilan
 */
public class AccestTxt {

    private final String path;

    public AccestTxt(String path) {
        this.path = path;
    }

    /**
     * Lee un txt y guarda el contenido en una varible dato
     *
     * @return retorna la varible dato con el contenido del txt
     *
     */
    public String readTxt() {
        String dato = "";
        File file = new File(path);
        try {
            if (!file.exists()) {
                JOptionPane.showMessageDialog(null, "No se ha podido encontrar el txt verifique el path");
            }
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    dato = dato + line + "\n";
                }
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return dato;
    }

    /**
     * Escribe un elemento en el txt
     *
     * @param elemento es el contenido que se insertara en el txt
    *
     */
    public void writeTxt(String elemento) {
        File file = new File(path);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.append(elemento);
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "No se ha podido encontrar el txt verifique el path");
        }
    }

}
