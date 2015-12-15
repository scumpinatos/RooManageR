package ui;

import constants.Documenti;
import entities.Anagrafica;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import web_services.AnagraficaManager;

public class UIAnagrafica extends javax.swing.JDialog {

    private boolean update;

    public UIAnagrafica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        update = false;
        initComponents();
        jButtonModifica.setVisible(false);
        caricaNazionalita();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDocumento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodiceFiscale = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCognome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIndirizzo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxNazionalita = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonCartaIdentita = new javax.swing.JRadioButton();
        jRadioButtonPatente = new javax.swing.JRadioButton();
        jRadioButtonPassaporto = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNumeroDocumento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCellulare = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelNota = new javax.swing.JLabel();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        jButtonModifica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Codice Fiscale");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cognome");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data di nascita");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Indirizzo");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nazionalita");

        jComboBoxNazionalita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo Documento");

        buttonGroupDocumento.add(jRadioButtonCartaIdentita);
        jRadioButtonCartaIdentita.setText("Carta d'identità");

        buttonGroupDocumento.add(jRadioButtonPatente);
        jRadioButtonPatente.setText("Patente");

        buttonGroupDocumento.add(jRadioButtonPassaporto);
        jRadioButtonPassaporto.setText("Passaporto");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Num Documento");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telefono *");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cellulare *");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Email *");

        jLabelNota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelNota.setText("Inserire ALMENO UNO dei valori contrassegnati con *");

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonConferma.setText("Conferma");
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jButtonModifica.setText("Modifica");
        jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAnnulla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonModifica)
                                .addGap(53, 53, 53)
                                .addComponent(jButtonConferma))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxNazionalita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jFormattedTextFieldData))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonPatente)
                                            .addComponent(jRadioButtonCartaIdentita)
                                            .addComponent(jRadioButtonPassaporto))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxNazionalita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonCartaIdentita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonPatente)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonPassaporto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonModifica))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed

        if (update) {
            new AnagraficaManager().updateAnagrafica(creaAnagrafica());
        } else {
            new AnagraficaManager().addAnagrafica(creaAnagrafica());
        }
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed

        JOptionPane.showMessageDialog(null, "Modalità modifica attiva.\nIl codice fiscale non può essere modificato.");
        update = true;
        attivaCampi();
        jButtonModifica.setVisible(false);
        caricaNazionalita();
    }//GEN-LAST:event_jButtonModificaActionPerformed

    // MODALITA' D'APERTURA
    public void visualizza(Anagrafica input) {
        popolaCampi(input);
        jButtonConferma.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDocumento;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JComboBox jComboBoxNazionalita;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNota;
    private javax.swing.JRadioButton jRadioButtonCartaIdentita;
    private javax.swing.JRadioButton jRadioButtonPassaporto;
    private javax.swing.JRadioButton jRadioButtonPatente;
    private javax.swing.JTextField jTextFieldCellulare;
    private javax.swing.JTextField jTextFieldCodiceFiscale;
    private javax.swing.JTextField jTextFieldCognome;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIndirizzo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumeroDocumento;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void popolaCampi(Anagrafica input) {

        jTextFieldCodiceFiscale.setText(input.getCodiceFiscale());
        jTextFieldCodiceFiscale.setEditable(false);
        jTextFieldNome.setText(input.getNome());
        jTextFieldNome.setEditable(false);
        jTextFieldCognome.setText(input.getCognome());
        jTextFieldCognome.setEditable(false);
        jFormattedTextFieldData.setText("NON IMPLEMENTATA");
        jFormattedTextFieldData.setEditable(false);
        jTextFieldIndirizzo.setText(input.getIndirizzo());
        jTextFieldIndirizzo.setEditable(false);

        // NAZIONALITA
        String[] items = new String[1];
        items[0] = input.getNazionalita();
        jComboBoxNazionalita.setModel(new DefaultComboBoxModel(items));
        jComboBoxNazionalita.setEnabled(false);

        // TIPO DOCUMENTO
        switch (input.getTipoDocumento()) {
            case Documenti.CARTA_IDENTITA:
                jRadioButtonCartaIdentita.setSelected(true);
                jRadioButtonPassaporto.setEnabled(false);
                jRadioButtonPatente.setEnabled(false);
                break;
            case Documenti.PATENTE:
                jRadioButtonCartaIdentita.setEnabled(false);
                jRadioButtonPassaporto.setEnabled(false);
                jRadioButtonPatente.setSelected(true);
                break;
            case Documenti.PASSAPORTO:
                jRadioButtonCartaIdentita.setEnabled(false);
                jRadioButtonPassaporto.setSelected(true);
                jRadioButtonPatente.setEnabled(false);
                break;
        }
        jTextFieldNumeroDocumento.setText(input.getNumeroDocumento());
        jTextFieldNumeroDocumento.setEditable(false);
        jTextFieldTelefono.setText(input.getTelefono());
        jTextFieldTelefono.setEditable(false);
        jTextFieldCellulare.setText(input.getCellulare());
        jTextFieldCellulare.setEditable(false);
        jTextFieldEmail.setText(input.getEmail());
        jTextFieldEmail.setEditable(false);

        jLabelNota.setText("* Campi NON obbligatori");
    }

    private void attivaCampi() {

        jTextFieldCodiceFiscale.setEnabled(false);
        jTextFieldNome.setEditable(true);
        jTextFieldCognome.setEditable(true);
        jFormattedTextFieldData.setEditable(true);
        jTextFieldIndirizzo.setEditable(true);
        jComboBoxNazionalita.setEnabled(true);
        caricaNazionalita();
        jTextFieldNumeroDocumento.setEditable(true);
        jTextFieldTelefono.setEditable(true);
        jTextFieldCellulare.setEditable(true);
        jTextFieldEmail.setEditable(true);
        jButtonConferma.setVisible(true);

    }

    private Anagrafica creaAnagrafica() {

        Anagrafica newAnagrafica = new Anagrafica();

        newAnagrafica.setCodiceFiscale(jTextFieldCodiceFiscale.getText());
        newAnagrafica.setNome(jTextFieldNome.getText());
        newAnagrafica.setCognome(jTextFieldCognome.getText());
        newAnagrafica.setDataNascita(jFormattedTextFieldData.getText());
        newAnagrafica.setIndirizzo(jTextFieldIndirizzo.getText());
        newAnagrafica.setNazionalita((String) jComboBoxNazionalita.getSelectedItem());

        if (jRadioButtonCartaIdentita.isSelected()) {
            newAnagrafica.setTipoDocumento(Documenti.CARTA_IDENTITA);
        }
        if (jRadioButtonPatente.isSelected()) {
            newAnagrafica.setTipoDocumento(Documenti.PATENTE);
        }
        if (jRadioButtonPassaporto.isSelected()) {
            newAnagrafica.setTipoDocumento(Documenti.PASSAPORTO);
        }

        newAnagrafica.setNumeroDocumento(jTextFieldNumeroDocumento.getText());
        newAnagrafica.setTelefono(jTextFieldTelefono.getText());
        newAnagrafica.setCellulare(jTextFieldCellulare.getText());
        newAnagrafica.setEmail(jTextFieldEmail.getText());

        return newAnagrafica;
    }

    private void caricaNazionalita() {

    }
}
