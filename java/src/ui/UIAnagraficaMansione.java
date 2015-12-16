package ui;

import cache.singular.UtenteConnesso;
import entities.AnagraficaMansione;
import interfaces.ICallback;
import javax.swing.JOptionPane;
import web_services.AnagraficaManager;
import web_services.AnagraficaMansioneManager;

public class UIAnagraficaMansione extends javax.swing.JDialog {

    private int tipo;
    private String nomeStruttura;

    public UIAnagraficaMansione(java.awt.Frame parent, boolean modal, int tipoMansione, String struttura) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        tipo = tipoMansione;
        nomeStruttura = struttura;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldCf = new javax.swing.JTextField();
        jButtonControlla = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPass1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldPass2 = new javax.swing.JPasswordField();
        jLabelAvviso = new javax.swing.JLabel();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Codice fiscale");

        jButtonControlla.setText("Controlla");
        jButtonControlla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonControllaActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jPasswordFieldPass1.setEnabled(false);

        jLabel3.setText("Ripeti password");

        jPasswordFieldPass2.setEnabled(false);

        jLabelAvviso.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabelAvviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAvviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAnnulla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordFieldPass2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCf)
                                    .addComponent(jPasswordFieldPass1))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonControlla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 180, Short.MAX_VALUE)
                                .addComponent(jButtonConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonControlla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addComponent(jLabelAvviso, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonConferma)
                    .addComponent(jButtonAnnulla))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonControllaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonControllaActionPerformed

        new AnagraficaManager().readAnagrafica(jTextFieldCf.getText(), new ICallback<Boolean>() {
            @Override
            public void result(Boolean obj) {
                if (obj) {
                    JOptionPane.showMessageDialog(rootPane, "Codice fiscale presente in archivio.");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Codice fiscale non presente in archivio.\n"
                            + "Inserire manualmente la nuova anagrafica");
                    new UIAnagrafica(null, true).setVisible(true);
                }
            }
        });

        jPasswordFieldPass1.setEnabled(true);
        jPasswordFieldPass2.setEnabled(true);
    }//GEN-LAST:event_jButtonControllaActionPerformed

    private void jButtonAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnullaActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_jButtonAnnullaActionPerformed

    private void jButtonConfermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfermaActionPerformed

        creaAnagraficaMansione();
    }//GEN-LAST:event_jButtonConfermaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonControlla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAvviso;
    private javax.swing.JPasswordField jPasswordFieldPass1;
    private javax.swing.JPasswordField jPasswordFieldPass2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCf;
    // End of variables declaration//GEN-END:variables

    private void creaAnagraficaMansione() {

        AnagraficaMansione newAnagraficaMansione = new AnagraficaMansione();

        newAnagraficaMansione.setCodiceFiscaleAnagrafica(jTextFieldCf.getText());
        newAnagraficaMansione.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());
        newAnagraficaMansione.setNomeStruttura(nomeStruttura);
        newAnagraficaMansione.setTipoMansione(tipo);
        if (controllaNuovaPassword()) {
            String pass = new String(jPasswordFieldPass1.getPassword());
            newAnagraficaMansione.setPassword(pass);
            new AnagraficaMansioneManager().addAnagraficaMansione(newAnagraficaMansione);
            this.setVisible(false);
        }
    }

    private boolean controllaNuovaPassword() {

        String pass1 = new String(jPasswordFieldPass1.getPassword());
        String pass2 = new String(jPasswordFieldPass2.getPassword());

        if (!(pass1.equals(pass2))) {
            jLabelAvviso.setText("Le due password inserite non corrispondono");
            return false;
        } else {
            return true;
        }
    }
}
