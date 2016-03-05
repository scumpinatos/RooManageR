package ui;

import cache.singular.UtenteConnesso;
import web_services.StrutturaManager;

public class UIHome extends javax.swing.JFrame {

    private static StrutturaManager strutturaManager;
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jTabbedPane.setPreferredSize(new java.awt.Dimension(640, 480));

        jMenu1.setText("File");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane;
    // End of variables declaration//GEN-END:variables

    
    public void modalitaPortinaio() {
        
        String cf = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        this.setTitle(cf + " - PORTINAIO");
        
        jTabbedPane.add(new JPanelSituazioneAttuale(strutturaManager, false));
        jTabbedPane.add(new JPanelAnagStanza(strutturaManager, false));
        jTabbedPane.add(new JPanelRegistroOperazioni());
        this.setVisible(true);
    }
    
    public void modalitaProprietario() {
    
        String cf = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        this.setTitle(cf + " - PROPRIETARIO");
        
        jTabbedPane.add(new JPanelSituazioneAttuale(strutturaManager, true));
        jTabbedPane.add(new JPanelAnagStanza(strutturaManager, true));
        jTabbedPane.add(new JPanelStruttura(strutturaManager));
        jTabbedPane.add(new JPanelRegistroOperazioni());
        this.setVisible(true);
    }
    
    public void modalitaDirettore() {
        String cf = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        this.setTitle(cf + " - DIRETTORE");
    }
}
