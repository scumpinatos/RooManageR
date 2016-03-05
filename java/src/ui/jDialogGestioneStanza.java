package ui;

import cache.lists.ListaStanza;
import cache.singular.UtenteConnesso;
import constants.TipiStanza;
import entities.Stanza;
import interfaces.ICallback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import web_services.StanzaManager;

public class jDialogGestioneStanza extends javax.swing.JDialog {

    private static StanzaManager stanzaManager;
    private String selectedStruttura;
    private int selectedStanza;
    private Boolean newStanza, noStanza;
    private static Stanza temp;

    public jDialogGestioneStanza(java.awt.Frame parent, boolean modal, String struttura) {
        stanzaManager = new StanzaManager();
        selectedStruttura = struttura;
        initComponents();
        loadStanze(false);
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
        jButtonChiudi = new javax.swing.JButton();

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

        jButtonChiudi.setText("Chiudi");
        jButtonChiudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiudiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInformazioniStanzaLayout = new javax.swing.GroupLayout(jPanelInformazioniStanza);
        jPanelInformazioniStanza.setLayout(jPanelInformazioniStanzaLayout);
        jPanelInformazioniStanzaLayout.setHorizontalGroup(
            jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonChiudi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelInformazioniStanzaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
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
                .addContainerGap(52, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanelInformazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonChiudi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxStanze, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelInformazioniStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        createStanza();
        newStanza = true;
    }//GEN-LAST:event_jButtonAggiungiActionPerformed

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        updateStanza();
        newStanza = false;
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        deleteStanza();
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonAgibileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgibileActionPerformed
        setAgibile();
    }//GEN-LAST:event_jButtonAgibileActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        confirmOperation();
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    private void jButtonChiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChiudiActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButtonChiudiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiungi;
    private javax.swing.JButton jButtonAgibile;
    private javax.swing.JButton jButtonChiudi;
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

    // CALLBACK PER LE OPERAZIONI
    private ICallback<Stanza> callbackCreate = new ICallback<Stanza>() {
        @Override
        public void result(Stanza obj) {

            if (obj == null) {
                ListaStanza.getIstanza().add(temp);
                loadStanze(true);
                operazioneRiuscita();
            }
        }
    };

    private ICallback<Stanza> callbackUpdate = new ICallback<Stanza>() {
        @Override
        public void result(Stanza obj) {

            if (obj == null) {
                ListaStanza.getIstanza().set(selectedStanza, temp);
                loadStanze(true);
                operazioneRiuscita();
            }
        }
    };

    private ICallback<Stanza> callbackDelete = new ICallback<Stanza>() {
        @Override
        public void result(Stanza obj) {

            if (obj == null) {
                ListaStanza.getIstanza().remove(selectedStanza);
                loadStanze(true);
            }
        }
    };

    private ICallback<Boolean> callbackRead = new ICallback<Boolean>() {

        public void result(Boolean obj) {

            if (!obj) {
                Vector<String> items = new Vector<>();
                items.add("Nessuna stanza presente.");
                jComboBoxStanze.setModel(new DefaultComboBoxModel<String>(items));
                noStanza = true;
            } else {
                ListaStanza stanze = ListaStanza.getIstanza();
                int n = stanze.size();

                Vector<String> items = new Vector<>();
                for (int i = 0; i < n; i++) {
                    items.add(stanze.get(i).getNumero());
                }

                jComboBoxStanze.setModel(new DefaultComboBoxModel<String>(items));
                jComboBoxStanze.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        selectedStanza = jComboBoxStanze.getSelectedIndex();
                        readStanza(jComboBoxStanze.getSelectedIndex());
                    }
                });

                noStanza = false;
            }
        }

    };

    // CRUD
    private void createStanza() {
        jTextFieldNumero.setText("");
        jTextFieldNumero.setEnabled(true);
        jTextAreaDescrizione.setText("");
        jTextFieldMq.setText("");
        updateStanza();
    }

    private void updateStanza() {
        jTextAreaDescrizione.setEnabled(true);
        jTextFieldMq.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jButtonAgibile.setEnabled(true);
        jButtonConferma.setEnabled(true);
    }

    private void readStanza(int index) {

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

    private void deleteStanza() {
        String messaggio = "Rimuovere la stanza: " + ListaStanza.getIstanza().get(selectedStanza).getNumero();
        int scelta = JOptionPane.showConfirmDialog(null, messaggio, null, JOptionPane.YES_NO_OPTION);
        if (scelta == JOptionPane.YES_OPTION) {
            stanzaManager.deleteStanza(ListaStanza.getIstanza().get(selectedStanza), callbackDelete);
        }
    }

    private void confirmOperation() {

        if (!noStanza && !(controlName(jTextFieldNumero.getText()))) {
            JOptionPane.showMessageDialog(null, "Numero stanza già presente in archivio");
        } else {
            temp = getInsertInfo();

            if (newStanza) {
                stanzaManager.createStanza(temp, callbackCreate);
            } else {
                stanzaManager.updateStanza(temp, callbackUpdate);
            }
        }
    }

    // METODI SUPPORTO
    private void setAgibile() {
        String text = jButtonAgibile.getText();
        if (text.equals("SI")) {
            jButtonAgibile.setText("NO");
        } else {
            jButtonAgibile.setText("SI");
        }
    }

    private void operazioneRiuscita() {
        jTextFieldNumero.setEnabled(false);
        jTextAreaDescrizione.setEnabled(false);
        jTextFieldMq.setEnabled(false);
        jTextFieldNumero.setText("");
        jTextAreaDescrizione.setText("");
        jTextFieldMq.setText("");
        jComboBoxTipo.setEnabled(false);
        jButtonAgibile.setEnabled(false);
        jButtonConferma.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Operazione riuscita");
    }

    private Stanza getInsertInfo() {

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

    private void loadStanze(boolean refresh) {

        if (!refresh) {
            new StanzaManager().readStanzeStruttura(selectedStruttura,
                    UtenteConnesso.getUtente().getCodiceFiscaleProprietario(), callbackRead);
        } else {
            callbackRead.result(refresh);
        }
    }

    private Boolean controlName(String nome) {

        int n = ListaStanza.getIstanza().size();
        for (int i = 0; i < n; i++) {
            if (ListaStanza.getIstanza().get(i).getNumero().equals(nome)) {
                return false;
            } else {
                return true;
            }
        }
        return null;
    }

}
