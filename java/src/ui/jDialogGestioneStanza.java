package ui;

import cache.lists.ListaStanza;
import cache.singular.UtenteConnesso;
import constants.TipiStanza;
import entities.Stanza;
import interfaces.ICallback;
import interfaces.ICallbackGeneral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import web_services.StanzaManager;
import web_services.StrutturaManager;

public class jDialogGestioneStanza extends javax.swing.JDialog {

    private static StanzaManager stanzaManager;
    private static StrutturaManager strutturaManager;
    private String selectedStruttura;
    private int selectedStanza;
    private Boolean nuova;

    public jDialogGestioneStanza(java.awt.Frame parent, boolean modal, String struttura, StrutturaManager manager) {
        stanzaManager = new StanzaManager();
        strutturaManager = manager;
        selectedStruttura = struttura;
        initComponents();
        caricaStanze(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxStanze = new javax.swing.JComboBox<>();
        jPanelOperazioniStanza = new javax.swing.JPanel();
        jButtonAggiungi = new javax.swing.JButton();
        jButtonModifica = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jPanelInformazioniStanza = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaDescrizione = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldMq = new javax.swing.JTextField();
        jButtonConferma = new javax.swing.JButton();
        jButtonAgibile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxStanze.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAggiungi.setText("Aggiungi");
        jButtonAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggiungiActionPerformed(evt);
            }
        });

        jButtonModifica.setText("Modifica");
        jButtonModifica.setEnabled(false);
        jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");
        jButtonRimuovi.setEnabled(false);
        jButtonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperazioniStanzaLayout = new javax.swing.GroupLayout(jPanelOperazioniStanza);
        jPanelOperazioniStanza.setLayout(jPanelOperazioniStanzaLayout);
        jPanelOperazioniStanzaLayout.setHorizontalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOperazioniStanzaLayout.setVerticalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAggiungi)
                    .addComponent(jButtonModifica)
                    .addComponent(jButtonRimuovi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setText("Numero");

        jTextFieldNumero.setEnabled(false);

        jLabel14.setText("Tipo");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Singola", "Doppia", "Matrimoniale", "Tripla" }));
        jComboBoxTipo.setEnabled(false);

        jLabel12.setText("Descrizione");

        jTextAreaDescrizione.setColumns(20);
        jTextAreaDescrizione.setLineWrap(true);
        jTextAreaDescrizione.setRows(5);
        jTextAreaDescrizione.setEnabled(false);
        jScrollPane6.setViewportView(jTextAreaDescrizione);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Mq");

        jTextFieldMq.setEnabled(false);

        jButtonConferma.setText("Conferma");
        jButtonConferma.setEnabled(false);
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jButtonAgibile.setBackground(java.awt.Color.green);
        jButtonAgibile.setForeground(java.awt.Color.black);
        jButtonAgibile.setText("SI");
        jButtonAgibile.setEnabled(false);
        jButtonAgibile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgibileActionPerformed(evt);
            }
        });

        jLabel1.setText("Agibile");

        javax.swing.GroupLayout jPanelInformazioniStanzaLayout = new javax.swing.GroupLayout(jPanelInformazioniStanza);
        jPanelInformazioniStanza.setLayout(jPanelInformazioniStanzaLayout);
        jPanelInformazioniStanzaLayout.setHorizontalGroup(
            jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInformazioniStanzaLayout.createSequentialGroup()
                        .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgibile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformazioniStanzaLayout.createSequentialGroup()
                        .addComponent(jButtonConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelInformazioniStanzaLayout.setVerticalGroup(
            jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(8, 8, 8)
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgibile)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButtonConferma)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanelInformazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBoxStanze, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxStanze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInformazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiungiActionPerformed
        aggiungiStanza();
        nuova = true;
    }//GEN-LAST:event_jButtonAggiungiActionPerformed

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        modificaStanza();
        nuova = false;
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        rimuoviStanza();
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonAgibileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgibileActionPerformed
        String text = ((JButton) evt.getSource()).getText();
        if (text.equals("SI")) {
            ((JButton) evt.getSource()).setText("NO");
        } else {
            ((JButton) evt.getSource()).setText("SI");
        }
    }//GEN-LAST:event_jButtonAgibileActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        
        Stanza stanza = creaStanza();
        
        if(nuova) {
            stanzaManager.addStanza(stanza, new ICallbackGeneral());
            ListaStanza.getIstanza().add(stanza);
        } else {
            stanzaManager.updateStanza(creaStanza(), new ICallbackGeneral());
            ListaStanza.getIstanza().set(selectedStanza, stanza);
        }
        
        caricaStanze(true);
    }//GEN-LAST:event_jButtonConfermaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiungi;
    private javax.swing.JButton jButtonAgibile;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JComboBox<String> jComboBoxStanze;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JPanel jPanelInformazioniStanza;
    private javax.swing.JPanel jPanelOperazioniStanza;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaDescrizione;
    private javax.swing.JTextField jTextFieldMq;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

    

    // METODI SUPPORTO
    private void aggiungiStanza() {
        jTextFieldNumero.setText("");
        jTextAreaDescrizione.setText("");
        jTextFieldMq.setText("");
        modificaStanza();        
    }
    
    private void modificaStanza() {
        jTextFieldNumero.setEnabled(true);
        jTextAreaDescrizione.setEnabled(true);
        jTextFieldMq.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jButtonAgibile.setEnabled(true);
        jButtonConferma.setEnabled(true);
    }
    
    private void rimuoviStanza() {
        String messaggio = "Rimuovere la stanza: " + ListaStanza.getIstanza().get(selectedStanza).getNumero();
        int scelta = JOptionPane.showConfirmDialog(null, messaggio, null, JOptionPane.YES_NO_OPTION);
        if(scelta == JOptionPane.YES_OPTION) {
            stanzaManager.deleteStanza(ListaStanza.getIstanza().get(selectedStanza), new ICallbackGeneral());
            ListaStanza.getIstanza().remove(selectedStanza);
            caricaStanze(true);
        }
    }
    
    private void visualizzaInformazioni(int index) {

        Stanza input = ListaStanza.getIstanza().get(index);
        jTextFieldNumero.setText(input.getNumero());
        jTextAreaDescrizione.setText(input.getDescrizione());
        jTextFieldMq.setText(input.getMq() + "");

        switch (input.getTipo()) {
            case TipiStanza.SINGOLA:
                jComboBoxTipo.setSelectedIndex(0);
                break;
            case TipiStanza.DOPPIA:
                jComboBoxTipo.setSelectedIndex(1);
                break;
            case TipiStanza.MATRIMONIALE:
                jComboBoxTipo.setSelectedIndex(2);
                break;
            case TipiStanza.TRIPLA:
                jComboBoxTipo.setSelectedIndex(3);
                break;
        }

        if (input.getAgibile() == 1) {
            jButtonAgibile.setText("SI");
        } else {
            jButtonAgibile.setText("NO");
        }
        
        jButtonModifica.setEnabled(true);
        jButtonRimuovi.setEnabled(true);
    }

    private Stanza creaStanza() {

        Stanza newStanza = new Stanza();
        newStanza.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleProprietario());
        newStanza.setNomeStruttura(selectedStruttura);

        newStanza.setNumero(jTextFieldNumero.getText());
        newStanza.setDescrizione(jTextAreaDescrizione.getText());
        newStanza.setMq(Float.parseFloat(jTextFieldMq.getText()));

        if (jComboBoxTipo.getSelectedIndex() == 0) {
            newStanza.setTipo(TipiStanza.SINGOLA);
        }
        if (jComboBoxTipo.getSelectedIndex() == 1) {
            newStanza.setTipo(TipiStanza.DOPPIA);
        }
        if (jComboBoxTipo.getSelectedIndex() == 2) {
            newStanza.setTipo(TipiStanza.MATRIMONIALE);
        }
        if (jComboBoxTipo.getSelectedIndex() == 3) {
            newStanza.setTipo(TipiStanza.TRIPLA);
        }

        if (jButtonAgibile.getText().equals("SI")) {
            newStanza.setAgibile(1);
        } else {
            newStanza.setAgibile(0);
        }

        return newStanza;
    }

    private ICallback<Boolean> callback = new ICallback<Boolean>() {

        public void result(Boolean obj) {
            ListaStanza stanze = ListaStanza.getIstanza();
            int n = stanze.size();

            if (n != 0) {
                Vector<String> items = new Vector<>();
                for (int i = 0; i < n; i++) {
                    items.add(stanze.get(i).getNumero());
                }

                jComboBoxStanze.setModel(new DefaultComboBoxModel<String>(items));
                jComboBoxStanze.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        selectedStanza = jComboBoxStanze.getSelectedIndex();
                        visualizzaInformazioni(jComboBoxStanze.getSelectedIndex());
                    }
                });
            } else {
                Vector<String> items = new Vector<>();
                items.add("Nessuna stanza presente.");
                jComboBoxStanze.setModel(new DefaultComboBoxModel<String>(items));
            }
        }
    };
    
    private void caricaStanze(boolean refresh) {

        if (!refresh) {
            strutturaManager.readStanzeStruttura(selectedStruttura, 
                    UtenteConnesso.getUtente().getCodiceFiscaleProprietario(), callback);
        } else {
            callback.result(refresh);
        }
    }

}
