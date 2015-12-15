package ui;

import cache.lists.ListaAnagraficaStanza;
import cache.singular.AnagraficaStanzaTemp;
import cache.lists.ListaStanza;
import cache.lists.ListaOperazioni;
import cache.singular.UtenteConnesso;
import constants.TipiStanza;
import entities.AnagraficaStanza;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaStanzaManager;
import web_services.StrutturaManager;

public class UIHomePortinaio extends javax.swing.JFrame {

    private int selectedAnagStan;
    private int selectedVisita;
    private int selectedStanza;
    private final JFrame parent;

    public UIHomePortinaio() {
        initComponents();
        parent = this;
        this.setLocationRelativeTo(null);
        aggiornaInformazioni();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jPanelElencoAnagStanza = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableAnagStanza = new javax.swing.JTable();
        jPanelElencoVisit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisita = new javax.swing.JTable();
        jPanelGestione = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStanze = new javax.swing.JTable();
        jPanelOperazioniStanza = new javax.swing.JPanel();
        jButtonInizioVisita = new javax.swing.JButton();
        jButtonInizioAnagraficaStanza = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonFineAnagraficaStanza = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonFineVisita = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelRegistroOperazioni = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRegOp = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemRegMov = new javax.swing.JMenuItem();
        jMenuItemEsci = new javax.swing.JMenuItem();
        jMenuUtente = new javax.swing.JMenu();
        jMenuItemProfilo = new javax.swing.JMenuItem();
        jMenuItemPassword = new javax.swing.JMenuItem();
        jMenuCredits = new javax.swing.JMenu();
        jMenuItemCredits = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RooManageR");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(640, 480));

        jPanelHome.setPreferredSize(new java.awt.Dimension(640, 400));

        jLabel8.setText("Permanenze nella struttura");

        jTableAnagStanza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableAnagStanza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAnagStanzaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableAnagStanza);

