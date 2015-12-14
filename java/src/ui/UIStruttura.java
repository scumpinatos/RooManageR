
package ui;

import cache.singular.UtenteConnesso;
import entities.Struttura;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import web_services.StrutturaManager;


public class UIStruttura extends javax.swing.JDialog {


    public UIStruttura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIndirizzo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaDescrizione = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jCheckBoxAgibile = new javax.swing.JCheckBox();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setText("Nome");

        jLabel7.setText("Indirizzo");

        jLabel8.setText("Descrizione");

        jTextAreaDescrizione.setColumns(20);
        jTextAreaDescrizione.setLineWrap(true);
        jTextAreaDescrizione.setRows(5);
        jScrollPane5.setViewportView(jTextAreaDescrizione);

        jLabel1.setText("Agibile");

        jButtonConferma.setText("Conferma");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5)
                                .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBoxAgibile))
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
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBoxAgibile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonConferma)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAnnulla)
                        .addContainerGap())))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextAreaDescrizione;
    private javax.swing.JTextField jTextFieldIndirizzo;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

    public void nuovo() {
        this.setTitle("Nuova struttura");
        jButtonConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new StrutturaManager().addStruttura(creaStruttura());
                setVisible(false);
            }
        });
        this.setVisible(true);
    }
    
    public void visualizza(Struttura input) {
        
        this.setTitle("Informazioni struttura");
        popolaCampi(input);
        disattivaCampi();
        jButtonConferma.setVisible(false);
        this.setVisible(true);
    }
    
    public void modifica(Struttura input) {
        
        this.setTitle("Modifica stanza");
        popolaCampi(input);
        jButtonConferma.setVisible(true);
        jButtonConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new StrutturaManager().updateStruttura(creaStruttura());
                setVisible(false);
            }
        });
        this.setVisible(true);
    }
    
    private void disattivaCampi() {
        
        jTextFieldNome.setEditable(false);
        jTextAreaDescrizione.setEditable(false);
        jTextFieldIndirizzo.setEditable(false);
        jCheckBoxAgibile.setEnabled(false);
    }
    
    private void popolaCampi(Struttura input) {
        
        jTextFieldNome.setText(input.getNome());
        jTextAreaDescrizione.setText(input.getDescrizione());
        jTextFieldIndirizzo.setText(input.getIndirizzo());
        
        if(input.getAgibile() == 1)
            jCheckBoxAgibile.setSelected(true);
    }
    
    private Struttura creaStruttura() {
        
        Struttura newStruttura = new Struttura();
        
        // INFORMAZIONI UTENTE CONNESSO
        newStruttura.setCodiceFiscaleAnagrafica(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());
        
        // INFORMAZIONI INSERITE
        newStruttura.setNome(jTextFieldNome.getText());
        newStruttura.setDescrizione(jTextAreaDescrizione.getText());
        newStruttura.setIndirizzo(jTextFieldIndirizzo.getText());
        
        if(jCheckBoxAgibile.isSelected())
            newStruttura.setAgibile(1);
        else
            newStruttura.setAgibile(0);
        
        return newStruttura;
    }
}
