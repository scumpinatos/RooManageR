package ui;

import constants.Documenti;
import entities.Anagrafica;
import entities.Nazionalita;
import interfaces.ICallback;
import interfaces.ICallbackGeneral;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import web_services.AnagraficaManager;
import web_services.NazionalitaManager;

public class UIAnagrafica extends javax.swing.JDialog {

    private static AnagraficaManager manager;
    private Boolean aggiorna, nuova;
    private ICallback callback;
    

    public UIAnagrafica(java.awt.Frame parent, Boolean modal, ICallback callback) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
        this.callback = callback;
        manager = new AnagraficaManager();
        aggiorna = false;
        nuova = false;
        caricaNazionalita();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDocumento = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodiceFiscale = new javax.swing.JTextField();
        jButtonControlla = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
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

        jButtonControlla.setText("Controlla");
        jButtonControlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControllaActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome");
        jLabel2.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cognome");
        jLabel3.setEnabled(false);

        jTextFieldCognome.setEnabled(false);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Data di nascita");
        jLabel4.setEnabled(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Indirizzo");
        jLabel5.setEnabled(false);

        jTextFieldIndirizzo.setEnabled(false);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nazionalita");
        jLabel6.setEnabled(false);

        jComboBoxNazionalita.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxNazionalita.setEnabled(false);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tipo Documento");
        jLabel7.setEnabled(false);

        buttonGroupDocumento.add(jRadioButtonCartaIdentita);
        jRadioButtonCartaIdentita.setText("Carta d'identità");
        jRadioButtonCartaIdentita.setEnabled(false);

        buttonGroupDocumento.add(jRadioButtonPatente);
        jRadioButtonPatente.setText("Patente");
        jRadioButtonPatente.setEnabled(false);

        buttonGroupDocumento.add(jRadioButtonPassaporto);
        jRadioButtonPassaporto.setText("Passaporto");
        jRadioButtonPassaporto.setEnabled(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Num Documento");
        jLabel8.setEnabled(false);

        jTextFieldNumeroDocumento.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telefono *");
        jLabel9.setEnabled(false);

        jTextFieldTelefono.setEnabled(false);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Cellulare *");
        jLabel10.setEnabled(false);

        jTextFieldCellulare.setEnabled(false);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Email *");
        jLabel11.setEnabled(false);

        jTextFieldEmail.setEnabled(false);

        jLabelNota.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabelNota.setText("Inserire ALMENO UNO dei valori contrassegnati con *");
        jLabelNota.setEnabled(false);

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jButtonConferma.setText("Conferma");
        jButtonConferma.setEnabled(false);
        jButtonConferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfermaActionPerformed(evt);
            }
        });

        jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextFieldData.setEnabled(false);

        jButtonModifica.setText("Modifica");
        jButtonModifica.setEnabled(false);
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
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonControlla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodiceFiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButtonControlla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        callback.result(null);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonControllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControllaActionPerformed
        
        ICallback<Anagrafica> callback = new ICallback<Anagrafica>() {
            
            public void result(Anagrafica obj) {
                if(obj != null) {
                    String messaggio = "Anagrafica presente in archivio.\n"
                            + "Controllare i dati inseriti.\n"
                            + "In caso di errore, cliccare su 'Modifica'";
                    JOptionPane.showMessageDialog(null, messaggio);
                    visualizza(obj);
                } else {
                    String messaggio = "Anagrafica non presente in archivio.\n"
                            + "Inserire i dati mancanti";
                    JOptionPane.showMessageDialog(null, messaggio);
                    attivaCampi();
                    nuova = true;
                }
            }
        };
        
        String cf = jTextFieldCodiceFiscale.getText();
        manager.readAnagrafica(cf, callback);
    }//GEN-LAST:event_jButtonControllaActionPerformed

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        
        aggiorna = true;
        attivaCampi();
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        
        Anagrafica anagrafica = creaAnagrafica();
        if(aggiorna)
            manager.updateAnagrafica(anagrafica, new ICallbackGeneral());
        else if(nuova)
            manager.addAnagrafica(anagrafica, new ICallbackGeneral());
        callback.result(jTextFieldCodiceFiscale.getText());
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConfermaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDocumento;
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonControlla;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCellulare;
    private javax.swing.JTextField jTextFieldCodiceFiscale;
    private javax.swing.JTextField jTextFieldCognome;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIndirizzo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumeroDocumento;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    // MODALITA NUOVA - MODIFICA
    private void attivaCampi() {

        jTextFieldCodiceFiscale.setEnabled(false);
        jTextFieldNome.setEnabled(true);
        jTextFieldCognome.setEnabled(true);
        jFormattedTextFieldData.setEnabled(true);
        jTextFieldIndirizzo.setEnabled(true);
        jComboBoxNazionalita.setEnabled(true);
        caricaNazionalita();
        jRadioButtonCartaIdentita.setEnabled(true);
        jRadioButtonPassaporto.setEnabled(true);
        jRadioButtonPatente.setSelected(true);
        jTextFieldNumeroDocumento.setEnabled(true);
        jTextFieldTelefono.setEnabled(true);
        jTextFieldCellulare.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jButtonConferma.setEnabled(true);

    }
    
    // MODALITA VISUALIZZA
    private void visualizza(Anagrafica input) {

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

        String[] items = new String[1];
        items[0] = input.getNazionalita();
        jComboBoxNazionalita.setModel(new DefaultComboBoxModel(items));
        jComboBoxNazionalita.setEnabled(false);

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
        jButtonModifica.setEnabled(true);
        jButtonConferma.setEnabled(true);
        
    }

    // METODI DI SUPPORTO
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

        ICallback<ArrayList<Nazionalita>> callback = new ICallback<ArrayList<Nazionalita>>() {
            
            public void result(ArrayList<Nazionalita> obj) {

                int nNaz = obj.size();
                String[] items = new String[nNaz];
                
                for(int i=0; i < nNaz; i++) 
                    items[i] = obj.get(i).getAbbreviazione();
                
                jComboBoxNazionalita.setModel(new DefaultComboBoxModel(items));
            }
        };

        new NazionalitaManager().readAllNazionalita(callback);
    }
}
