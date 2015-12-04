package ui;

import cache.ListaStanze;
import cache.User;
import constants.TipiStanza;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.StrutturaManager;

public class UIHomePortinaio extends javax.swing.JFrame {

    private String selectedStanza;

    public UIHomePortinaio() {
        initComponents();
        this.setLocationRelativeTo(null);
        popolaTabella();
        
        // INFORMAZIONI DA VISUALIZZARE
        User utente = User.getInstance();
        new StrutturaManager().readStruttura(utente.getUtente().getIdStruttura());
        jLabelUtente.setText("Utente connesso: " + utente.getInfoUtente().getNome() + " " + utente.getInfoUtente().getCognome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabelStruttura = new javax.swing.JLabel();
        jLabelUtente = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStanze = new javax.swing.JTable();
        jPanelInfoStanza = new javax.swing.JPanel();
        jPanelOperazioniStanza = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanelRegistroClienti = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableRegClienti = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAggiorna = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCredits = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RooManageR");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        jLabelStruttura.setText("jLabelStruttura");

        jLabelUtente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelUtente.setText("jLabelUtente");
        jLabelUtente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelUtente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelUtenteMousePressed(evt);
            }
        });

        jTableStanze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableStanze.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableStanze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStanzeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableStanze);

        jPanelInfoStanza.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout jPanelInfoStanzaLayout = new javax.swing.GroupLayout(jPanelInfoStanza);
        jPanelInfoStanza.setLayout(jPanelInfoStanzaLayout);
        jPanelInfoStanzaLayout.setHorizontalGroup(
            jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanelInfoStanzaLayout.setVerticalGroup(
            jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 209, Short.MAX_VALUE)
        );

        jButton2.setText("Permanenza");

        jButton1.setText("Visita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Struttura");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperazioniStanzaLayout = new javax.swing.GroupLayout(jPanelOperazioniStanza);
        jPanelOperazioniStanza.setLayout(jPanelOperazioniStanzaLayout);
        jPanelOperazioniStanzaLayout.setHorizontalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOperazioniStanzaLayout.setVerticalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jPanelInfoStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelStruttura)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUtente)
                    .addComponent(jLabelStruttura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelInfoStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Home", jPanelHome);

        jScrollPane1.setViewportView(jTableRegClienti);

        javax.swing.GroupLayout jPanelRegistroClientiLayout = new javax.swing.GroupLayout(jPanelRegistroClienti);
        jPanelRegistroClienti.setLayout(jPanelRegistroClientiLayout);
        jPanelRegistroClientiLayout.setHorizontalGroup(
            jPanelRegistroClientiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        jPanelRegistroClientiLayout.setVerticalGroup(
            jPanelRegistroClientiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroClientiLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 90, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registro Clienti", jPanelRegistroClienti);

        jMenu1.setText("File");

        jMenuItemAggiorna.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAggiorna.setText("Aggiorna");
        jMenu1.add(jMenuItemAggiorna);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Esci");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("?");

        jMenuItemCredits.setText("Credits");
        jMenuItemCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreditsActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemCredits);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreditsActionPerformed

        new UICredits(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItemCreditsActionPerformed

    private void jLabelUtenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUtenteMousePressed

        new UIAnagrafica(this, true).visualizza(User.getInstance().getInfoUtente());
    }//GEN-LAST:event_jLabelUtenteMousePressed

    private void jTableStanzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStanzeMouseClicked

        int selected = ((JTable) evt.getSource()).getSelectedRow();
        selectedStanza = ListaStanze.getInstance().get(selected).getNumero();

    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(selectedStanza == null) {
            JOptionPane.showMessageDialog(rootPane, "Selezionare una stanza dall'elenco");
            return;
        }
        new UIVisita(this, true, selectedStanza).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        new UIStruttura(this, true).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabelStruttura;
    private javax.swing.JLabel jLabelUtente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAggiorna;
    private javax.swing.JMenuItem jMenuItemCredits;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelInfoStanza;
    private javax.swing.JPanel jPanelOperazioniStanza;
    private javax.swing.JPanel jPanelRegistroClienti;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableRegClienti;
    private javax.swing.JTable jTableStanze;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void popolaTabella() {

        StrutturaManager manager = new StrutturaManager();
        manager.getStanzeByStruttura(User.getInstance().getUtente().getIdStruttura());

        ListaStanze stanze = ListaStanze.getInstance();
        int nst = stanze.size();
        
        // COLONNE
        String[] colonne = new String[5];
        colonne[0] = "Numero";
        colonne[1] = "Tipo";
        colonne[2] = "Mq";
        colonne[3] = "Agibile";
        colonne[4] = "Libera";

        // DATI
        Object[][] data = new Object[nst][5];

        for (int i = 0; i < nst; i++) {
            data[i][0] = stanze.get(i).getNumero();
            data[i][1] = getStringTipo(stanze.get(i).getTipo());
            data[i][2] = stanze.get(i).getMq();
            data[i][3] = stanze.get(i).getAgibile();
            data[i][4] = stanze.get(i).getLibera();
        }

        TableModel model = new DefaultTableModel(data, colonne);
        jTableStanze.setModel(model);
    }

    private String getStringTipo(int input) {

        switch (input) {
            case TipiStanza.SINGOLA:
                return "Singola";
            case TipiStanza.DOPPIA:
                return "Doppia";
            case TipiStanza.MATRIMONIALE:
                return "Matrimoniale";
            case TipiStanza.TRIPLA:
                return "Tripla";
        }

        return null;
    }
    
    private void popolaRegistroClienti() {

        // OPERAZIONI RECUPERO INFORMAZIONI
        
        // COLONNE
        String[] colonne = new String[4];
        colonne[0] = "Nome";
        colonne[1] = "Cognome";
        colonne[2] = "Data di nascita";
        colonne[3] = "Indirizzo";

        // DATI

        TableModel model = new DefaultTableModel(colonne, 0);
        jTableRegClienti.setModel(model);
    }
}
