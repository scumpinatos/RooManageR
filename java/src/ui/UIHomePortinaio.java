package ui;

import cache.ListaStanze;
import cache.User;
import constants.TipiStanza;
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
        User utente = User.getInstance();
        jLabelSaluto.setText("Utente connesso: " + utente.getInfoUtente().getNome() + " " + utente.getInfoUtente().getCognome());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jPanelInfoStanza = new javax.swing.JPanel();
        jPanelOperazioniStanza = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabelSaluto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        javax.swing.GroupLayout jPanelOperazioniStanzaLayout = new javax.swing.GroupLayout(jPanelOperazioniStanza);
        jPanelOperazioniStanza.setLayout(jPanelOperazioniStanzaLayout);
        jPanelOperazioniStanzaLayout.setHorizontalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelOperazioniStanzaLayout.setVerticalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jLabelSaluto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSaluto.setText("jLabel2");
        jLabelSaluto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSaluto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelSalutoMousePressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

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
                    .addComponent(jLabelSaluto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSaluto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelInfoStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Home", jPanelHome);

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

    private void jLabelSalutoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalutoMousePressed

        new UIAnagrafica(this, true).visualizza(User.getInstance().getInfoUtente());
    }//GEN-LAST:event_jLabelSalutoMousePressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int selected = ((JTable) evt.getSource()).getSelectedRow();
        selectedStanza = ListaStanze.getInstance().get(selected).getNumero();

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new UIVisita(this, true, selectedStanza).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelSaluto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAggiorna;
    private javax.swing.JMenuItem jMenuItemCredits;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelInfoStanza;
    private javax.swing.JPanel jPanelOperazioniStanza;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
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
        jTable1.setModel(model);
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
}
