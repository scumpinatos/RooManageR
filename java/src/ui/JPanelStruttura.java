package ui;

import cache.ListaStruttura;
import cache.UtenteConnesso;
import constants.Mansioni;
import entities.AnagraficaMansione;
import entities.Struttura;
import interfaces.ICallback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaMansioneManager;
import web_services.StrutturaManager;

public class JPanelStruttura extends javax.swing.JPanel {

    private int indexSelectedStrutt;
    private static StrutturaManager strutturaManager;
    private String cfProprietario;
    private static Struttura tempStruttura;
    private static AnagraficaMansione tempAnagMansione;

    public JPanelStruttura(StrutturaManager manager) {
        strutturaManager = manager;
        cfProprietario = UtenteConnesso.getUtente().getCodiceFiscaleProprietario();
        initComponents();
        readAllStruttura(false);
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
        jButtonCfPor = new javax.swing.JButton();
        jButtonAddPor = new javax.swing.JButton();
        jButtonRemPor = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(640, 438));

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

        jButtonCfPor.setText("Inserisci Codice Fiscale");
        jButtonCfPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCfPorActionPerformed(evt);
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
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCfPor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jButtonCfPor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMansioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddPor)
                    .addComponent(jButtonRemPor))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneElenco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelMansioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelInformazioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelOperazioniStruttura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        readMansioni();
        abilita(false);
    }//GEN-LAST:event_jTableStruttureMouseClicked

    private void jButtonModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificaActionPerformed
        updateStruttura();
    }//GEN-LAST:event_jButtonModificaActionPerformed

    private void jButtonAggiungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiungiActionPerformed
        createStruttura();
    }//GEN-LAST:event_jButtonAggiungiActionPerformed

    private void jButtonRimuoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRimuoviActionPerformed
        deleteStruttura();
    }//GEN-LAST:event_jButtonRimuoviActionPerformed

    private void jButtonAgibileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgibileActionPerformed
        setAgibile();
    }//GEN-LAST:event_jButtonAgibileActionPerformed

    private void jButtonAddPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPorActionPerformed

        createMansione(1);
    }//GEN-LAST:event_jButtonAddPorActionPerformed

    private void jButtonRemPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemPorActionPerformed

        deleteMansione(1);
    }//GEN-LAST:event_jButtonRemPorActionPerformed

    private void jButtonStanzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStanzeActionPerformed

        Struttura struttura = ListaStruttura.getIstanza().get(indexSelectedStrutt);
        JDialogStanza dialog = new JDialogStanza(null, true, struttura);
        dialog.setVisible(true);

    }//GEN-LAST:event_jButtonStanzeActionPerformed

    private void jButtonCfPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCfPorActionPerformed

        new JDialogAnagrafica(null, true, new ICallback<String>() {
            @Override
            public void result(String obj) {
                if (obj != null) {
                    jButtonCfPor.setText(obj);
                    jButtonCfPor.setEnabled(false);
                }
            }
        }).setVisible(true);
    }//GEN-LAST:event_jButtonCfPorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddPor;
    private javax.swing.JButton jButtonAggiungi;
    private javax.swing.JButton jButtonAgibile;
    private javax.swing.JButton jButtonCfPor;
    private javax.swing.JButton jButtonConferma;
    private javax.swing.JButton jButtonModifica;
    private javax.swing.JButton jButtonRemPor;
    private javax.swing.JButton jButtonRimuovi;
    private javax.swing.JButton jButtonStanze;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
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

    // CRUD STRUTTURA
    private ActionListener createStruttura = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            ICallback<Struttura> callback = new ICallback<Struttura>() {
                @Override
                public void result(Struttura obj) {

                    if (obj == null) {
                        ListaStruttura.getIstanza().add(tempStruttura);
                        abilita(false);
                        readAllStruttura(true);
                    }
                }
            };

            if (verificaNome(jTextFieldNome.getText())) {
                tempStruttura = creaStruttura();
                strutturaManager.createStruttura(tempStruttura, callback);
            } else {
                JOptionPane.showMessageDialog(null, "Nome inserito già presente in archivio.");
            }
        }
    };

    private ActionListener updateStruttura = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            ICallback<Struttura> callback = new ICallback<Struttura>() {
                @Override
                public void result(Struttura obj) {
                    if (obj == null) {
                        ListaStruttura.getIstanza().set(indexSelectedStrutt, tempStruttura);
                        abilita(false);
                        readAllStruttura(true);
                    }
                }
            };

            if (jButtonAgibile.getText().equals("NO")
                    && ListaStruttura.getIstanza().get(indexSelectedStrutt).getnStanze() != 0) {
                JOptionPane.showMessageDialog(null, "Rimuovere le stanze prima\n di rendere inagibile la struttura");
            } else {
                tempStruttura = creaStruttura();
                strutturaManager.updateStruttura(tempStruttura, callback);
            }
        }
    };

    private void createStruttura() {

        jTextFieldNome.setText("");
        jTextFieldNome.setEditable(true);
        jTextAreaDescrizione.setText("");
        jTextFieldIndirizzo.setText("");
        abilita(true);

        jButtonConferma.removeActionListener(updateStruttura);
        jButtonConferma.addActionListener(createStruttura);

    }

    private void updateStruttura() {

        abilita(true);
        jTextFieldNome.setEnabled(false);
        jButtonConferma.removeActionListener(createStruttura);
        jButtonConferma.addActionListener(updateStruttura);
    }

    private void readAllStruttura(boolean refresh) {

        ICallback<Boolean> callback = new ICallback<Boolean>() {

            public void result(Boolean obj) {
                ListaStruttura strutture = ListaStruttura.getIstanza();
                int nStru = strutture.size();

                String[] colonne = new String[5];
                colonne[0] = "Nome";
                colonne[1] = "Indirizzo";
                colonne[2] = "Agibile";
                colonne[3] = "Descrizione";
                colonne[4] = "Numero stanze";

                Object[][] data = new Object[nStru][5];

                for (int i = 0; i < nStru; i++) {
                    data[i][0] = strutture.get(i).getNome();
                    data[i][1] = strutture.get(i).getIndirizzo();
                    data[i][2] = traduciBoolean(strutture.get(i).getAgibile());
                    data[i][3] = strutture.get(i).getDescrizione();
                    data[i][4] = strutture.get(i).getnStanze();
                }

                TableModel model = new DefaultTableModel(data, colonne);
                jTableStrutture.setModel(model);
            }
        };

        if (!refresh) {
            strutturaManager.readStruttureByAnagrafica(cfProprietario, callback);
        } else {
            callback.result(refresh);
        }
    }

    private void deleteStruttura() {

        ICallback<Struttura> callback = new ICallback<Struttura>() {
            @Override
            public void result(Struttura obj) {
                if (obj == null) {
                    ListaStruttura.getIstanza().remove(indexSelectedStrutt);
                    abilita(false);
                    readAllStruttura(true);
                }
            }
        };

        if (ListaStruttura.getIstanza().get(indexSelectedStrutt).getnStanze() != 0) {
            JOptionPane.showMessageDialog(null, "Rimuovere prima tutte le stanze dalla struttura");
            return;
        }
        int choice = JOptionPane.showConfirmDialog(null, "Rimuovere struttura: "
                + ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome(), null, JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.OK_OPTION) {
            tempStruttura = new Struttura();
            tempStruttura.setCodiceFiscaleAnagrafica(cfProprietario);
            tempStruttura.setNome(ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome());
            strutturaManager.deleteStruttura(tempStruttura, callback);
        }
    }

    // CRUD ANAGRAFICA MANSIONI
    private void createMansione(int tipo) {

        String messaggio = "Controllare i valori inseriti";
        if (tipo == 1) {
            if (jButtonCfPor.isEnabled()) {
                JOptionPane.showMessageDialog(null, messaggio);
                return;
            }
        }

        if (jTextFieldPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, messaggio);
            return;
        }

        ICallback<AnagraficaMansione> callbackAnagMans = new ICallback<AnagraficaMansione>() {
            @Override
            public void result(AnagraficaMansione obj) {

                if (obj == null) {
                    readMansioni();
                }
            }
        };

        tempAnagMansione = new AnagraficaMansione();
        if (tipo == 1) {
            tempAnagMansione.setCodiceFiscaleAnagrafica(jButtonCfPor.getText());
        }

        tempAnagMansione.setCodiceFiscaleProprietario(cfProprietario);
        tempAnagMansione.setNomeStruttura(ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome());
        tempAnagMansione.setTipoMansione(tipo);
        tempAnagMansione.setPassword(jTextFieldPass.getText());

        new AnagraficaMansioneManager().addAnagraficaMansione(tempAnagMansione, callbackAnagMans);
    }

    private void readMansioni() {

        ICallback<ArrayList<AnagraficaMansione>> callbackReadAnagMans = new ICallback<ArrayList<AnagraficaMansione>>() {

            public void result(ArrayList<AnagraficaMansione> obj) {

                if (obj == null) {
                    jButtonAddPor.setEnabled(true);
                    jTextFieldPass.setEnabled(true);
                    jTextFieldPass.setText("");
                } else {
                    int nMansioni = obj.size();
                    for (int i = 0; i < nMansioni; i++) {
                        switch (obj.get(i).getTipoMansione()) {
                            case Mansioni.PORTINAIO:
                                jButtonCfPor.setText(obj.get(i).getCodiceFiscaleAnagrafica());
                                jButtonCfPor.setEnabled(false);
                                jButtonRemPor.setEnabled(true);
                                jButtonAddPor.setEnabled(false);
                                break;
                        }
                    }
                }

                if (!jButtonRemPor.isEnabled()) {
                    jButtonAddPor.setEnabled(true);
                    jButtonCfPor.setText("Inserisci Codice Fiscale");
                    jButtonCfPor.setEnabled(true);
                    jTextFieldPass.setEnabled(true);
                }
            }
        };

        String nomeStruttura = ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome();
        strutturaManager.readMansioniStruttura(cfProprietario, nomeStruttura, callbackReadAnagMans);
    }

    private void deleteMansione(int tipo) {

        ICallback<AnagraficaMansione> callbackAnagMans = new ICallback<AnagraficaMansione>() {
            @Override
            public void result(AnagraficaMansione obj) {

                if (obj == null) {
                    jButtonRemPor.setEnabled(false);
                    readMansioni();
                }
            }
        };

        tempAnagMansione = new AnagraficaMansione();
        if (tipo == 1) {
            tempAnagMansione.setCodiceFiscaleAnagrafica(jButtonCfPor.getText());
        }

        tempAnagMansione.setNomeStruttura(ListaStruttura.getIstanza().get(indexSelectedStrutt).getNome());
        tempAnagMansione.setCodiceFiscaleProprietario(cfProprietario);

        new AnagraficaMansioneManager().deleteAnagraficaMansione(tempAnagMansione, callbackAnagMans);
    }

    // METODI DI SUPPORTO
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
            jTextAreaDescrizione.setEditable(true);
            jTextFieldIndirizzo.setEditable(true);
            jButtonAgibile.setEnabled(true);
            jButtonConferma.setEnabled(true);
        } else {
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

    private Boolean verificaNome(String nome) {

        int n = ListaStruttura.getIstanza().size();
        if (n == 0) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (ListaStruttura.getIstanza().get(i).getNome().equals(nome)) {
                return false;
            } else {
                return true;
            }
        }
        return null;
    }

    private void setAgibile() {
        String text = jButtonAgibile.getText();
        if (text.equals("SI")) {
            jButtonAgibile.setText("NO");
        } else {
            jButtonAgibile.setText("SI");
        }
    }
}
