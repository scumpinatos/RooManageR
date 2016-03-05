package ui;

import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import constants.Mansioni;
import entities.AnagraficaMansione;
import entities.Struttura;
import interfaces.ICallback;
import interfaces.ICallbackGeneral;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaMansioneManager;
import web_services.StrutturaManager;

public class JPanelGestioneStruttura extends javax.swing.JPanel {

    private int indexSelectedStrutt;
    private static StrutturaManager strutturaManager;
    private String cfProprietario;

    public JPanelGestioneStruttura(StrutturaManager manager) {
        strutturaManager = manager;
        cfProprietario = UtenteConnesso.getUtente().getCodiceFiscaleProprietario();
        initComponents();
        caricaElencoStrutture(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneElenco = new javax.swing.JScrollPane();
        jTableStrutture = new javax.swing.JTable();
        jPanelOperazioniStruttura = new javax.swing.JPanel();
        jButtonAggiungi = new javax.swing.JButton();
        jButtonModifica = new javax.swing.JButton();
        jButtonRimuovi = new javax.swing.JButton();
        jButtonStanze = new javax.swing.JButton();
        jPanelMansioni = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabelPortinaio = new javax.swing.JLabel();
        jButtonAddPor = new javax.swing.JButton();
        jButtonRemPor = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabelDirettore = new javax.swing.JLabel();
        jButtonAddDir = new javax.swing.JButton();
        jButtonRemDir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPass = new javax.swing.JTextField();
        jPanelInformazioni = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIndirizzo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaDescrizione = new javax.swing.JTextArea();
        jButtonAgibile = new javax.swing.JButton();
        jButtonConferma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setName("Gestione Strutture"); // NOI18N

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
        jScrollPaneElenco.setViewportView(jTableStrutture);

        jButtonAggiungi.setText("Aggiungi");
        jButtonAggiungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggiungiActionPerformed(evt);
            }
        });

        jButtonModifica.setText("Modifica");
        jButtonModifica.setEnabled(false);
        jButtonModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificaActionPerformed(evt);
            }
        });

        jButtonRimuovi.setText("Rimuovi");
        jButtonRimuovi.setEnabled(false);
        jButtonRimuovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRimuoviActionPerformed(evt);
            }
        });

        jButtonStanze.setText("Stanze");
        jButtonStanze.setEnabled(false);
        jButtonStanze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStanzeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperazioniStrutturaLayout = new javax.swing.GroupLayout(jPanelOperazioniStruttura);
        jPanelOperazioniStruttura.setLayout(jPanelOperazioniStrutturaLayout);
        jPanelOperazioniStrutturaLayout.setHorizontalGroup(
            jPanelOperazioniStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniStrutturaLayout.createSequentialGroup()
                .addComponent(jButtonAggiungi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModifica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonStanze, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRimuovi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelOperazioniStrutturaLayout.setVerticalGroup(
            jPanelOperazioniStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperazioniStrutturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperazioniStrutturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModifica)
                    .addComponent(jButtonAggiungi)
                    .addComponent(jButtonRimuovi)
                    .addComponent(jButtonStanze))
                .addContainerGap())
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Portinaio");

        jLabelPortinaio.setFont(new java.awt.Font("Droid Sans", 2, 12)); // NOI18N
        jLabelPortinaio.setForeground(java.awt.Color.blue);
        jLabelPortinaio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPortinaio.setText("Inserisci Codice Fiscale");
        jLabelPortinaio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelPortinaio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPortinaioMouseClicked(evt);
            }
        });

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

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Direttore");

        jLabelDirettore.setFont(new java.awt.Font("Droid Sans", 2, 12)); // NOI18N
        jLabelDirettore.setForeground(java.awt.Color.blue);
        jLabelDirettore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDirettore.setText("Inserisci Codice Fiscale");
        jLabelDirettore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDirettore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDirettoreMouseClicked(evt);
            }
        });

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

        jLabel2.setText("Password");

        jTextFieldPass.setEnabled(false);

        javax.swing.GroupLayout jPanelMansioniLayout = new javax.swing.GroupLayout(jPanelMansioni);
        jPanelMansioni.setLayout(jPanelMansioniLayout);
        jPanelMansioniLayout.setHorizontalGroup(
            jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMansioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMansioniLayout.createSequentialGroup()
                        .addComponent(jButtonAddPor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemPor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMansioniLayout.createSequentialGroup()
                        .addComponent(jButtonAddDir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRemDir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMansioniLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPortinaio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMansioniLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelDirettore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMansioniLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMansioniLayout.setVerticalGroup(
            jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMansioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelPortinaio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddPor)
                    .addComponent(jButtonRemPor))
                .addGap(18, 18, 18)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabelDirettore))
                .addGap(13, 13, 13)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddDir)
                    .addComponent(jButtonRemDir))
                .addGap(18, 18, 18)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("Nome");

        jTextFieldNome.setEditable(false);

        jLabel9.setText("Indirizzo");

        jTextFieldIndirizzo.setEditable(false);

        jLabel10.setText("Descrizione");

        jTextAreaDescrizione.setEditable(false);
        jTextAreaDescrizione.setColumns(20);
        jTextAreaDescrizione.setLineWrap(true);
        jTextAreaDescrizione.setRows(5);
        jScrollPane5.setViewportView(jTextAreaDescrizione);

        jButtonAgibile.setBackground(java.awt.Color.green);
        jButtonAgibile.setForeground(java.awt.Color.black);
        jButtonAgibile.setText("SI");
        jButtonAgibile.setEnabled(false);
        jButtonAgibile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgibileActionPerformed(evt);
            }
        });

        jButtonConferma.setText("Conferma");
        jButtonConferma.setEnabled(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Agibile");

        javax.swing.GroupLayout jPanelInformazioniLayout = new javax.swing.GroupLayout(jPanelInformazioni);
        jPanelInformazioni.setLayout(jPanelInformazioniLayout);
        jPanelInformazioniLayout.setHorizontalGroup(
            jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformazioniLayout.createSequentialGroup()
                .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInformazioniLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConferma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInformazioniLayout.createSequentialGroup()
                        .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelInformazioniLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel6))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanelInformazioniLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5)
                            .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgibile, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelInformazioniLayout.setVerticalGroup(
            jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInformazioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIndirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInformazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgibile)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConferma)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanelMansioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelInformazioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPaneElenco)
                        .addComponent(jPanelOperazioniStruttura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneElenco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOperazioniStruttura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelInformazioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMansioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableStruttureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStruttureMouseClicked

        indexSelectedStrutt = ((JTable) evt.getSource()).getSelectedRow();
        jButtonModifica.setEnabled(true);
        jButtonStanze.setEnabled(true);
        jButtonRimuovi.setEnabled(true);
        visualizzaInfo(indexSelectedStrutt);
        caricaMansioni();
        abilita(false);
    }//GEN-LAST:event_jTableStruttureMouseClicked

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        modificaStruttura();
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiungiActionPerformed
        aggiungiStruttura();
    }//GEN-LAST:event_jButtonAggiungiActionPerformed

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        eliminaStruttura();
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonAgibileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgibileActionPerformed
        String text = ((JButton) evt.getSource()).getText();
        if (text.equals("SI")) {
            ((JButton) evt.getSource()).setText("NO");
        } else {
            ((JButton) evt.getSource()).setText("SI");
        }
    }//GEN-LAST:event_jButtonAgibileActionPerformed

    private void jButtonAddPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPorActionPerformed

        aggiungiMansione(1);
    }//GEN-LAST:event_jButtonAddPorActionPerformed

    private void jButtonAddDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDirActionPerformed

        aggiungiMansione(2);
    }//GEN-LAST:event_jButtonAddDirActionPerformed

    private void jLabelPortinaioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPortinaioMouseClicked

        new UIAnagrafica(null, true, new ICallback<String>() {
            
            public void result(String obj) {
                if (obj != null) {
                    jLabelPortinaio.setText(obj);
                    jLabelPortinaio.setEnabled(false);
                }
            }
        }).setVisible(true);
    }//GEN-LAST:event_jLabelPortinaioMouseClicked

    private void jLabelDirettoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDirettoreMouseClicked

        new UIAnagrafica(null, true, new ICallback<String>() {
            
            public void result(String obj) {
                if (obj != null) {
                    jLabelDirettore.setText(obj);
                    jLabelDirettore.setEnabled(false);
                }
            }
        }).setVisible(true);
    }//GEN-LAST:event_jLabelDirettoreMouseClicked

    private void jButtonRemPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemPorActionPerformed
        
        rimuoviMansione(1);
    }//GEN-LAST:event_jButtonRemPorActionPerformed

    private void jButtonRemDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemDirActionPerformed
        
        rimuoviMansione(2);
    }//GEN-LAST:event_jButtonRemDirActionPerformed

    private void jButtonStanzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStanzeActionPerformed
        
        String struttura = ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome();
        new jDialogGestioneStanza(null, true, struttura, strutturaManager).setVisible(true);
    }//GEN-LAST:event_jButtonStanzeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddDir;
    private javax.swing.JButton jButtonAddPor;
    private javax.swing.JButton jButtonAggiungi;
    private javax.swing.JButton jButtonAgibile;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonRemDir;
    private javax.swing.JButton jButtonRemPor;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonStanze;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDirettore;
    private javax.swing.JLabel jLabelPortinaio;
    private javax.swing.JPanel jPanelInformazioni;
    private javax.swing.JPanel jPanelMansioni;
    private javax.swing.JPanel jPanelOperazioniStruttura;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPaneElenco;
    private javax.swing.JTable jTableStrutture;
    private javax.swing.JTextArea jTextAreaDescrizione;
    private javax.swing.JTextField jTextFieldIndirizzo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPass;
    // End of variables declaration//GEN-END:variables
    
    // GESTIONE STRUTTURA
    private ActionListener addStruttura = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Struttura struttura = creaStruttura();
            strutturaManager.addStruttura(struttura, new ICallbackGeneral());
            ListaStruttura.getIstanza().add(struttura);
            abilita(false);
            caricaElencoStrutture(true);
        }
    };

    private ActionListener updateStruttura = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            Struttura struttura = creaStruttura();
            strutturaManager.updateStruttura(struttura, new ICallbackGeneral());
            ListaStruttura.getIstanza().set(indexSelectedStrutt, struttura);
            abilita(false);
            caricaElencoStrutture(true);
        }
    };

    private void aggiungiStruttura() {

        jTextFieldNome.setText("");
        jTextAreaDescrizione.setText("");
        jTextFieldIndirizzo.setText("");
        abilita(true);

        jButtonConferma.removeActionListener(updateStruttura);
        jButtonConferma.addActionListener(addStruttura);

    }

    private void modificaStruttura() {

        abilita(true);
        jButtonConferma.removeActionListener(addStruttura);
        jButtonConferma.addActionListener(updateStruttura);
    }

    private void eliminaStruttura() {

        int choice = JOptionPane.showConfirmDialog(null, "Rimuovere struttura: "
                + ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome(), null, JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            Struttura toRemove = new Struttura();
            toRemove.setCodiceFiscaleAnagrafica(cfProprietario);
            toRemove.setNome(ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome());
            strutturaManager.deleteStruttura(toRemove, new ICallbackGeneral());
            ListaStruttura.getIstanza().remove(indexSelectedStrutt);
        }
        caricaElencoStrutture(true);
    }

    // GESTIONE MANSIONI
    private void caricaMansioni() {

        ICallback<ArrayList<AnagraficaMansione>> callback = new ICallback<ArrayList<AnagraficaMansione>>() {
            
            public void result(ArrayList<AnagraficaMansione> obj) {

                int nMansioni = obj.size();
                for (int i = 0; i < nMansioni; i++) {
                    switch (obj.get(i).getTipoMansione()) {
                        case Mansioni.PORTINAIO:
                            jLabelPortinaio.setText(obj.get(i).getCodiceFiscaleAnagrafica());
                            jLabelPortinaio.setEnabled(false);
                            jLabelPortinaio.setCursor(Cursor.getDefaultCursor());
                            jButtonRemPor.setEnabled(true);
                            break;
                        case Mansioni.DIRETTORE:
                            jLabelDirettore.setEnabled(false);
                            jLabelDirettore.setCursor(Cursor.getDefaultCursor());
                            jLabelDirettore.setText(obj.get(i).getCodiceFiscaleAnagrafica());
                            jButtonRemDir.setEnabled(true);
                            break;
                    }
                }

                if (!jButtonRemDir.isEnabled()) {
                    jButtonAddDir.setEnabled(true);
                    jTextFieldPass.setEnabled(true);
                }

                if (!jButtonRemPor.isEnabled()) {
                    jButtonAddPor.setEnabled(true);
                    jTextFieldPass.setEnabled(true);
                }
            }
        };

        String nomeStruttura = ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome();
        strutturaManager.readMansioniStruttura(cfProprietario, nomeStruttura, callback);
    }

    private void rimuoviMansione(int tipo) {

        AnagraficaMansione toRemove = new AnagraficaMansione();
        if (tipo == 1) {
            toRemove.setCodiceFiscaleAnagrafica(jLabelPortinaio.getText());
        }
        if (tipo == 2) {
            toRemove.setCodiceFiscaleAnagrafica(jLabelDirettore.getText());
        }

        toRemove.setNomeStruttura(ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome());
        toRemove.setCodiceFiscaleProprietario(cfProprietario);
        
        
        
        new AnagraficaMansioneManager().deleteAnagraficaMansione(toRemove, new ICallbackGeneral());
    }

    private void aggiungiMansione(int tipo) {

        AnagraficaMansione newMansione = new AnagraficaMansione();
        if (tipo == 1) {
            newMansione.setCodiceFiscaleAnagrafica(jLabelPortinaio.getText());
        }
        if (tipo == 2) {
            newMansione.setCodiceFiscaleAnagrafica(jLabelDirettore.getText());
        }

        newMansione.setCodiceFiscaleProprietario(cfProprietario);
        newMansione.setNomeStruttura(ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome());
        newMansione.setTipoMansione(tipo);
        newMansione.setPassword(jTextFieldPass.getText());
        
        

        new AnagraficaMansioneManager().addAnagraficaMansione(newMansione, new ICallbackGeneral());
    }

    // METODI DI SUPPORTO
    private ICallback<Boolean> callbackStrutture = new ICallback<Boolean>() {
        
        public void result(Boolean obj) {
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
    };

    private void caricaElencoStrutture(boolean refresh) {

        if (!refresh) {
            strutturaManager.readStruttureByAnagrafica(cfProprietario, callbackStrutture);
        } else {
            callbackStrutture.result(refresh);
        }
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

    private void visualizzaInfo(int index) {

        Struttura struttura = ListaStruttura.getIstanza().get(index);
        jTextFieldNome.setText(struttura.getNome());
        jTextAreaDescrizione.setText(struttura.getDescrizione());
        jTextFieldIndirizzo.setText(struttura.getIndirizzo());

        if (struttura.getAgibile() == 1) {
            jButtonAgibile.setText("SI");
        } else {
            jButtonAgibile.setText("NO");
        }
    }

    private void abilita(Boolean on) {

        if (on) {
            jTextFieldNome.setEditable(true);
            jTextAreaDescrizione.setEditable(true);
            jTextFieldIndirizzo.setEditable(true);
            jButtonAgibile.setEnabled(true);
            jButtonConferma.setEnabled(true);
        } else {
            jTextFieldNome.setEditable(false);
            jTextAreaDescrizione.setEditable(false);
            jTextFieldIndirizzo.setEditable(false);
            jButtonAgibile.setEnabled(false);
            jButtonConferma.setEnabled(false);
        }
    }

    private Struttura creaStruttura() {

        Struttura newStruttura = new Struttura();

        newStruttura.setCodiceFiscaleAnagrafica(cfProprietario);
        newStruttura.setNome(jTextFieldNome.getText());
        newStruttura.setDescrizione(jTextAreaDescrizione.getText());
        newStruttura.setIndirizzo(jTextFieldIndirizzo.getText());

        if (jButtonAgibile.getText().equals("SI")) {
            newStruttura.setAgibile(1);
        } else {
            newStruttura.setAgibile(0);
        }

        return newStruttura;
    }
}
