
package cotehakemate;

import static cotehakemate.frm_verRegistro.modelo2;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SEBCOM
 */
public class frm_cotejar extends javax.swing.JInternalFrame {

    public static DefaultTableModel t1;

    /**
     * Creates new form frm_cotejar
     */
    public frm_cotejar() {
        initComponents();
        PrepararTabla();
    }

    public void PrepararTabla() {
        String titulos[] = {"NOMBRE", "VS", "NOMBRE"};
        t1 = new DefaultTableModel(null, titulos);
        jTable1c.setModel(t1);
//frm_verRegistro tabla2=new frm_verRegistro();
//        tabla2.setVisible(true);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanel1 = new cotehakemate.NewJPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1c = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTable1c.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1c);

        jButton2.setText("IMPRIMIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("COTEJAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newJPanel1Layout = new javax.swing.GroupLayout(newJPanel1);
        newJPanel1.setLayout(newJPanel1Layout);
        newJPanel1Layout.setHorizontalGroup(
            newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newJPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
        );
        newJPanel1Layout.setVerticalGroup(
            newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(newJPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  
        //Jala las columnas de los nombres
        int fila = jTable1c.getRowCount();
        int i;
        String valores = "";
        
        for (i = 0; i < fila; i++) {
            String valor = (String) jTable1c.getValueAt(i, 1);
            valores += valor;

            // Con esta condición solo ponemos comas hasta el penúltimo valor :)
            if (i < (fila - 1)) {
                valores += ", ";
            }
        }
        
        //Jala las columnas de los pesos de cada gallo
        int fila2 = jTable1c.getRowCount();
        String valores2 = "";
        for (int j = 0; j < fila2; j++) {
            String valor = (String) jTable1c.getValueAt(j, 1);
            valores2 += valor;

            // Con esta condición solo ponemos comas hasta el penúltimo valor :)
            if (j < (fila2 - 1)) {
                valores2 += ", ";
            }
        }
        limpiarTabla();
        //jTextArea1.setText(valores);
        String[] datos1 = valores.split(",");
        List<String> emparejados = new ArrayList<String>();
        Random rand = new Random();
        int randomNum = rand.nextInt(((datos1.length - 1) - 0) + 1);
        int equiposExtraidos = 0;
        String aux1 = "";
        String aux2 = "";

        while (equiposExtraidos < datos1.length) {
            if (emparejados.size() == datos1.length - 1) {
                break;
            }
            String equipo1 = "";
            do {
                randomNum = rand.nextInt(((datos1.length - 1) - 0) + 1);
                equipo1 = datos1[randomNum];
            } while (emparejados.contains(datos1[randomNum]));
            emparejados.add(equipo1);
            String equipo2 = "";
            do {
                randomNum = rand.nextInt(((datos1.length - 1) - 0) + 1);
                equipo2 = datos1[randomNum];
            } while (emparejados.contains(datos1[randomNum]));
            
            {
                emparejados.add(equipo2);
                aux1 = equipo1;
                aux2 = equipo2;
                //System.out.println(equipo1 + " vs " + equipo2);
                //cotejos.append(aux1 + " vs " + aux2 + "\n");
                equiposExtraidos++;
                t1 = (DefaultTableModel) jTable1c.getModel();
                String data[] = {aux1, "vs", aux2};
                t1.addRow(data);
            }
        }
        for (String equipo : datos1) {
            if (!emparejados.contains(equipo)) {
                String data3[] = {"- Exento: ", equipo};
                t1.addRow(data3);

            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PrinterJob job = PrinterJob.getPrinterJob();

        job.setPrintable(newJPanel1);

        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "La impresion se cancelo");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void limpiarTabla() {

        for (int i = 0; i < jTable1c.getRowCount(); i++) {
            t1.removeRow(i);
            i -= 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1c;
    private cotehakemate.NewJPanel newJPanel1;
    // End of variables declaration//GEN-END:variables
}
