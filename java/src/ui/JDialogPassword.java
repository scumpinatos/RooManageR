
package ui;

import cache.UtenteConnesso;
import entities.AnagraficaMansione;
import interfaces.ICallback;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import web_services.AnagraficaMansioneManager;


public class JDialogPassword extends javax.swing.JDialog {

    
    public JDialogPassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        centraFinestra(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPasswordFieldVecchia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldNuova1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordFieldNuova2 = new javax.swing.JPasswordField();
        jLabelAvviso = new javax.swing.JLabel();
        jButtonConferma = new javax.swing.JButton();
        jButtonAnnulla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Vecchia password");

        jLabel2.setText("Nuova password");

        jLabel3.setText("Ripeti nuova password");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAvviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordFieldNuova2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldNuova1)
                            .addComponent(jPasswordFieldVecchia)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAnnulla, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jButtonConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordFieldVecchia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldNuova1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordFieldNuova2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelAvviso, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
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
        
        jLabelAvviso.setText("");
        if(controllaVecchiaPassword())
            controllaNuovaPassword();
    }//GEN-LAST:event_jButtonConfermaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnnulla;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAvviso;
    private javax.swing.JPasswordField jPasswordFieldNuova1;
    private javax.swing.JPasswordField jPasswordFieldNuova2;
    private javax.swing.JPasswordField jPasswordFieldVecchia;
    // End of variables declaration//GEN-END:variables
    
    private boolean controllaVecchiaPassword() {
        
        String insert = new String(jPasswordFieldVecchia.getPassword());
        if(!(UtenteConnesso.getUtente().getPassword().equals(insert))) {
            jLabelAvviso.setText("La password vecchia non è corretta");
            return false;
        } else
            return true;
    }
    
    private void controllaNuovaPassword() {
        
        ICallback<AnagraficaMansione> callback = new ICallback<AnagraficaMansione>() {
            @Override
            public void result(AnagraficaMansione obj) {
                if(obj != null) {
                    JOptionPane.showMessageDialog(null, "Cambio passwordo non riuscito");
                }
            }
        };
        
        String pass1 = new String(jPasswordFieldNuova1.getPassword());
        String pass2 = new String(jPasswordFieldNuova2.getPassword());
        
        if(!(pass1.equals(pass2))) {
            jLabelAvviso.setText("Le due password inserite non corrispondono");
        } else {
            UtenteConnesso.getUtente().setPassword(pass1);
            new AnagraficaMansioneManager().updateAnagraficaMansione(UtenteConnesso.getUtente(), callback);
            this.setVisible(false);
        }
    }
    
    private void centraFinestra(JDialog input) {
        Dimension dim_schermo = Toolkit.getDefaultToolkit().getScreenSize();
        int posX = (int) (dim_schermo.width - getWidth()) / 2;
        int posY = (int) (dim_schermo.height - getHeight()) / 2;
        input.setLocation(posX, posY);
    }

}
