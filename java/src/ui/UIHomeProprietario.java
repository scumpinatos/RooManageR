package ui;

import cache.lists.ListaAnagraficaMansione;
import cache.lists.ListaAnagraficaStanza;
import cache.lists.ListaOperazioni;
import cache.lists.ListaStanza;
import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import constants.Mansioni;
import constants.TipiStanza;
import entities.AnagraficaStanza;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaMansioneManager;
import web_services.StanzaManager;
import web_services.StrutturaManager;

public class UIHomeProprietario extends javax.swing.JFrame {

    private static StrutturaManager strutturaManager;
    
    // INDICI DI SELEZIONE DELLE TABELLE
    private int selectedStanza;
    private int selectedAnagStan;
    private int selectedVisita;
    private int indexSelectedStrutt;
    private String selectedStrutt;

    public UIHomeProprietario() {
        initComponents();
        this.setLocationRelativeTo(null);
        strutturaManager = new StrutturaManager();
        aggiornaInformazioni();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxStrutture1 = new javax.swing.JComboBox<String>();
        jPanelElencoAnagStanza = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAnagStanza = new javax.swing.JTable();
        jPanelElencoVisit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisita = new javax.swing.JTable();
        jPanelGestStruttura = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxStrutture2 = new javax.swing.JComboBox<String>();
        jPanelElencoStanze = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStanze = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelOperazioniStanza = new javax.swing.JPanel();
        jButtonAddStanza = new javax.swing.JButton();
        jButtonModStanza = new javax.swing.JButton();
        jButtonDeleteStanza = new javax.swing.JButton();
        jButtonViewStanza = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanelMansioni = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jButtonAddPor = new javax.swing.JButton();
        jButtonRemPor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDir = new javax.swing.JTextField();
        jButtonAddDir = new javax.swing.JButton();
        jButtonRemDir = new javax.swing.JButton();
        jPanelGestStrutture = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableStrutture = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelOperazioniStruttura = new javax.swing.JPanel();
        jButtonModStrutt = new javax.swing.JButton();
        jButtonAddStrutt = new javax.swing.JButton();
        jButtonDeleteStrutt = new javax.swing.JButton();
        jButtonViewStrutt = new javax.swing.JButton();
        jPanelRegistroOperazioni = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableRegOp = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(640, 480));

        jPanelHome.setPreferredSize(new java.awt.Dimension(640, 400));

        jLabel2.setText("Seleziona la struttura");

        jLabel4.setText("Permanenze nella struttura");

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
        jScrollPane3.setViewportView(jTableAnagStanza);

        javax.swing.GroupLayout jPanelElencoAnagStanzaLayout = new javax.swing.GroupLayout(jPanelElencoAnagStanza);
        jPanelElencoAnagStanza.setLayout(jPanelElencoAnagStanzaLayout);
        jPanelElencoAnagStanzaLayout.setHorizontalGroup(
            jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanelElencoAnagStanzaLayout.setVerticalGroup(
            jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jLabel3.setText("Visite nella struttura");

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
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
        );
        jPanelElencoVisitLayout.setVerticalGroup(
            jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                .addComponent(jLabel3)
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
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxStrutture1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 278, Short.MAX_VALUE))
                    .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStrutture1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home", jPanelHome);

        jLabel1.setText("Seleziona la struttura");

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

