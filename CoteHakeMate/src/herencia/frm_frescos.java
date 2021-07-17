/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class frm_frescos extends javax.swing.JInternalFrame {

    DefaultTableModel t;

    /**
     * Creates new form frm_frescos
     */
    public frm_frescos() {
        initComponents();
        PrepararTabla();
    }

    private void PrepararTabla() {
        String titulos[] = {"F.CADUCIDAD", "LOTE", "F.ENVASADO", "PAIS ORIGEN", "PRODUCTO"};
        t = new DefaultTableModel(null, titulos);
        jTable1.setModel(t);
    }
    private void limpiar(){
        txt_fechacaducidad1.setText("");
        txt_fechaenvasado.setText("");
        txt_lote1.setText("");
        txt_pais.setText("");
        txt_producto.setText("");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_pais = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_lote1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_producto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_fechaenvasado = new javax.swing.JTextField();
        txt_fechacaducidad1 = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("Fecha Caducidad");

        jLabel2.setText("Lote");

        jLabel3.setText("Fecha Envasado");

        jLabel4.setText("Pais Origen");

        txt_lote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lote1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Producto");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_lote1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                        .addComponent(txt_fechaenvasado)
                                        .addComponent(txt_fechacaducidad1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jButton1)
                                .addGap(46, 46, 46)
                                .addComponent(jButton2)
                                .addGap(55, 55, 55)
                                .addComponent(jButton3)))
                        .addGap(0, 464, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private static boolean bandera = false;
    private void txt_lote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lote1ActionPerformed

    }//GEN-LAST:event_txt_lote1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (bandera == false) {
//                String fecha_caducidad, String lote, String fecha_envasada, String pais_origen, String producto
                cls_frescos obj_frescos = new cls_frescos(txt_fechacaducidad1.getText(), txt_lote1.getText(), String.valueOf(txt_fechaenvasado.getText()), txt_pais.getText(), txt_producto.getText());
                t = (DefaultTableModel) jTable1.getModel();
                String datos[] = {obj_frescos.getFecha_caducidad(), obj_frescos.getLote(), obj_frescos.getFecha_envasada(), obj_frescos.getPais_origen(), obj_frescos.getProducto()};
                t.addRow(datos);
                limpiar();
            }
            if (bandera == true) {
                jTable1.setValueAt(txt_fechacaducidad1.getText(), jTable1.getSelectedRow(), 0);
                jTable1.setValueAt(txt_lote1.getText(), jTable1.getSelectedRow(), 1);
                jTable1.setValueAt(txt_fechaenvasado.getText(), jTable1.getSelectedRow(), 2);
                jTable1.setValueAt(txt_pais.getText(), jTable1.getSelectedRow(), 3);
                jTable1.setValueAt(txt_producto.getText(), jTable1.getSelectedRow(), 4);
                limpiar();
                
                
            }
            bandera=false;
            jTable1.clearSelection();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (jTable1.getSelectedRow() >= 0) {
               txt_fechacaducidad1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                txt_lote1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
                txt_fechaenvasado.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
                txt_pais.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
                txt_producto.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
 
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_fechacaducidad1;
    private javax.swing.JTextField txt_fechaenvasado;
    private javax.swing.JTextField txt_lote1;
    private javax.swing.JTextField txt_pais;
    private javax.swing.JTextField txt_producto;
    // End of variables declaration//GEN-END:variables
}
