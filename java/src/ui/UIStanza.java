
package ui;

import cache.User;
import constants.TipiStanza;
import entities.Stanza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class UIStanza extends javax.swing.JDialog {

    ArrayList<Stanza> arrayStanze = null;
    
    public UIStanza(java.awt.Frame parent, boolean modal, ArrayList<Stanza> stanze) {
        super(parent, modal);
        arrayStanze = stanze;
        initComponents();
    }
    
    // MODALITA DI VISUALIZZAZIONE
    public void modifica(Stanza input) {
        popolaCampi(input);
        this.setVisible(true);
    }
    
    public void visualizza(Stanza input) {
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attivaCampi();
            }
        };
        popolaCampi(input);
        disattivaCampi();
        jButtonConferma.setText("Modifica");
        jButtonConferma.addActionListener(listener);
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescrizione = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMq = new javax.swing.JTextField();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuova stanza");
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Numero");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Tipo");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Singola", "Doppia", "Matrimoniale", "Tripla" }));

        jLabel3.setText("Descrizione");

        jTextAreaDescrizione.setColumns(20);
        jTextAreaDescrizione.setLineWrap(true);
        jTextAreaDescrizione.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescrizione);

        jLabel4.setText("Metri quadrati");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldMq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAnnulla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonConferma)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnulla)
                    .addComponent(jButtonConferma))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed
        
        Stanza newStanza = new Stanza();
        newStanza.setNumero(jTextFieldNumero.getText());
        newStanza.setDescrizione(jTextAreaDescrizione.getText());
        newStanza.setMq(Float.parseFloat(jTextFieldMq.getText()));
        
        if(jComboBoxTipo.getSelectedIndex() == 0)
            newStanza.setTipo(TipiStanza.SINGOLA);
        if(jComboBoxTipo.getSelectedIndex() == 1)
            newStanza.setTipo(TipiStanza.DOPPIA);
        if(jComboBoxTipo.getSelectedIndex() == 2)
            newStanza.setTipo(TipiStanza.MATRIMONIALE);
        if(jComboBoxTipo.getSelectedIndex() == 3)
            newStanza.setTipo(TipiStanza.TRIPLA);
        newStanza.setNomeStruttura(User.getInstance().getUtente().getNomeStruttura());
        arrayStanze.add(newStanza);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConfermaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescrizione;
    private javax.swing.JTextField jTextFieldMq;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables
    
    private void popolaCampi(Stanza input) {
        
        jTextFieldNumero.setText(input.getNumero());
        jTextAreaDescrizione.setText(input.getDescrizione());
        
        // TIPO STANZA
        if(input.getTipo() == TipiStanza.SINGOLA)
            jComboBoxTipo.setSelectedIndex(0);
        if(input.getTipo() == TipiStanza.DOPPIA)
            jComboBoxTipo.setSelectedIndex(1);
        if(input.getTipo() == TipiStanza.MATRIMONIALE)
            jComboBoxTipo.setSelectedIndex(2);
        if(input.getTipo() == TipiStanza.TRIPLA)
            jComboBoxTipo.setSelectedIndex(3);
        
        jTextFieldMq.setText(input.getMq() + "");
    }

    private void disattivaCampi() {
        
        jTextFieldNumero.setEditable(false);
        jTextAreaDescrizione.setEditable(false);
        jComboBoxTipo.setEditable(false);
        jTextFieldMq.setEditable(false);
    }
    
    private void attivaCampi() {
        
        jTextFieldNumero.setEditable(true);
        jTextAreaDescrizione.setEditable(true);
        jComboBoxTipo.setEditable(true);
        jTextFieldMq.setEditable(true);
    }
}
