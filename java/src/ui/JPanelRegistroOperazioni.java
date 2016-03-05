/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import cache.lists.ListaOperazioni;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class JPanelRegistroOperazioni extends javax.swing.JPanel {

    public JPanelRegistroOperazioni() {
        initComponents();
        caricaOperazioni();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        jTableRegOp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setName("Registro Operazioni"); // NOI18N

        jTableRegOp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableRegOp);

        jButton1.setText("Aggiorna");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        caricaOperazioni();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableRegOp;
    // End of variables declaration//GEN-END:variables

    private void caricaOperazioni() {

        jTableRegOp.setEnabled(true);

        ListaOperazioni operazioni = ListaOperazioni.getListaOperazioni();
        int nOp = operazioni.size();

        String[][] dati = new String[nOp][1];
        for (int i = 0; i < nOp; i++) {
            dati[i][0] = operazioni.get(i);
        }

        String[] colonne = new String[1];
        colonne[0] = "Data - Ora  Descrizione";

        TableModel model = new DefaultTableModel(dati, colonne);
        jTableRegOp.setModel(model);
    }

    
}
