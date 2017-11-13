package Proyecto;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Mayor {

 

    public String cuenta;
    public ArrayList<String> debe = new ArrayList();
    public ArrayList<String> haber = new ArrayList();
    private DefaultTableModel tabla;
    private int i; 
    
    
    public Mayor(DefaultTableModel tabla) {
        this.tabla = tabla;
    }
    
   public void llenar(int indice){
        this.i = indice;
        String d = String.valueOf(tabla.getValueAt(i, 3)) ;
        String h = String.valueOf(tabla.getValueAt(i, 4));
        this.cuenta = (String) tabla.getValueAt(i, 2);
        if (!"0.0".equals(d) || d != null) 
            this.debe.add(d);
        if (!"0.0".equals(h) || h != null)
            this.haber.add(h);
   }
}
