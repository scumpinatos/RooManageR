package ui;

import cache.AnagraficaStanzaTemp;
import cache.AnagraficaTemp;
import cache.ListaStanze;
import cache.User;
import constants.TipiStanza;
import entities.AnagraficaMansione;
import entities.AnagraficaStanza;
import entities.Stanza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaManager;
import web_services.AnagraficaStanzaManager;
import web_services.StanzaManager;

public class UIHomePortinaio extends javax.swing.JFrame {

    private Stanza selectedStanza;
    private JFrame parent;

    public UIHomePortinaio() {
        initComponents();
        parent = this;
        this.setLocationRelativeTo(null);
        popolaTabella();
        visualizzaInfo();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNomeCognome = new javax.swing.JTextField();
        jTextFieldCf = new javax.swing.JTextField();
        jTextFieldIngresso = new javax.swing.JTextField();
        jButtonAnagraficaView = new javax.swing.JButton();
        jPanelOperazioniStanza = new javax.swing.JPanel();
        jButtonStruttura = new javax.swing.JButton();
        jButtonInizioVisita = new javax.swing.JButton();
        jButtonInizioAnagraficaStanza = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonFineAnagraficaStanza = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonFineVisita = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
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

        jLabel1.setFont(new java.awt.Font("Droid Sans", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Informazioni occupante");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome e cognome");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Codice fiscale");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Ingresso");

        jTextFieldNomeCognome.setEditable(false);

        jTextFieldCf.setEditable(false);

        jTextFieldIngresso.setEditable(false);

        jButtonAnagraficaView.setText("Anagrafica completa");
        jButtonAnagraficaView.setEnabled(false);

        javax.swing.GroupLayout jPanelInfoStanzaLayout = new javax.swing.GroupLayout(jPanelInfoStanza);
        jPanelInfoStanza.setLayout(jPanelInfoStanzaLayout);
        jPanelInfoStanzaLayout.setHorizontalGroup(
            jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGroup(jPanelInfoStanzaLayout.createSequentialGroup()
                        .addGroup(jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIngresso)
                            .addComponent(jTextFieldCf)
                            .addComponent(jTextFieldNomeCognome))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoStanzaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAnagraficaView)
                .addGap(67, 67, 67))
        );
        jPanelInfoStanzaLayout.setVerticalGroup(
            jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeCognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 61, Short.MAX_VALUE)
                .addComponent(jButtonAnagraficaView)
                .addContainerGap())
        );

        jButtonStruttura.setText("Struttura (DA SPOSTARE)");
        jButtonStruttura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStrutturaActionPerformed(evt);
            }
        });

        jButtonInizioVisita.setText("Inizio");
        jButtonInizioVisita.setToolTipText("");
        jButtonInizioVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioVisitaActionPerformed(evt);
            }
        });

        jButtonInizioAnagraficaStanza.setText("Inizio");
        jButtonInizioAnagraficaStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioAnagraficaStanzaActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Operazioni permanenza");

        jButtonFineAnagraficaStanza.setText("Fine");
        jButtonFineAnagraficaStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFineAnagraficaStanzaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Operazioni visita");

        jButtonFineVisita.setText("Fine");
        jButtonFineVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFineVisitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperazioniStanzaLayout = new javax.swing.GroupLayout(jPanelOperazioniStanza);
        jPanelOperazioniStanza.setLayout(jPanelOperazioniStanzaLayout);
        jPanelOperazioniStanzaLayout.setHorizontalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonStruttura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                        .addComponent(jButtonInizioAnagraficaStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFineAnagraficaStanza, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                    .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                        .addComponent(jButtonInizioVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFineVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelOperazioniStanzaLayout.setVerticalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInizioAnagraficaStanza)
                    .addComponent(jButtonFineAnagraficaStanza))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInizioVisita)
                    .addComponent(jButtonFineVisita))
                .addGap(55, 55, 55)
                .addComponent(jButtonStruttura, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jPanelInfoStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelHomeLayout.createSequentialGroup()
                            .addComponent(jLabelStruttura)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelUtente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jSeparator1)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanelInfoStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))))
        );

        jTabbedPane1.addTab("Home", jPanelHome);

        jScrollPane1.setViewportView(jTableRegClienti);

        javax.swing.GroupLayout jPanelRegistroClientiLayout = new javax.swing.GroupLayout(jPanelRegistroClienti);
        jPanelRegistroClienti.setLayout(jPanelRegistroClientiLayout);
        jPanelRegistroClientiLayout.setHorizontalGroup(
            jPanelRegistroClientiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
        );
        jPanelRegistroClientiLayout.setVerticalGroup(
            jPanelRegistroClientiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroClientiLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 102, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
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
        selectedStanza = ListaStanze.getInstance().get(selected);

        if (selectedStanza.getAgibile() == 0) {

            stanzaInagibile();

        } else if (selectedStanza.getLibera() == 0) {

            stanzaOccupata();

        } else {

            stanzaLibera();
        }
    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButtonInizioVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioVisitaActionPerformed

        if (selectedStanza == null) {
            JOptionPane.showMessageDialog(rootPane, "Selezionare una stanza dall'elenco");
            return;
        }
        new UIVisita(this, true, selectedStanza.getNumero()).setVisible(true);
    }//GEN-LAST:event_jButtonInizioVisitaActionPerformed

    private void jButtonStrutturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStrutturaActionPerformed

        new UIStruttura(this, true).setVisible(true);
    }//GEN-LAST:event_jButtonStrutturaActionPerformed

    private void jButtonInizioAnagraficaStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioAnagraficaStanzaActionPerformed

        if (selectedStanza == null) {
            JOptionPane.showMessageDialog(rootPane, "Selezionare una stanza dall'elenco");
            return;
        }
        new UIAnagraficaStanza(parent, true, selectedStanza.getNumero()).setVisible(true);
    }//GEN-LAST:event_jButtonInizioAnagraficaStanzaActionPerformed

    private void jButtonFineAnagraficaStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFineAnagraficaStanzaActionPerformed

        // UIAnagraficaStanza in modalità modifica
        JOptionPane.showMessageDialog(null, "FUNZIONE DA IMPLEMENTARE");
    }//GEN-LAST:event_jButtonFineAnagraficaStanzaActionPerformed

    private void jButtonFineVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFineVisitaActionPerformed
        
        // UIAnagraficaVisita in modalità modifica
        JOptionPane.showMessageDialog(null, "FUNZIONE DA IMPLEMENTARE");
    }//GEN-LAST:event_jButtonFineVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnagraficaView;
    private javax.swing.JButton jButtonFineAnagraficaStanza;
    private javax.swing.JButton jButtonFineVisita;
    private javax.swing.JButton jButtonInizioAnagraficaStanza;
    private javax.swing.JButton jButtonInizioVisita;
    private javax.swing.JButton jButtonStruttura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableRegClienti;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTextField jTextFieldCf;
    private javax.swing.JTextField jTextFieldIngresso;
    private javax.swing.JTextField jTextFieldNomeCognome;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void popolaTabella() {

        AnagraficaMansione utente = User.getInstance().getUtente();
        new StanzaManager().getStanzeByStruttura(utente.getNomeStruttura(), utente.getCodiceFiscaleProprietario());

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
            data[i][3] = traduciBoolean(stanze.get(i).getAgibile());
            data[i][4] = traduciBoolean(stanze.get(i).getLibera());
        }

        TableModel model = new DefaultTableModel(data, colonne);
        jTableStanze.setModel(model);
    }

    private void visualizzaInfo() {
        User utente = User.getInstance();
        jLabelStruttura.setText("Struttura: " + User.getInstance().getUtente().getNomeStruttura());
        jLabelUtente.setText("Utente connesso: " + utente.getInfoUtente().getNome() + " " + utente.getInfoUtente().getCognome());
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

    private String traduciBoolean(int input) {

        switch (input) {
            case 1:
                return "SI";
            case 0:
                return "NO";
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


    private void stanzaInagibile() {

        jTextFieldCf.setText("");
        jTextFieldNomeCognome.setText("");
        jTextFieldIngresso.setText("");
        jButtonAnagraficaView.setEnabled(false);
        jButtonInizioVisita.setEnabled(false);
        jButtonInizioAnagraficaStanza.setEnabled(false);
        jButtonFineVisita.setEnabled(false);
        jButtonFineAnagraficaStanza.setEnabled(false);
    }

    private void stanzaOccupata() {

        // OPERAZIONI SULLA STANZA
        jButtonInizioVisita.setEnabled(true);
        jButtonFineVisita.setEnabled(false);
        jButtonInizioAnagraficaStanza.setEnabled(false);
        jButtonFineAnagraficaStanza.setEnabled(true);

        // PRELEVO LE INFO SU QUESTA ANAGRAFICA STANZA
        AnagraficaStanza toRead = new AnagraficaStanza();
        toRead.setNumeroStanza(selectedStanza.getNumero());
        toRead.setNomeStruttura(selectedStanza.getNomeStruttura());
        toRead.setCodiceFiscaleProprietario(selectedStanza.getCodiceFiscaleProprietario());
        new AnagraficaStanzaManager().readAnagraficaStanza(toRead);
        toRead = AnagraficaStanzaTemp.getInstance().getAnagraficaStanzaTemp();

        // PRELEVO LE INFO SULL'ANAGRAFICA DELLA STANZA
        new AnagraficaManager().search(toRead.getCodiceFiscaleAnagrafica());

        // VISUALIZZO LE INFO
        jTextFieldCf.setText(toRead.getCodiceFiscaleAnagrafica());
        String nomeCognome = AnagraficaTemp.getInstance().getAnagraficaTemp().getNome();
        nomeCognome += " " + AnagraficaTemp.getInstance().getAnagraficaTemp().getCognome();
        jTextFieldNomeCognome.setText(nomeCognome);
        jTextFieldIngresso.setText(toRead.getIngresso());

        jButtonAnagraficaView.setEnabled(true);
        jButtonAnagraficaView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                UIAnagrafica view = new UIAnagrafica(parent, true);
                view.visualizza(AnagraficaTemp.getInstance().getAnagraficaTemp());
                view.setVisible(true);
            }
        });
    }

    private void stanzaLibera() {

        // INFORMAZIONI STANZA
        jTextFieldCf.setText("");
        jTextFieldNomeCognome.setText("");
        jTextFieldIngresso.setText("");
        jButtonAnagraficaView.setEnabled(false);

        // OPERAZIONI SULLA STANZA
        jButtonInizioVisita.setEnabled(false);
        jButtonFineVisita.setEnabled(false);
        jButtonInizioAnagraficaStanza.setEnabled(true);
        jButtonFineAnagraficaStanza.setEnabled(false);
    }
}
