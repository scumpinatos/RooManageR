package ui;

import cache.User;
import entities.Stanza;
import entities.Struttura;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.StanzaManager;
import web_services.StrutturaManager;

public class UIStruttura extends javax.swing.JDialog {

    private Frame parent = null;
    private ArrayList<Stanza> stanze = null;
    private int indexSelectedStanza;

    public UIStruttura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        initComponents();
        stanze = new ArrayList<Stanza>();
        popolaElencoStanze();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIndirizzo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelElencoStanze = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableStanze = new javax.swing.JTable();
        jButtonAggiungiStanza = new javax.swing.JButton();
        jButtonRimuoviStanza = new javax.swing.JButton();
        jButtonModificaStanza = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrizione = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuova struttura");
        setResizable(false);

        jLabel1.setText("Nome");

        jLabel2.setText("Indirizzo");

        jLabel3.setText("Descrizione");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Elenco stanze struttura");

        jTableStanze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStanzeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableStanze);

        jButtonAggiungiStanza.setText("Aggiungi stanza");
        jButtonAggiungiStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggiungiStanzaActionPerformed(evt);
            }
        });

        jButtonRimuoviStanza.setText("Rimuovi stanza");
        jButtonRimuoviStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviStanzaActionPerformed(evt);
            }
        });

        jButtonModificaStanza.setText("Modifica stanza");
        jButtonModificaStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaStanzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelElencoStanzeLayout = new javax.swing.GroupLayout(jPanelElencoStanze);
        jPanelElencoStanze.setLayout(jPanelElencoStanzeLayout);
        jPanelElencoStanzeLayout.setHorizontalGroup(
            jPanelElencoStanzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoStanzeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElencoStanzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addGroup(jPanelElencoStanzeLayout.createSequentialGroup()
                        .addComponent(jButtonRimuoviStanza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificaStanza)
                        .addGap(94, 94, 94)
                        .addComponent(jButtonAggiungiStanza))))
        );
        jPanelElencoStanzeLayout.setVerticalGroup(
            jPanelElencoStanzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoStanzeLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelElencoStanzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAggiungiStanza)
                    .addComponent(jButtonRimuoviStanza)
                    .addComponent(jButtonModificaStanza))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jButtonConferma.setText("Conferma");
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jTextAreaDescrizione.setColumns(20);
        jTextAreaDescrizione.setLineWrap(true);
        jTextAreaDescrizione.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrizione);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelElencoStanze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextFieldIndirizzo)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonAnnulla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConferma))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoStanze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed

        /* AGGIUNGO LA NUOVA STRUTTURA
        Struttura newStruttura = new Struttura();
        newStruttura.setDescrizione(jTextAreaDescrizione.getText());
        newStruttura.setIndirizzo(jTextFieldIndirizzo.getText());
        newStruttura.setNome(jTextFieldNome.getText());
        newStruttura.setCodicefiscaleanagrafica(User.getInstance().getUtente().getCodiceFiscaleAnagrafica());
        new StrutturaManager().addStruttura(newStruttura);
        
        // AGGIUNGO LE STANZE
        new StanzaManager().addElencoStanze(stanze); */
        
        JOptionPane.showMessageDialog(null, "Funzionalità non ancora implementata");
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonRimuoviStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviStanzaActionPerformed

        String stanza = stanze.get(indexSelectedStanza).getNumero();
        int choice = JOptionPane.showConfirmDialog(parent, "Sicuro di voler rimuovere " + stanza, "CONFERMA", JOptionPane.YES_NO_OPTION);
        System.out.println(choice);
        //new StanzaManager().removeStanza(stanze.get(indexSelectedStanza));
        stanze.remove(indexSelectedStanza);
    }//GEN-LAST:event_jButtonRimuoviStanzaActionPerformed

    private void jButtonModificaStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaStanzaActionPerformed

        new UIStanza(parent, true, stanze).visualizza(stanze.get(indexSelectedStanza));
    }//GEN-LAST:event_jButtonModificaStanzaActionPerformed

    private void jButtonAggiungiStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiungiStanzaActionPerformed

        UIStanza uiStanza = new UIStanza(parent, true, stanze);
        uiStanza.setVisible(true);
        while(uiStanza.isShowing()) {}
        popolaElencoStanze();
    }//GEN-LAST:event_jButtonAggiungiStanzaActionPerformed

    private void jTableStanzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStanzeMouseClicked
        
        indexSelectedStanza = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableStanzeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiungiStanza;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModificaStanza;
    private javax.swing.JButton jButtonRimuoviStanza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelElencoStanze;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTextArea jTextAreaDescrizione;
    private javax.swing.JTextField jTextFieldIndirizzo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    private void popolaElencoStanze() {

        int nStanze = stanze.size();

        if (nStanze > 0) {

            // COLONNE
            String[] colonne = new String[4];
            colonne[0] = "Numero";
            colonne[1] = "Tipo";
            colonne[2] = "Mq";
            colonne[3] = "Descrizione";

            // DATI
            Object[][] dati = new Object[nStanze][4];
            for (int i = 0; i < nStanze; i++) {

                dati[i][0] = stanze.get(i).getNumero();
                dati[i][1] = stanze.get(i).getTipo();
                dati[i][2] = stanze.get(i).getMq();
                dati[i][3] = stanze.get(i).getDescrizione();
            }

            TableModel model = new DefaultTableModel(dati, colonne);
            jTableStanze.setModel(model);
        }
    }

}
