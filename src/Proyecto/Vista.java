/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kevin
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    static int t = 0;
    static int ref = 1;
    DefaultTableModel modelo = new DefaultTableModel();

    public Vista() {
        initComponents();
        jTable.setModel(modelo);
        modelo.addColumn("Fecha");
        modelo.addColumn("Referencia");
        modelo.addColumn("Cuenta");
        modelo.addColumn("Debe");
        modelo.addColumn("Haber");

        txtRef.setEditable(false);
        txtRef.setText(Integer.toString(ref));
        txtDebe.setText("0");
        txtHaber.setText("0");

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        cbCuentas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtDebe = new javax.swing.JTextField();
        txtHaber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCarga = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnCerrarAsiento = new javax.swing.JButton();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ref N°:");

        txtRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefActionPerformed(evt);
            }
        });

        cbCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja", "Banco Cuenta corriente", "Acciones", "Inmuebles", "Deudores por ventas", "Alquileres a cobrar", "Rodado", "Mercaderias", "Proveedor", "Documentos a pagar", "Sueldos a pagar", "Acreedores varios" }));
        cbCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCuentasActionPerformed(evt);
            }
        });

        jLabel2.setText("Cuenta");

        txtDebe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDebeMouseClicked(evt);
            }
        });
        txtDebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDebeActionPerformed(evt);
            }
        });
        txtDebe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDebeKeyTyped(evt);
            }
        });

        txtHaber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHaberMouseClicked(evt);
            }
        });
        txtHaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHaberActionPerformed(evt);
            }
        });
        txtHaber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHaberKeyTyped(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Debe");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Haber");

        btnCarga.setText("Carga de Asiento");
        btnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButton1.setText("Nuevo Libro");

        jButton2.setText("Editar");

        btnImprimir.setText("Imprimir Mayor");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnCerrarAsiento.setText("Cerrar Asiento");
        btnCerrarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAsientoActionPerformed(evt);
            }
        });

        datePicker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datePickerMouseClicked(evt);
            }
        });

        jLabel5.setText("Fecha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCerrarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRef))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(datePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbCuentas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(txtHaber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCarga)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarAsiento)
                    .addComponent(jButton2)
                    .addComponent(btnImprimir)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaActionPerformed

        double haber = Double.parseDouble(txtHaber.getText());
        double debe = Double.parseDouble(txtDebe.getText());
        Date fecha = datePicker.getDate();

        if (fecha == null) {                                                      //validacion Fecha
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha");

        } else if (debe < 0 || haber < 0) {
            JOptionPane.showMessageDialog(null, "Error");
        } else {
            DateFormat fechDatePicker = new SimpleDateFormat("dd-MM-yyyy");   //Dar formato a tipo fecha(Date) para obtener de datePicker y colocarla en jtable 

            Object[] ingresos = new Object[5];                      // vector de objetos que pueda contener diferentes tipos

            ingresos[0] = fechDatePicker.format(fecha);
            ingresos[1] = txtRef.getText();
            ingresos[2] = cbCuentas.getSelectedItem().toString();

            ingresos[3] = txtDebe.getText();

            if (ingresos[3].equals("0") || ingresos[3].equals("")) {                               //Si el campo de texto esta vacio, pasar elemento vacio al jtable. Si no se produce error (no parsea nada)            
                ingresos[3] = (double) 0;
            } else {
                ingresos[3] = Double.parseDouble(txtDebe.getText());
            }
            ingresos[4] = txtHaber.getText();

            if (ingresos[4].equals("0")) {                             //Si el campo de texto esta vacio, pasar elemento vacio al jtable. Si no se produce error (no parsea nada)            
                ingresos[4] = (double) 0;
            } else {
                ingresos[4] = Double.parseDouble(txtHaber.getText());
            }

            modelo.addRow(ingresos);                                //se agrega el vector a la fila
        }
        /*RESETEAR VALORES DE TEXTFIELDS HABER Y DEBE*/
        txtDebe.setText("0");
        txtHaber.setText("0");

    }//GEN-LAST:event_btnCargaActionPerformed

    private void cbCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCuentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCuentasActionPerformed

    private void btnCerrarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAsientoActionPerformed
        double totalDebe = 0.0;
        double totalHaber = 0.0;

        /*SUMAR Y COMPARAR VALORES PARA PODER CERRAR EL ASIENTO*/ //(en proceso)
        String referencia = txtRef.getText();

        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (modelo.getValueAt(i, 1).toString().equals(referencia)) {
                totalDebe += (double) modelo.getValueAt(i, 3);           //se castea de double a objeto     
                totalHaber += (double) modelo.getValueAt(i, 4);
            }
        }

        //En proceso
        if (totalDebe == totalHaber && totalDebe > 0 && totalHaber > 0) {
            JOptionPane.showMessageDialog(null, "Cierre exitoso");
            /*DEJA UNA LINEA VACIA PARA COMENZAR OTRO ASIENTO*/
            String[] s = new String[5];

            s[0] = ("");
            s[1] = ("");
            s[2] = ("");
            s[3] = ("");
            s[4] = ("");

            modelo.addRow(s);
            t = 0;

            /*SETEAR VALOR DE REF SECUENCIAL*/
            ref++;
            int acu = ref;
            txtRef.setText(Integer.toString(acu));
        } else {
            JOptionPane.showMessageDialog(null, "Error, el total del Haber debe ser igual al debe");
            //btnCerrarAsiento.setEnabled(false);
        }

        //System.out.println("el total del Debe es de: "+totalDebe);      //traza para comprobar
        //System.out.println("el total del Haber es de:: "+totalHaber);

    }//GEN-LAST:event_btnCerrarAsientoActionPerformed

    private void txtRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        /*
        String arr[] = {"Debe", "Haber"};
        double debeCaja;
        double haberCaja;
         */
        ArrayList<Double> deb = new ArrayList<>();
        ArrayList<Double> hab = new ArrayList<>();

        /*
        for (int i = 0; i < modelo.getRowCount(); i++) {

            if (modelo.getValueAt(i, 2).equals("Caja")) {
                if (i == 0) {
                    System.out.print(arr[0] + "  " + arr[1]);
                    System.out.println("");
                }
                debeCaja = (double) modelo.getValueAt(i, 3);
                haberCaja = (double) modelo.getValueAt(i, 4);
                if (debeCaja != 0.0) {
                    deb.add(debeCaja);
                }
                if (haberCaja != 0) {
                    hab.add(haberCaja);
                }
            }
            
        }

        for (int i = 0; i < deb.size(); i++) {                  //imprimir valores del primer array al lado del otro
            System.out.println(deb.get(i) + "   " + hab.get(i));
        }
         */
        buscar();


    }//GEN-LAST:event_btnImprimirActionPerformed
    public void buscar() {
        ArrayList<Double> arrCajHaber = new ArrayList<>();
        ArrayList<Double> arrCajDebe = new ArrayList<>();
                            ArrayList<Double> arrAccHaber = new ArrayList<>();
                    ArrayList<Double> arrAccDebe = new ArrayList<>();

        String arr[] = {"Debe", "Haber"};
        double debe;
        double haber;

        for (int i = 0; i < modelo.getRowCount(); i++) {

            String cuenta = (String) modelo.getValueAt(i, 2);

            switch (cuenta) {

                case "Caja":

                    debe = (double) modelo.getValueAt(i, 3);
                    haber = (double) modelo.getValueAt(i, 4);
                    if (debe != 0.0) {
                        arrCajHaber.add(debe);
                    }
                    if (haber != 0) {
                        arrCajDebe.add(haber);
                    }
                    ;
                    break;
                case "Acciones":

                    debe = (double) modelo.getValueAt(i, 3);
                    haber = (double) modelo.getValueAt(i, 4);
                    if (debe != 0.0) {
                        arrAccHaber.add(debe);
                    }
                    if (haber != 0) {
                        arrAccDebe.add(haber);
                    }
                    ;
                    break;
                    
                default: System.out.println("error");
                break;
            }
        }

        
        
        for (int i = 0; i < arrCajHaber.size(); i++) {                  //imprimir valores del primer array al lado del otro
            if(i==0){
                System.out.println("Caja");
            }
            System.out.println(arrCajHaber.get(i) + "   " + arrCajDebe.get(i));
        }

        
        for (int i = 0; i < arrAccHaber.size(); i++) {                  //imprimir valores del primer array al lado del otro
            if(i==0){
                System.out.println("Acciones");
            }
            System.out.println(arrAccHaber.get(i) + "   " + arrAccDebe.get(i));
        }
        
    }
    private void txtDebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDebeActionPerformed

    }//GEN-LAST:event_txtDebeActionPerformed

    private void txtHaberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHaberMouseClicked
        if (txtHaber.hasFocus() == true) {
            txtHaber.setEditable(true);
            txtHaber.setText("");
            txtDebe.setText("0");
            txtDebe.setEditable(false);
        }
    }//GEN-LAST:event_txtHaberMouseClicked

    private void txtDebeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDebeMouseClicked
        if (txtDebe.hasFocus() == true) {
            txtDebe.setEditable(true);
            txtDebe.setText("");
            txtHaber.setText("0");
            txtHaber.setEditable(false);
        }
    }//GEN-LAST:event_txtDebeMouseClicked

    private void txtHaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHaberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHaberActionPerformed

    private void datePickerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datePickerMouseClicked

    }//GEN-LAST:event_datePickerMouseClicked

    private void txtDebeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebeKeyTyped
        char c = evt.getKeyChar();          //se obtiene la letra ingresada

        if (Character.isLetter(c)) {         //se valida si es un numero
            getToolkit().beep();

            evt.consume();

            JOptionPane.showMessageDialog(null, "Solo debe escribir números");
           txtDebe.setText("0");

        }     }//GEN-LAST:event_txtDebeKeyTyped

    private void txtHaberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHaberKeyTyped
       char c = evt.getKeyChar();          //se obtiene la letra ingresada

        if (Character.isLetter(c)) {         //se valida si es un numero
            getToolkit().beep();            //sonido de error

            evt.consume();

            JOptionPane.showMessageDialog(null, "Solo debe escribir números");
           txtHaber.setText("0");

        } 
    }//GEN-LAST:event_txtHaberKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarga;
    private javax.swing.JButton btnCerrarAsiento;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cbCuentas;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtDebe;
    private javax.swing.JTextField txtHaber;
    private javax.swing.JTextField txtRef;
    // End of variables declaration//GEN-END:variables
}
