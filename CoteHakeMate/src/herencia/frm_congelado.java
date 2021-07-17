/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class frm_congelado extends javax.swing.JInternalFrame {

       DefaultTableModel t;
    public frm_congelado() {
        initComponents();
        PrepararTabla();
        
    }
 private void PrepararTabla() {
        //String Codigo_Supervision, String fecha_caducidad, String lote, String fecha_envasada, String pais_origen, String temperatura, String producto
        String titulos[] = { "F.Caducidad", "Lote", "F.Envasada", "Pais", "Temperatura", "Producto"};
        t = new DefaultTableModel(null, titulos);
        jTable1.setModel(t);
    }

    private  void limpiar() {
        txt_fechacaducidad1.setText("");
        txt_fechaenvasado.setText("");
        txt_lote1.setText("");
        txt_pais.setText("");
        txt_producto.setText("");
        txt_temperatura.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_lote1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_temperatura = new javax.swing.JTextField();
        txt_pais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_producto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_fechaenvasado = new javax.swing.JTextField();
        txt_fechacaducidad1 = new javax.swing.JTextField();

        setClosable(true);

        txt_lote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lote1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Lote");

        jLabel7.setText("Temperatura");

        jLabel3.setText("Fecha Envasado");

        jLabel5.setText("Producto");

        jLabel1.setText("Fecha Caducidad");

        jLabel4.setText("Pais Origen");

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDITAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_fechaenvasado.setText("--/--/----");
        txt_fechaenvasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaenvasadoActionPerformed(evt);
            }
        });

        txt_fechacaducidad1.setText("--/--/----");
        txt_fechacaducidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechacaducidad1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_lote1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(txt_fechaenvasado)
                        .addComponent(txt_fechacaducidad1)))
                .addContainerGap(244, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addGap(55, 55, 55)
                .addComponent(jButton3)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_fechacaducidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_lote1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_fechaenvasado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lote1ActionPerformed
        
    }//GEN-LAST:event_txt_lote1ActionPerformed
    private static boolean bandera = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (bandera == false) {
                //                                                                               String Codigo_Supervision, String fecha_caducidad, String lote, String fecha_envasada, String pais_origen, String temperatura, String producto
                cls_congelados obj_congelado = new cls_congelados( txt_fechacaducidad1.getText(), (txt_lote1.getText()), txt_fechaenvasado.getText(), txt_pais.getText(), txt_temperatura.getText(), txt_producto.getText());
                t = (DefaultTableModel) jTable1.getModel();
                String datos[] = { obj_congelado.getFecha_caducidad(), obj_congelado.getLote(), obj_congelado.getFecha_envasada(), obj_congelado.getPais_origen(), obj_congelado.getTemperatura(), obj_congelado.getProducto()};
                t.addRow(datos);
                limpiar();
                
            }
            if (bandera == true) {
//              "F.Caducidad", "Lote", "F.Envasada", "Pais", "Temperatura", "Producto"
                jTable1.setValueAt(txt_fechacaducidad1.getText(), jTable1.getSelectedRow(), 0);
                jTable1.setValueAt(txt_lote1.getText(), jTable1.getSelectedRow(), 1);
                jTable1.setValueAt(txt_fechaenvasado.getText(), jTable1.getSelectedRow(), 2);
                jTable1.setValueAt(txt_pais.getText(), jTable1.getSelectedRow(), 3);
                jTable1.setValueAt(txt_temperatura.getText(), jTable1.getSelectedRow(), 4);
                jTable1.setValueAt(txt_producto.getText(), jTable1.getSelectedRow(), 4);
                limpiar();
                   jTable1.clearSelection();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (jTable1.getSelectedRow() >= 0) {
                //              "F.Caducidad", "Lote", "F.Envasada", "Pais", "Temperatura", "Producto"
                txt_fechacaducidad1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                txt_lote1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                txt_fechaenvasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                txt_pais.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                txt_temperatura.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
                txt_producto.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());

                bandera = true;
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una fila");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila_eliminada = jTable1.getSelectedRow();
        if (fila_eliminada == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione la Fila");
        } else {
            t = (DefaultTableModel) jTable1.getModel();
            t.removeRow(fila_eliminada);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_fechaenvasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaenvasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaenvasadoActionPerformed

    private void txt_fechacaducidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechacaducidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechacaducidad1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_fechacaducidad1;
    private javax.swing.JTextField txt_fechaenvasado;
    private javax.swing.JTextField txt_lote1;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_producto;
    private javax.swing.JTextField txt_temperatura;
    // End of variables declaration//GEN-END:variables
}
