package ui;

import cache.AnagraficaTemp;
import cache.ListaNazionalita;
import cache.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Documenti;
import entities.Anagrafica;
import entities.Visita;
import interfaces.ICallback;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import web_services.AnagraficaManager;
import web_services.NazionalitaManager;

public class UIVisita extends JDialog {

    Frame parent = null;
    Boolean found = null;
    
    public UIVisita(Frame frame, boolean bln, String numStanza) {
        super(frame, bln);
        initComponents();
        parent = frame;
        
        // SETTAGGI INIZIALI
        dataOraAttuale();
        caricaNazionalita();
        jTextFieldStanza.setText(numStanza);
        jTextFieldStanza.setEditable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodiceFiscale = new javax.swing.JTextField();
        jButtonControlla = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelInfo = new javax.swing.JPanel();
        jTextFieldCellulare = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
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
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelNota = new javax.swing.JLabel();
        jButtonAnnulla = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldStanza = new javax.swing.JTextField();
        jTextFieldIngresso = new javax.swing.JTextField();

        setTitle("Nuova visita");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inserisci il codice fiscale");

        jTextFieldCodiceFiscale.setVerifyInputWhenFocusTarget(false);

        jButtonControlla.setText("Controlla");
        jButtonControlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControllaActionPerformed(evt);
            }
        });

        jTextFieldCellulare.setEnabled(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome");

        jTextFieldNome.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cognome");

        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextFieldData.setEnabled(false);

        jTextFieldCognome.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data di nascita");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Indirizzo");

        jTextFieldIndirizzo.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nazionalita");

        jComboBoxNazionalita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNazionalita.setEnabled(false);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo Documento");

        buttonGroup1.add(jRadioButtonCartaIdentita);
        jRadioButtonCartaIdentita.setText("Carta d'identità");
        jRadioButtonCartaIdentita.setEnabled(false);

        buttonGroup1.add(jRadioButtonPatente);
        jRadioButtonPatente.setText("Patente");
        jRadioButtonPatente.setEnabled(false);

        buttonGroup1.add(jRadioButtonPassaporto);
        jRadioButtonPassaporto.setText("Passaporto");
        jRadioButtonPassaporto.setEnabled(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Numero Documento");

        jTextFieldNumeroDocumento.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telefono *");

        jTextFieldTelefono.setEnabled(false);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cellulare *");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Email *");

        jTextFieldEmail.setEnabled(false);

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome))
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCognome)))
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxNazionalita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelInfoLayout.createSequentialGroup()
                                    .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldCellulare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldEmail)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInfoLayout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButtonPatente)
                        .addComponent(jRadioButtonCartaIdentita)
                        .addComponent(jRadioButtonPassaporto))
                    .addContainerGap(131, Short.MAX_VALUE)))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(8, 8, 8)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxNazionalita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCellulare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabelNota))
            .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInfoLayout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jRadioButtonCartaIdentita)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jRadioButtonPatente)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jRadioButtonPassaporto)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

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

        jLabel12.setText("Stanza selezionata ");

        jLabel13.setText("Data e ora ingresso ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(jButtonControlla, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonControlla)
                    .addComponent(jTextFieldCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonConferma))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonControllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControllaActionPerformed
        
        if(new AnagraficaManager().search(jTextFieldCodiceFiscale.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Codice fiscale presente in archivio.\nLe informazioni verranno inserite automaticamente");
            popolaCampi(AnagraficaTemp.getInstance().getAnagraficaTemp());
            found = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Codice fiscale non presente in archivio.\nInserire manualmente le informazioni");
            attivaCampi();
            found = false;
        }
        
    }//GEN-LAST:event_jButtonControllaActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        
        if(found) {
            try {
                Visita newVisita = new Visita();
                newVisita.setCodicefiscaleanagrafica(AnagraficaTemp.getInstance().getAnagraficaTemp().getCodiceFiscale());
                newVisita.setIdstruttura(User.getInstance().getUtente().getIdStruttura());
                newVisita.setNumerostanza(jTextFieldStanza.getText());
                newVisita.setIngresso(jTextFieldIngresso.getText());
                new ObjectMapper().writeValue(System.out, newVisita);
            } catch (IOException ex) {
            }
        } else if(!found) {
            Anagrafica newAnagrafica = new Anagrafica();
            newAnagrafica.setCodiceFiscale(jTextFieldCodiceFiscale.getText());
            newAnagrafica.setNome(jTextFieldNome.getText());
            newAnagrafica.setCognome(jTextFieldCognome.getText());
            newAnagrafica.setDataNascita(jFormattedTextFieldData.getText());
            newAnagrafica.setIndirizzo(jTextFieldIndirizzo.getText());
            newAnagrafica.setNazionalita((String) jComboBoxNazionalita.getSelectedItem());
            
            // TIPO DOCUMENTO
            if(jRadioButtonCartaIdentita.isSelected())
                newAnagrafica.setTipoDocumento(Documenti.CARTA_IDENTITA);
            if(jRadioButtonPatente.isSelected())
                newAnagrafica.setTipoDocumento(Documenti.PATENTE);
            if(jRadioButtonPassaporto.isSelected())
                newAnagrafica.setTipoDocumento(Documenti.PASSAPORTO);
                
            newAnagrafica.setNumeroDocumento(jTextFieldNumeroDocumento.getText());
            newAnagrafica.setTelefono(jTextFieldTelefono.getText());
            newAnagrafica.setCellulare(jTextFieldCellulare.getText());
            newAnagrafica.setEmail(jTextFieldEmail.getText());
        }
    }//GEN-LAST:event_jButtonConfermaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonControlla;
    private javax.swing.JComboBox jComboBoxNazionalita;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNota;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JRadioButton jRadioButtonCartaIdentita;
    private javax.swing.JRadioButton jRadioButtonPassaporto;
    private javax.swing.JRadioButton jRadioButtonPatente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCellulare;
    private javax.swing.JTextField jTextFieldCodiceFiscale;
    private javax.swing.JTextField jTextFieldCognome;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIndirizzo;
    private javax.swing.JTextField jTextFieldIngresso;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumeroDocumento;
    private javax.swing.JTextField jTextFieldStanza;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void popolaCampi(Anagrafica input) {

        jTextFieldNome.setText(input.getNome());
        jTextFieldNome.setEditable(false);
        jTextFieldCognome.setText(input.getCognome());
        jTextFieldCognome.setEditable(false);
        jFormattedTextFieldData.setText(new SimpleDateFormat().format(new GregorianCalendar().getTime()));
        jFormattedTextFieldData.setEditable(false);
        jTextFieldIndirizzo.setText(input.getIndirizzo());
        jTextFieldIndirizzo.setEditable(false);
        
        // NAZIONALITA
        String[] items = new String[1];
        items[0] = input.getNazionalita();
        jComboBoxNazionalita.setModel(new DefaultComboBoxModel(items));
        jComboBoxNazionalita.setEnabled(false);
        
        // TIPO DOCUMENTO
        switch(input.getTipoDocumento()) {
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
        
    }
    
    private void attivaCampi() {

        jTextFieldNome.setEnabled(true);
        jTextFieldCognome.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        jTextFieldIndirizzo.setEnabled(true);
        jComboBoxNazionalita.setEnabled(true);
        jTextFieldNumeroDocumento.setEnabled(true);
        jTextFieldTelefono.setEnabled(true);
        jTextFieldCellulare.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jLabelNota.setText("Inserire almeno UNO dei campi indicati con *");
        
    }
    
    private void dataOraAttuale() {
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY - hh:mm");
        jTextFieldIngresso.setText(format.format(new GregorianCalendar().getTime()));
        jTextFieldIngresso.setEditable(false);
    }

    private void caricaNazionalita() {
        
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                
                if(e.getItem().equals("Altro..")) {
                    //new UINazionalita(parent, true).setVisible(true);
                }
            }
        };
        
        ICallback callback = new ICallback<ListaNazionalita>() {
            @Override
            public void onResult(ListaNazionalita obj) {
                
                String[] items = new String[obj.size()+1];
                
                int i = 0;
                
                for(;i<obj.size();i++) {
                    items[i] = obj.get(i).getAbbreviazione();
                }
                items[i] = "Altro..";
                
                jComboBoxNazionalita.setModel(new DefaultComboBoxModel(items));
                
            }
        };
        
        new NazionalitaManager().getNazionalita(callback);
        
        jComboBoxNazionalita.addItemListener(listener);      
    }
}