        javax.swing.GroupLayout jPanelElencoAnagStanzaLayout = new javax.swing.GroupLayout(jPanelElencoAnagStanza);
        jPanelElencoAnagStanza.setLayout(jPanelElencoAnagStanzaLayout);
        jPanelElencoAnagStanzaLayout.setHorizontalGroup(
            jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanelElencoAnagStanzaLayout.setVerticalGroup(
            jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jLabel9.setText("Visite nella struttura");

        jTableVisita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVisitaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVisita);

        javax.swing.GroupLayout jPanelElencoVisitLayout = new javax.swing.GroupLayout(jPanelElencoVisit);
        jPanelElencoVisit.setLayout(jPanelElencoVisitLayout);
        jPanelElencoVisitLayout.setHorizontalGroup(
            jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );
        jPanelElencoVisitLayout.setVerticalGroup(
            jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanelHome);

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

        jButtonInizioVisita.setText("Inizio");
        jButtonInizioVisita.setToolTipText("");
        jButtonInizioVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioVisitaActionPerformed(evt);
            }
        });

        jButtonInizioAnagraficaStanza.setText("Inizio");
        jButtonInizioAnagraficaStanza.setEnabled(false);
        jButtonInizioAnagraficaStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioAnagraficaStanzaActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Operazioni permanenza");

        jButtonFineAnagraficaStanza.setText("Fine");
        jButtonFineAnagraficaStanza.setEnabled(false);
        jButtonFineAnagraficaStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFineAnagraficaStanzaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Operazioni visita");

        jButtonFineVisita.setText("Fine");
        jButtonFineVisita.setEnabled(false);
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
                .addGap(96, 96, 96))
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanelGestioneLayout = new javax.swing.GroupLayout(jPanelGestione);
        jPanelGestione.setLayout(jPanelGestioneLayout);
        jPanelGestioneLayout.setHorizontalGroup(
            jPanelGestioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestioneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGestioneLayout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jSeparator1)
        );
        jPanelGestioneLayout.setVerticalGroup(
            jPanelGestioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestioneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelGestioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestioneLayout.createSequentialGroup()
                        .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))))
        );

        jTabbedPane1.addTab("Gestione struttura", jPanelGestione);

        jTableRegOp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableRegOp);

        javax.swing.GroupLayout jPanelRegistroOperazioniLayout = new javax.swing.GroupLayout(jPanelRegistroOperazioni);
        jPanelRegistroOperazioni.setLayout(jPanelRegistroOperazioniLayout);
        jPanelRegistroOperazioniLayout.setHorizontalGroup(
            jPanelRegistroOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        jPanelRegistroOperazioniLayout.setVerticalGroup(
            jPanelRegistroOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registro operazioni", jPanelRegistroOperazioni);

        jMenuFile.setText("File");

        jMenuItemRegMov.setText("Registro movimenti");
        jMenuItemRegMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegMovActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemRegMov);

        jMenuItemEsci.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemEsci.setText("Esci");
        jMenuFile.add(jMenuItemEsci);

        jMenuBar1.add(jMenuFile);

        jMenuUtente.setText("Utente");

        jMenuItemProfilo.setText("Visualizza profilo");
        jMenuItemProfilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfiloActionPerformed(evt);
            }
        });
        jMenuUtente.add(jMenuItemProfilo);

        jMenuItemPassword.setText("Modifica password");
        jMenuItemPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPasswordActionPerformed(evt);
            }
        });
        jMenuUtente.add(jMenuItemPassword);

        jMenuBar1.add(jMenuUtente);

        jMenuCredits.setText("?");

        jMenuItemCredits.setText("Credits");
        jMenuItemCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreditsActionPerformed(evt);
            }
        });
        jMenuCredits.add(jMenuItemCredits);

        jMenuBar1.add(jMenuCredits);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreditsActionPerformed

        new UICredits(this, true).setVisible(true);
    }//GEN-LAST:event_jMenuItemCreditsActionPerformed

    private void jTableStanzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStanzeMouseClicked

        selectedStanza = ((JTable) evt.getSource()).getSelectedRow();

        if (ListaStanza.getIstanza().get(selectedStanza).getAgibile() == 0) {

            stanzaInagibile();

        } else if (ListaStanza.getIstanza().get(selectedStanza).getLibera() == 0) {

            stanzaOccupata();

        } else {

            stanzaLibera();
        }
    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButtonInizioAnagraficaStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioAnagraficaStanzaActionPerformed

        new UIAnagraficaStanza(parent, true, selectedStanza, 1).setVisible(true);
        aggiornaInformazioni();
    }//GEN-LAST:event_jButtonInizioAnagraficaStanzaActionPerformed

    private void jButtonFineAnagraficaStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFineAnagraficaStanzaActionPerformed

        UIAnagStaEnd view = new UIAnagStaEnd(parent, true, selectedStanza);
        view.popola(AnagraficaStanzaTemp.getIstanza());
        view.setVisible(true);
        aggiornaInformazioni();
    }//GEN-LAST:event_jButtonFineAnagraficaStanzaActionPerformed

    private void jTableAnagStanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnagStanzaMouseClicked

        selectedAnagStan = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableAnagStanzaMouseClicked

    private void jTableVisitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVisitaMouseClicked

        selectedVisita = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableVisitaMouseClicked

    private void jMenuItemRegMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegMovActionPerformed
        
        new UIRegistroMovimenti(parent, true, false).setVisible(true);
    }//GEN-LAST:event_jMenuItemRegMovActionPerformed

    private void jMenuItemPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPasswordActionPerformed
        
        new UIPassword(parent, true).setVisible(true);
        popolaRegistroOperazioni();
    }//GEN-LAST:event_jMenuItemPasswordActionPerformed

    private void jMenuItemProfiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfiloActionPerformed
        
        UIAnagrafica view = new UIAnagrafica(parent, true);
        view.visualizza(UtenteConnesso.getInfoUtente());
        view.setVisible(true);
        popolaRegistroOperazioni();
    }//GEN-LAST:event_jMenuItemProfiloActionPerformed

    private void jButtonInizioVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioVisitaActionPerformed
        new UIAnagraficaStanza(parent, true, selectedStanza, 2).setVisible(true);
        aggiornaInformazioni();
    }//GEN-LAST:event_jButtonInizioVisitaActionPerformed

    private void jButtonFineVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFineVisitaActionPerformed
        UIAnagStaEnd view = new UIAnagStaEnd(parent, true, selectedStanza);
        view.popola(AnagraficaStanzaTemp.getIstanza());
        view.setVisible(true);
        aggiornaInformazioni();
    }//GEN-LAST:event_jButtonFineVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFineAnagraficaStanza;
    private javax.swing.JButton jButtonFineVisita;
    private javax.swing.JButton jButtonInizioAnagraficaStanza;
    private javax.swing.JButton jButtonInizioVisita;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCredits;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItemCredits;
    private javax.swing.JMenuItem jMenuItemEsci;
    private javax.swing.JMenuItem jMenuItemPassword;
    private javax.swing.JMenuItem jMenuItemProfilo;
    private javax.swing.JMenuItem jMenuItemRegMov;
    private javax.swing.JMenu jMenuUtente;
    private javax.swing.JPanel jPanelElencoAnagStanza;
    private javax.swing.JPanel jPanelElencoVisit;
    private javax.swing.JPanel jPanelGestione;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelOperazioniStanza;
    private javax.swing.JPanel jPanelRegistroOperazioni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAnagStanza;
    private javax.swing.JTable jTableRegOp;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTable jTableVisita;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void popolaElencoStanze() {

        new StrutturaManager().readAllStanzeStruttura(UtenteConnesso.getUtente().getNomeStruttura(),
                UtenteConnesso.getUtente().getCodiceFiscaleProprietario());

        ListaStanza stanze = ListaStanza.getIstanza();
        int nst = stanze.size();

        String[] colonne = new String[5];
        colonne[0] = "Numero";
        colonne[1] = "Tipo";
        colonne[2] = "Mq";
        colonne[3] = "Agibile";
        colonne[4] = "Libera";

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

    private void popolaRegistroOperazioni() {

        ListaOperazioni operazioni = ListaOperazioni.getListaOperazioni();
        int nOp = operazioni.size();

        String[][] dati = new String[nOp][1];
        for (int i = 0; i < nOp; i++) {
            dati[i][0] = operazioni.get(i);
        }

        String[] colonne = new String[1];
        colonne[0] = "Data - Ora - Descrizione";

        TableModel model = new DefaultTableModel(dati, colonne);
        jTableRegOp.setModel(model);
    }

    private void stanzaInagibile() {

        jButtonInizioVisita.setEnabled(false);
        jButtonInizioAnagraficaStanza.setEnabled(false);
        jButtonFineVisita.setEnabled(false);
        jButtonFineAnagraficaStanza.setEnabled(false);
    }

    private void stanzaOccupata() {

        // OPERAZIONI SULLA STANZA
        caricaAnagraficaStanza();
        controlloVisita();
        jButtonInizioAnagraficaStanza.setEnabled(false);
        jButtonFineAnagraficaStanza.setEnabled(true);
    }

    private void stanzaLibera() {

        // OPERAZIONI SULLA STANZA
        jButtonInizioVisita.setEnabled(false);
        jButtonFineVisita.setEnabled(false);
        jButtonInizioAnagraficaStanza.setEnabled(true);
        jButtonFineAnagraficaStanza.setEnabled(false);
    }

    private void caricaAnagraficaStanza() {
    
        AnagraficaStanza toRead = new AnagraficaStanza();
        toRead.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleProprietario());
        toRead.setNomeStruttura(UtenteConnesso.getUtente().getNomeStruttura());
        toRead.setNumeroStanza(ListaStanza.getIstanza().get(selectedStanza).getNumero());
        new AnagraficaStanzaManager().readAnagraficaStanza(toRead);
    }
    
    private void controlloVisita() {

    }
    
    private void popolaElencoAnagraficaStanzaVisita() {
        
        // CARICO LE INFORMAZIONI
        StrutturaManager manager = new StrutturaManager();
        manager.readAllInCorso(UtenteConnesso.getUtente().getCodiceFiscaleProprietario(), 
                UtenteConnesso.getUtente().getNomeStruttura());
        
        // ANAGRAFICA STANZA
        ListaAnagraficaStanza permanenze = ListaAnagraficaStanza.getIstanza();
        int nPerm = permanenze.size();

        String[] colonne = new String[3];
        colonne[0] = "Numero stanza";
        colonne[1] = "Codice fiscale";
        colonne[2] = "Data ed ora ingresso";

        Object[][] data = new Object[nPerm][3];

        for (int i = 0; i < nPerm; i++) {
            data[i][0] = permanenze.get(i).getNumeroStanza();
            data[i][1] = permanenze.get(i).getCodiceFiscaleAnagrafica();
            data[i][2] = permanenze.get(i).getIngresso();
        }

        TableModel model = new DefaultTableModel(data, colonne);
        jTableAnagStanza.setModel(model);

    }
    
    private void aggiornaInformazioni() {
        
        popolaElencoStanze();
        popolaRegistroOperazioni();
        popolaElencoAnagraficaStanzaVisita();
    }
}
