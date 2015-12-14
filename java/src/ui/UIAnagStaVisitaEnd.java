
package ui;

import cache.lists.ListaStanza;
import entities.AnagraficaStanza;
import entities.Visita;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import web_services.AnagraficaStanzaManager;
import web_services.StanzaManager;
import web_services.VisitaManager;


public class UIAnagStaVisitaEnd extends javax.swing.JDialog {

    private int numeroStanza;
    
    public UIAnagStaVisitaEnd(java.awt.Frame parent, boolean modal, int numStanza) {
        super(parent, modal);
        initComponents();
        numeroStanza = numStanza;
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroStanza = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIngresso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUscita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCosto = new javax.swing.JTextField();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Stanza");

        jLabel2.setText("Data ed ora ingresso");

        jLabel3.setText("Codice fiscale");

        jLabel4.setText("Data ed ora uscita");

        jLabel5.setText("Costo");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumeroStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldCf)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldIngresso)
                                    .addComponent(jTextFieldUscita, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
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
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNumeroStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUscita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldCf;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldIngresso;
    private javax.swing.JTextField jTextFieldNumeroStanza;
    private javax.swing.JTextField jTextFieldUscita;
    // End of variables declaration//GEN-END:variables


    public void popolaAnagraficaStanza(AnagraficaStanza input) {
        
        jTextFieldNumeroStanza.setText(input.getNumeroStanza());
        jTextFieldNumeroStanza.setEditable(false);
        jTextFieldCf.setText(input.getCodiceFiscaleAnagrafica());
        jTextFieldCf.setEditable(false);
        jTextFieldIngresso.setText(input.getIngresso());
        jTextFieldIngresso.setEditable(false);
        dataOraAttuale();
        
        jButtonConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                input.setUscita(jTextFieldUscita.getText());
                input.setCosto(Float.parseFloat(jTextFieldCosto.getText()));
                new AnagraficaStanzaManager().updateAnagraficaStanza(input);
                aggiornaStanze();
                setVisible(false);
            }
        });
    }
    
    public void popolaVisita(Visita input) {
        
        jTextFieldNumeroStanza.setText(input.getNumeroStanza());
        jTextFieldNumeroStanza.setEditable(false);
        jTextFieldCf.setText(input.getCodiceFiscaleAnagrafica());
        jTextFieldCf.setEditable(false);
        jTextFieldIngresso.setText(input.getIngresso());
        jTextFieldIngresso.setEditable(false);
        dataOraAttuale();
        jTextFieldCosto.setEnabled(false);
        
        jButtonConferma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                input.setUscita(jTextFieldUscita.getText());
                new VisitaManager().updateVisita(input);
                setVisible(false);
            }
        });
    }
    
    private void dataOraAttuale() {

        jTextFieldUscita.setText(new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()));
        jTextFieldUscita.setEditable(false);
    }
    
    private void aggiornaStanze() {
        
        ListaStanza.getIstanza().get(numeroStanza).setLibera(1);
        new StanzaManager().updateStanza(ListaStanza.getIstanza().get(numeroStanza));
    }
}