        javax.swing.GroupLayout jPanelElencoStanzeLayout = new javax.swing.GroupLayout(jPanelElencoStanze);
        jPanelElencoStanze.setLayout(jPanelElencoStanzeLayout);
        jPanelElencoStanzeLayout.setHorizontalGroup(
            jPanelElencoStanzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElencoStanzeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelElencoStanzeLayout.setVerticalGroup(
            jPanelElencoStanzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElencoStanzeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonAddStanza.setText("Aggiungi");
        jButtonAddStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStanzaActionPerformed(evt);
            }
        });

        jButtonModStanza.setText("Modifica");
        jButtonModStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModStanzaActionPerformed(evt);
            }
        });

        jButtonDeleteStanza.setText("Elimina ");
        jButtonDeleteStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteStanzaActionPerformed(evt);
            }
        });

        jButtonViewStanza.setText("Informazioni");
        jButtonViewStanza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewStanzaActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Operazioni sulla stanza");

        javax.swing.GroupLayout jPanelOperazioniStanzaLayout = new javax.swing.GroupLayout(jPanelOperazioniStanza);
        jPanelOperazioniStanza.setLayout(jPanelOperazioniStanzaLayout);
        jPanelOperazioniStanzaLayout.setHorizontalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                        .addComponent(jButtonAddStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonViewStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonModStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDeleteStanza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelOperazioniStanzaLayout.setVerticalGroup(
            jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOperazioniStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddStanza)
                    .addComponent(jButtonViewStanza)
                    .addComponent(jButtonModStanza)
                    .addComponent(jButtonDeleteStanza))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Portiere della struttura");

        jTextFieldPort.setEditable(false);
        jTextFieldPort.setEnabled(false);

        jButtonAddPor.setText("Aggiungi");
        jButtonAddPor.setEnabled(false);
        jButtonAddPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPorActionPerformed(evt);
            }
        });

        jButtonRemPor.setText("Rimuovi");
        jButtonRemPor.setEnabled(false);
        jButtonRemPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemPorActionPerformed(evt);
            }
        });

        jLabel8.setText("Direttore della struttura");

        jTextFieldDir.setEditable(false);
        jTextFieldDir.setEnabled(false);

        jButtonAddDir.setText("Aggiungi");
        jButtonAddDir.setEnabled(false);
        jButtonAddDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDirActionPerformed(evt);
            }
        });

        jButtonRemDir.setText("Rimuovi");
        jButtonRemDir.setEnabled(false);
        jButtonRemDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemDirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMansioniLayout = new javax.swing.GroupLayout(jPanelMansioni);
        jPanelMansioni.setLayout(jPanelMansioniLayout);
        jPanelMansioniLayout.setHorizontalGroup(
            jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMansioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPort)
                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRemPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRemDir, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanelMansioniLayout.setVerticalGroup(
            jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMansioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddPor)
                    .addComponent(jButtonRemPor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jButtonAddDir)
                    .addComponent(jButtonRemDir))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanelGestStrutturaLayout = new javax.swing.GroupLayout(jPanelGestStruttura);
        jPanelGestStruttura.setLayout(jPanelGestStrutturaLayout);
        jPanelGestStrutturaLayout.setHorizontalGroup(
            jPanelGestStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanelGestStrutturaLayout.createSequentialGroup()
                .addGroup(jPanelGestStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelElencoStanze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelGestStrutturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelGestStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelGestStrutturaLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxStrutture2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanelMansioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelGestStrutturaLayout.setVerticalGroup(
            jPanelGestStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGestStrutturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStrutture2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoStanze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperazioniStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMansioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jTabbedPane1.addTab("Gestisci struttura", jPanelGestStruttura);

        jLabel5.setText("Elenco delle tue strutture");

        jTableStrutture.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableStrutture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStruttureMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableStrutture);

        jButtonModStrutt.setText("Modifica informazioni struttura");
        jButtonModStrutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModStruttActionPerformed(evt);
            }
        });

        jButtonAddStrutt.setText("Aggiungi una nuova struttura");
        jButtonAddStrutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStruttActionPerformed(evt);
            }
        });

        jButtonDeleteStrutt.setText("Rimuovi la struttura selezionata");
        jButtonDeleteStrutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteStruttActionPerformed(evt);
            }
        });

        jButtonViewStrutt.setText("Visualizza informazioni struttura");
        jButtonViewStrutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewStruttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperazioniStrutturaLayout = new javax.swing.GroupLayout(jPanelOperazioniStruttura);
        jPanelOperazioniStruttura.setLayout(jPanelOperazioniStrutturaLayout);
        jPanelOperazioniStrutturaLayout.setHorizontalGroup(
            jPanelOperazioniStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonAddStrutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonModStrutt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonDeleteStrutt, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
            .addComponent(jButtonViewStrutt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelOperazioniStrutturaLayout.setVerticalGroup(
            jPanelOperazioniStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStrutturaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonModStrutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddStrutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeleteStrutt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonViewStrutt)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelGestStruttureLayout = new javax.swing.GroupLayout(jPanelGestStrutture);
        jPanelGestStrutture.setLayout(jPanelGestStruttureLayout);
        jPanelGestStruttureLayout.setHorizontalGroup(
            jPanelGestStruttureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestStruttureLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGestStruttureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOperazioniStruttura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGestStruttureLayout.setVerticalGroup(
            jPanelGestStruttureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGestStruttureLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperazioniStruttura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Gestisci strutture", jPanelGestStrutture);

        jTableRegOp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableRegOp);

        javax.swing.GroupLayout jPanelRegistroOperazioniLayout = new javax.swing.GroupLayout(jPanelRegistroOperazioni);
        jPanelRegistroOperazioni.setLayout(jPanelRegistroOperazioniLayout);
        jPanelRegistroOperazioniLayout.setHorizontalGroup(
            jPanelRegistroOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
        );
        jPanelRegistroOperazioniLayout.setVerticalGroup(
            jPanelRegistroOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registro operazioni", jPanelRegistroOperazioni);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Gestiscti struttura");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTI PANEL HOME
    private void jTableAnagStanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnagStanzaMouseClicked

        selectedAnagStan = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableAnagStanzaMouseClicked

    private void jTableVisitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVisitaMouseClicked

        selectedVisita = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableVisitaMouseClicked

    // EVENTI PANEL GESTISCI STRUTTURA
    private void jTableStanzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStanzeMouseClicked

        selectedStanza = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButtonAddStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStanzaActionPerformed

        new UIStanza(null, true, selectedStrutt).nuovo();
        popolaElencoStanze();
        popolaRegistroOperazioni();

    }//GEN-LAST:event_jButtonAddStanzaActionPerformed

    private void jButtonModStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModStanzaActionPerformed

        new UIStanza(null, true, selectedStrutt).modifica(ListaStanza.getIstanza().get(selectedStanza));
        popolaElencoStanze();
        popolaRegistroOperazioni();
    }//GEN-LAST:event_jButtonModStanzaActionPerformed

    private void jButtonDeleteStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteStanzaActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Sicuro di voler rimuovere la stanza: "
                + ListaStanza.getIstanza().get(selectedStanza).getNumero(), "Elimina stanza", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            new StanzaManager().deleteStanza(ListaStanza.getIstanza().get(selectedStanza));
            popolaElencoStanze();
        }
    }//GEN-LAST:event_jButtonDeleteStanzaActionPerformed

    private void jButtonViewStanzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewStanzaActionPerformed

        new UIStanza(null, true, selectedStrutt).visualizza(ListaStanza.getIstanza().get(selectedStanza));
    }//GEN-LAST:event_jButtonViewStanzaActionPerformed

    // EVENTI PANEL GESTISCI STRUTTURE
    private void jButtonModStruttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModStruttActionPerformed

        new UIStruttura(null, true).modifica(ListaStruttura.getIstanza().get(indexSelectedStrutt));
        caricaElencoStrutture();
        popolaRegistroOperazioni();
    }//GEN-LAST:event_jButtonModStruttActionPerformed

    private void jButtonAddStruttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStruttActionPerformed

        new UIStruttura(null, true).nuovo();
        aggiornaInformazioni();
        JOptionPane.showMessageDialog(null, "Per aggiungere le stanze alla struttura vai al pannello 'Gestisci struttura'");
    }//GEN-LAST:event_jButtonAddStruttActionPerformed

    private void jButtonDeleteStruttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteStruttActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Sicuro di voler rimuovere la struttura: "
                + ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome(), "Elimina stanza", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            String param1 = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
            String param2 = ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome();
            strutturaManager.deleteStruttura(param1, param2);
            aggiornaInformazioni();
        }
    }//GEN-LAST:event_jButtonDeleteStruttActionPerformed

    private void jButtonViewStruttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewStruttActionPerformed

        new UIStruttura(null, true).visualizza(ListaStruttura.getIstanza().get(indexSelectedStrutt));
    }//GEN-LAST:event_jButtonViewStruttActionPerformed

    private void jTableStruttureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStruttureMouseClicked

        indexSelectedStrutt = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableStruttureMouseClicked

    private void jButtonAddPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPorActionPerformed
        
        String struttura = (String) jComboBoxStrutture2.getSelectedItem();
        new UIAnagraficaMansione(this, true, 1, struttura).setVisible(true);
        popolaRegistroOperazioni();
        mansioniStruttura();
    }//GEN-LAST:event_jButtonAddPorActionPerformed

    private void jButtonRemPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemPorActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Sicuro di voler rimuovere il portinaio",
                "Rimuovi portinaio", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            rimuoviAnagraficaMansione(1);
            popolaRegistroOperazioni();
            mansioniStruttura();
        }
    }//GEN-LAST:event_jButtonRemPorActionPerformed

    private void jButtonAddDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDirActionPerformed

        String struttura = (String) jComboBoxStrutture2.getSelectedItem();
        new UIAnagraficaMansione(this, true, 2, struttura).setVisible(true);
        popolaRegistroOperazioni();
        mansioniStruttura();       
    }//GEN-LAST:event_jButtonAddDirActionPerformed

    private void jButtonRemDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemDirActionPerformed

        int choice = JOptionPane.showConfirmDialog(null, "Sicuro di voler rimuovere il direttore",
                "Rimuovi direttore", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            rimuoviAnagraficaMansione(2);
            popolaRegistroOperazioni();
            mansioniStruttura();
        }
    }//GEN-LAST:event_jButtonRemDirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddDir;
    private javax.swing.JButton jButtonAddPor;
    private javax.swing.JButton jButtonAddStanza;
    private javax.swing.JButton jButtonAddStrutt;
    private javax.swing.JButton jButtonDeleteStanza;
    private javax.swing.JButton jButtonDeleteStrutt;
    private javax.swing.JButton jButtonModStanza;
    private javax.swing.JButton jButtonModStrutt;
    private javax.swing.JButton jButtonRemDir;
    private javax.swing.JButton jButtonRemPor;
    private javax.swing.JButton jButtonViewStanza;
    private javax.swing.JButton jButtonViewStrutt;
    private javax.swing.JComboBox<String> jComboBoxStrutture1;
    private javax.swing.JComboBox<String> jComboBoxStrutture2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelElencoAnagStanza;
    private javax.swing.JPanel jPanelElencoStanze;
    private javax.swing.JPanel jPanelElencoVisit;
    private javax.swing.JPanel jPanelGestStruttura;
    private javax.swing.JPanel jPanelGestStrutture;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMansioni;
    private javax.swing.JPanel jPanelOperazioniStanza;
    private javax.swing.JPanel jPanelOperazioniStruttura;
    private javax.swing.JPanel jPanelRegistroOperazioni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableAnagStanza;
    private javax.swing.JTable jTableRegOp;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTable jTableStrutture;
    private javax.swing.JTable jTableVisita;
    private javax.swing.JTextField jTextFieldDir;
    private javax.swing.JTextField jTextFieldPort;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void aggiornaInformazioni() {
        caricaStruttureComboBox2();
        caricaStruttureComboBox1();
        caricaElencoStrutture();
        popolaRegistroOperazioni();
    }

    // PANEL GESTISCI STRUTTURE
    private void caricaElencoStrutture() {

        // SCARICO LE INFORMAZIONI
        strutturaManager.readAllStruttureAnagrafica(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());

        // VISUALIZZO LE INFORMAZIONI
        ListaStruttura strutture = ListaStruttura.getIstanza();
        int nStru = strutture.size();

        String[] colonne = new String[4];
        colonne[0] = "Nome";
        colonne[1] = "Indirizzo";
        colonne[2] = "Agibile";
        colonne[3] = "Descrizione";

        Object[][] data = new Object[nStru][4];

        for (int i = 0; i < nStru; i++) {
            data[i][0] = strutture.get(i).getNome();
            data[i][1] = strutture.get(i).getIndirizzo();
            data[i][2] = traduciBoolean(strutture.get(i).getAgibile());
            data[i][3] = strutture.get(i).getDescrizione();
        }

        TableModel model = new DefaultTableModel(data, colonne);
        jTableStrutture.setModel(model);
    }

    // PANEL GESTISCI STRUTTURA
    private void caricaStruttureComboBox2() {

        // SCARICO LE STRUTTURE
        strutturaManager.readAllStruttureAnagrafica(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());

        ListaStruttura strutture = ListaStruttura.getIstanza();
        int nStru = strutture.size();

        String[] items = new String[nStru];
        for (int i = 0; i < nStru; i++) {
            items[i] = strutture.get(i).getNome();
        }

        jComboBoxStrutture2.setModel(new DefaultComboBoxModel<String>(items));

        // AGGIUNGO IL LISTENER PER CARICARE LE STANZE DELLA STRUTTURA
        jComboBoxStrutture2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                selectedStrutt = (String) ((JComboBox) e.getSource()).getSelectedItem();
                
                popolaElencoStanze();
                mansioniStruttura();
            }
        });
    }
    
    private void rimuoviAnagraficaMansione(int tipo) {

        String cf = null;
        if (tipo == 1) {
            cf = jTextFieldPort.getText();
        }
        if (tipo == 2) {
            cf = jTextFieldDir.getText();
        }

        String cfProp = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        String nomeStrutt = (String) jComboBoxStrutture2.getSelectedItem();

        new AnagraficaMansioneManager().deleteAnagraficaMansione(cf, cfProp, nomeStrutt);
    }

    private void mansioniStruttura() {
        
        System.out.println("AGGIORNO LE INFORMAZIONI");
        
        // SCARICO LE INFORMAZIONI
        strutturaManager.readAllAnagraficaMansioneStruttura(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica(), selectedStrutt);
        
        // VISUALIZZO LE INFORMAZIONI
        ListaAnagraficaMansione mansioni = ListaAnagraficaMansione.getIstanza();
        int nMan = mansioni.size();

        for (int i = 0; i < nMan; i++) {
            switch (mansioni.get(i).getTipoMansione()) {
                case Mansioni.PORTINAIO:
                    jTextFieldPort.setText(mansioni.get(i).getCodiceFiscaleAnagrafica());
                    jTextFieldPort.setEnabled(true);
                    jButtonRemPor.setEnabled(true);
                    jButtonAddPor.setEnabled(false);
                    break;
                case Mansioni.DIRETTORE:
                    jTextFieldDir.setText(mansioni.get(i).getCodiceFiscaleAnagrafica());
                    jTextFieldDir.setEnabled(true);
                    jButtonRemDir.setEnabled(true);
                    jButtonAddDir.setEnabled(false);
                    break;
            }
        }
        
        if(!jTextFieldDir.isEnabled())
            jButtonAddDir.setEnabled(true);
        if(!jTextFieldPort.isEnabled())
            jButtonAddPor.setEnabled(true);
    }

    private void popolaElencoStanze() {
        
        // SCARICO LE INFORMAZIONI
        strutturaManager.readAllStanzeStruttura(selectedStrutt, UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());

        // VISUALIZZO LE INFORMAZIONI
        ListaStanza stanze = ListaStanza.getIstanza();
        int nSta = stanze.size();

        String[] colonne = new String[5];
        colonne[0] = "Numero";
        colonne[1] = "Tipo";
        colonne[2] = "Mq";
        colonne[3] = "Agibile";
        colonne[4] = "Libera";

        Object[][] data = new Object[nSta][5];

        for (int i = 0; i < nSta; i++) {
            data[i][0] = stanze.get(i).getNumero();
            data[i][1] = getStringTipo(stanze.get(i).getTipo());
            data[i][2] = stanze.get(i).getMq();
            data[i][3] = traduciBoolean(stanze.get(i).getAgibile());
            data[i][4] = traduciBoolean(stanze.get(i).getLibera());
        }

        TableModel model = new DefaultTableModel(data, colonne);
        jTableStanze.setModel(model);

    }

    // PANEL HOME
    private void caricaStruttureComboBox1() {

        // CARICO LE STRUTTURE
        strutturaManager.readAllStruttureAnagrafica(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());

        ListaStruttura strutture = ListaStruttura.getIstanza();
        int nStru = strutture.size();

        String[] items = new String[nStru];
        for (int i = 0; i < nStru; i++) {
            items[i] = strutture.get(i).getNome();
        }

        jComboBoxStrutture1.setModel(new DefaultComboBoxModel<String>(items));

        // AGGIUNGO IL LISTENER PER CARICARE LE ANAGRAFICASTANZA E LE VISITE
        jComboBoxStrutture1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                selectedStrutt = (String) ((JComboBox) e.getSource()).getSelectedItem();
                popolaElencoAnagStanVisita();
            }
        });
    }

    private void popolaElencoAnagStanVisita() {
        
        // SCARICO LE INFORMAZIONI DAL DATABASE
        strutturaManager.readAllAnagraficaStanzaStruttura(
                        UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica(), selectedStrutt);

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

        // VISITE
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

    // PANEL REGISTRO OPERAZIONI
    private void popolaRegistroOperazioni() {

        jTableRegOp.setEnabled(true);

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
}
