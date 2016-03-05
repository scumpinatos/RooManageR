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

        setName("Registro Operazioni"); // NOI18N

        jTableRegOp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableRegOp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
        colonne[0] = "Data - Ora : Descrizione";

        TableModel model = new DefaultTableModel(dati, colonne);
        jTableRegOp.setModel(model);
    }

    
}
