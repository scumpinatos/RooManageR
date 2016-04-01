package ui;

import utils.UtenteConnesso;
import javax.swing.JDialog;
import web_services.StrutturaManager;

public class UIHome extends javax.swing.JFrame {

    private static StrutturaManager strutturaManager;
    private Boolean mode;
    
    public UIHome() {
        initComponents();
        this.setLocationRelativeTo(null);
        strutturaManager = new StrutturaManager();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPassword = new javax.swing.JMenuItem();
        jMenuItemProfilo = new javax.swing.JMenuItem();
        jMenuItemReg = new javax.swing.JMenuItem();
        jMenuItemEsci = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(680, 500));
        setResizable(false);

        jTabbedPane.setPreferredSize(new java.awt.Dimension(640, 480));

        jMenu1.setText("Menu'");

        jMenuItemPassword.setText("Cambia password");
        jMenuItemPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPasswordActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPassword);

        jMenuItemProfilo.setText("Visualizza profilo");
        jMenuItemProfilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfiloActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemProfilo);

        jMenuItemReg.setText("Registro movimenti");
        jMenuItemReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemReg);

        jMenuItemEsci.setText("Esci");
        jMenuItemEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEsciActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEsci);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("Gestiscti struttura");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPasswordActionPerformed
        new JDialogPassword(null, true).setVisible(true);
    }//GEN-LAST:event_jMenuItemPasswordActionPerformed

    private void jMenuItemProfiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfiloActionPerformed
        JDialogAnagrafica view = new JDialogAnagrafica(null, true, null);
        view.modalitaProfilo(UtenteConnesso.getInfoUtente());
        view.setVisible(true);
    }//GEN-LAST:event_jMenuItemProfiloActionPerformed

    private void jMenuItemEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEsciActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemEsciActionPerformed

    private void jMenuItemRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegActionPerformed
        new JDialogRegistroMovimenti(null, true, mode).setVisible(true);
    }//GEN-LAST:event_jMenuItemRegActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEsci;
    private javax.swing.JMenuItem jMenuItemPassword;
    private javax.swing.JMenuItem jMenuItemProfilo;
    private javax.swing.JMenuItem jMenuItemReg;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables

    
    public void modalitaPortinaio() {
        
        String cf = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        String struttura = UtenteConnesso.getUtente().getNomeStruttura();
        this.setTitle(cf + " - " + struttura);
        
        jTabbedPane.add(new JPanelPanoramica(strutturaManager, false));
        jTabbedPane.add(new JPanelAnagStanza(strutturaManager, false));
        jTabbedPane.add(new JPanelRegistroOperazioni());
        this.setVisible(true);
        mode = false;
    }
    
    public void modalitaProprietario() {
    
        String cf = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        this.setTitle(cf + " - PROPRIETARIO");
        
        jTabbedPane.add(new JPanelPanoramica(strutturaManager, true));
        jTabbedPane.add(new JPanelAnagStanza(strutturaManager, true));
        jTabbedPane.add(new JPanelStruttura(strutturaManager));
        jTabbedPane.add(new JPanelRegistroOperazioni());
        this.setVisible(true);
        mode = true;
    }

}
