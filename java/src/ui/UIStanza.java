
package ui;

import cache.singular.UtenteConnesso;
import constants.TipiStanza;
import entities.Stanza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import web_services.StanzaManager;


public class UIStanza extends javax.swing.JDialog {

    private String struttura;
    
    public UIStanza(java.awt.Frame parent, boolean modal, String nomeStruttura) {
        super(parent, modal);
        struttura = nomeStruttura;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButtonAnnulla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxAgibile = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel13.setText("Numero");

        jLabel14.setText("Tipo");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Singola", "Doppia", "Matrimoniale", "Tripla" }));

        jLabel12.setText("Descrizione");

        jTextAreaDescrizione.setColumns(20);
        jTextAreaDescrizione.setLineWrap(true);
        jTextAreaDescrizione.setRows(5);
        jScrollPane6.setViewportView(jTextAreaDescrizione);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Mq");

        jButtonConferma.setText("Conferma");

        jButtonAnnulla.setText("Annulla");
        jButtonAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnullaActionPerformed(evt);
            }
        });

        jLabel1.setText("Agibile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldMq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxAgibile)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAnnulla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConferma)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBoxAgibile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JCheckBox jCheckBoxAgibile;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaDescrizione;
    private javax.swing.JTextField jTextFieldMq;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

    public void nuovo() {
        this.setTitle("Nuova stanza");
        jButtonConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new StanzaManager().addStanza(creaStanza());
                setVisible(false);
            }
        });
        this.setVisible(true);
    }
    
    public void visualizza(Stanza input) {
        
        this.setTitle("Informazioni stanza");
        popolaCampi(input);
        disattivaCampi();
        jButtonConferma.setVisible(false);
        this.setVisible(true);
    }
    
    public void modifica(Stanza input) {
        
        this.setTitle("Modifica stanza");
        popolaCampi(input);
        jTextFieldNumero.setEditable(false);
        jButtonConferma.setVisible(true);
        jButtonConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new StanzaManager().updateStanza(creaStanza());
                setVisible(false);
            }
        });
        this.setVisible(true);
    }
    
    private void disattivaCampi() {
        
        jTextFieldNumero.setEditable(false);
        jTextAreaDescrizione.setEditable(false);
        jTextFieldMq.setEditable(false);
        jComboBoxTipo.setEnabled(false);
        jCheckBoxAgibile.setEnabled(false);
    }
    
    private void popolaCampi(Stanza input) {
        
        jTextFieldNumero.setText(input.getNumero());
        jTextAreaDescrizione.setText(input.getDescrizione());
        jTextFieldMq.setText(input.getMq()+"");
        
        switch(input.getTipo()) {
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
        
        if(input.getAgibile() == 1)
            jCheckBoxAgibile.setSelected(true);
    }
    
    private Stanza creaStanza() {
        Stanza newStanza = new Stanza();
        
        // INFORMAZIONI UTENTE CONNESSO
        newStanza.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());
        newStanza.setNomeStruttura(struttura);
        
        // INFORMAZIONI INSERITE
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

        if(jCheckBoxAgibile.isSelected())
            newStanza.setAgibile(1);
        else
            newStanza.setAgibile(0);
        
        return newStanza;
    }
}
