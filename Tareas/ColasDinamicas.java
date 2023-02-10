package Tareas;
 import java.util.LinkedList;
 import javax.swing.JOptionPane;
public class ColasDinamicas {
    static LinkedList <Integer> cola = new LinkedList<Integer>();
    
    private boolean Vacia() {
        return cola.isEmpty();
    }//end vacia

    private void Insertar( int elemento) {
        cola.add(elemento);
    }//end Insertar

    private void Eliminar() {
        if (!Vacia()) {
            int elemento =cola.poll();
            JOptionPane.showMessageDialog(null, "Se elimno el elemento: "+elemento);
        }else {
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }//end if else
    }//end eliminar
}//ens class
