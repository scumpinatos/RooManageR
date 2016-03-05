package ui;

import cache.lists.ListaStanza;
import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import constants.TipiStanza;
import entities.AnagraficaStanza;
import entities.Stanza;
import interfaces.ICallback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaStanzaManager;
import web_services.StanzaManager;
import web_services.StrutturaManager;

public class JPanelAnagStanza extends javax.swing.JPanel {
    
    private static AnagraficaStanza temp;
    private static StrutturaManager strutturaManager;
    private static AnagraficaStanzaManager anagStaManager;
    private int selectedStanza;

    public JPanelAnagStanza(StrutturaManager manager, Boolean mode) {

        strutturaManager = manager;
        anagStaManager = new AnagraficaStanzaManager();
        temp = new AnagraficaStanza();
        temp.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleProprietario());
        initComponents();

        if(mode) {
            caricaStrutture();
        } else {
            jComboBoxStrutture.setVisible(false);
            temp.setNomeStruttura(UtenteConnesso.getUtente().getNomeStruttura());
            caricaStanze(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelElenco = new javax.swing.JPanel();
        jComboBoxStrutture = new javax.swing.JComboBox<>();
        jButtonAggiorna = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableStanze = new javax.swing.JTable();
        jPanelOperazioni = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldStanza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelCf = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIngresso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonInizioPermanenza = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldIngresso1 = new javax.swing.JTextField();
        jLabelCf1 = new javax.swing.JLabel();
        jButtonInizioVisita = new javax.swing.JButton();

        setName("Gestione Clienti"); // NOI18N
        setPreferredSize(new java.awt.Dimension(680, 480));

        jButtonAggiorna.setText("Aggiorna");
        jButtonAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggiornaActionPerformed(evt);
            }
        });

        jTableStanze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableStanze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableStanzeMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableStanze);

        javax.swing.GroupLayout jPanelElencoLayout = new javax.swing.GroupLayout(jPanelElenco);
        jPanelElenco.setLayout(jPanelElencoLayout);
        jPanelElencoLayout.setHorizontalGroup(
            jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElencoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelElencoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(438, Short.MAX_VALUE)))
        );
        jPanelElencoLayout.setVerticalGroup(
            jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAggiorna)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelElencoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(186, Short.MAX_VALUE)))
        );

        jPanelOperazioni.setName(""); // NOI18N

        jLabel12.setText("Stanza");

        jTextFieldStanza.setEditable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codice fiscale");

        jLabelCf.setFont(new java.awt.Font("Droid Sans", 2, 12)); // NOI18N
        jLabelCf.setForeground(java.awt.Color.blue);
        jLabelCf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCf.setText("Inserisci Codice Fiscale");
        jLabelCf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCfMouseClicked(evt);
            }
        });

        jLabel13.setText("Data e ora ingresso ");

        jTextFieldIngresso.setEditable(false);
        jTextFieldIngresso.setVerifyInputWhenFocusTarget(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Permanenza");

        jButtonInizioPermanenza.setText("Inizio");
        jButtonInizioPermanenza.setEnabled(false);
        jButtonInizioPermanenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioPermanenzaActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Visita");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codice fiscale");

        jLabel15.setText("Data e ora ingresso ");

        jTextFieldIngresso1.setEditable(false);
        jTextFieldIngresso1.setVerifyInputWhenFocusTarget(false);

        jLabelCf1.setFont(new java.awt.Font("Droid Sans", 2, 12)); // NOI18N
        jLabelCf1.setForeground(java.awt.Color.blue);
        jLabelCf1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCf1.setText("Inserisci Codice Fiscale");
        jLabelCf1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCf1MouseClicked(evt);
            }
        });

        jButtonInizioVisita.setText("Inizio");
        jButtonInizioVisita.setToolTipText("");
        jButtonInizioVisita.setEnabled(false);
        jButtonInizioVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioVisitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperazioniLayout = new javax.swing.GroupLayout(jPanelOperazioni);
        jPanelOperazioni.setLayout(jPanelOperazioniLayout);
        jPanelOperazioniLayout.setHorizontalGroup(
            jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelCf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInizioPermanenza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperazioniLayout.createSequentialGroup()
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIngresso1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperazioniLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jButtonInizioVisita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOperazioniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
        );
        jPanelOperazioniLayout.setVerticalGroup(
            jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12)
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCf)
                            .addComponent(jLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCf1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIngresso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)))
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                        .addComponent(jButtonInizioPermanenza)
                        .addContainerGap())
                    .addComponent(jButtonInizioVisita, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelOperazioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOperazioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableStanzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStanzeMouseClicked

        selectedStanza = ((JTable) evt.getSource()).getSelectedRow();
        Stanza selezionata = ListaStanza.getIstanza().get(selectedStanza);
        jTextFieldStanza.setText(selezionata.getNumero());
        if(selezionata.getPermanenza() == 0)
            nuovaPermanenza();
        else if(selezionata.getVisita() == 0)
            nuovaVisita();
    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButtonInizioPermanenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioPermanenzaActionPerformed
        createPermanenza();
    }//GEN-LAST:event_jButtonInizioPermanenzaActionPerformed

    private void jButtonInizioVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioVisitaActionPerformed
        createVisita();
    }//GEN-LAST:event_jButtonInizioVisitaActionPerformed

    private void jLabelCfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCfMouseClicked
        
        new UIAnagrafica(null, true, new ICallback<String>() {
            
            public void result(String obj) {
                if (obj != null) {
                    jLabelCf.setText(obj);
                    jLabelCf.setEnabled(false);
                }
            }
        }).setVisible(true);
    }//GEN-LAST:event_jLabelCfMouseClicked

    private void jLabelCf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCf1MouseClicked
        
        new UIAnagrafica(null, true, new ICallback<String>() {
            
            public void result(String obj) {
                if (obj != null) {
                    jLabelCf1.setText(obj);
                    jLabelCf1.setEnabled(false);
                }
            }
        }).setVisible(true);
    }//GEN-LAST:event_jLabelCf1MouseClicked

    private void jButtonAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiornaActionPerformed
        caricaStanze(false);
    }//GEN-LAST:event_jButtonAggiornaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiorna;
    private javax.swing.JButton jButtonInizioPermanenza;
    private javax.swing.JButton jButtonInizioVisita;
    private javax.swing.JComboBox<String> jComboBoxStrutture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCf;
    private javax.swing.JLabel jLabelCf1;
    private javax.swing.JPanel jPanelElenco;
    private javax.swing.JPanel jPanelOperazioni;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTextField jTextFieldIngresso;
    private javax.swing.JTextField jTextFieldIngresso1;
    private javax.swing.JTextField jTextFieldStanza;
    // End of variables declaration//GEN-END:variables
    
    private void createPermanenza() {
        
        if(jLabelCf.getText().equals("Inserisci Codice Fiscale")) {
            JOptionPane.showMessageDialog(null, "Inserire un codice fiscale");
            return;
        }
        
        ICallback<AnagraficaStanza> callback = new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                if(obj == null) {
                    aggiornaStanza(1);
                    jLabelCf.setText("Inserisci Codice Fiscale");
                    String message = "Permanenza aggiunta al database";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        };
                
        AnagraficaStanza permanenza = temp;
        permanenza.setCodiceFiscaleAnagrafica(jLabelCf.getText());
        permanenza.setIngresso(jTextFieldIngresso.getText());
        permanenza.setNumeroStanza(jTextFieldStanza.getText());
        permanenza.setTipo(1);
        anagStaManager.addAnagraficaStanza(permanenza, callback);
        
    }
    
    private void createVisita() {
        
        if(jLabelCf1.getText().equals("Inserisci Codice Fiscale")) {
            JOptionPane.showMessageDialog(null, "Inserire un codice fiscale");
            return;
        }
        
        ICallback<AnagraficaStanza> callback = new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                aggiornaStanza(2);
                jLabelCf1.setText("Inserisci Codice Fiscale");
                String message = "Visita aggiunta al database";
                JOptionPane.showMessageDialog(null, message);
            }
        };
        
        AnagraficaStanza visita = temp;
        visita.setCodiceFiscaleAnagrafica(jLabelCf1.getText());
        visita.setIngresso(jTextFieldIngresso1.getText());
        visita.setNumeroStanza(jTextFieldStanza.getText());
        visita.setTipo(2);
        anagStaManager.addAnagraficaStanza(visita, callback);
    }
    
    private void nuovaPermanenza() {

        jButtonInizioPermanenza.setEnabled(true);
        jTextFieldIngresso.setEnabled(true);
        jButtonInizioVisita.setEnabled(false);
        jTextFieldIngresso1.setEnabled(false);
        dataOraAttuale(jTextFieldIngresso);
        jButtonInizioPermanenza.setEnabled(true);
    }

    private void nuovaVisita() {

        jButtonInizioPermanenza.setEnabled(false);
        jTextFieldIngresso.setEnabled(false);
        jButtonInizioVisita.setEnabled(true);
        jTextFieldIngresso1.setEnabled(true);
        dataOraAttuale(jTextFieldIngresso1);
        jButtonInizioVisita.setEnabled(true);
    }

    private void caricaStrutture() {

        ICallback<Boolean> callback = new ICallback<Boolean>() {
            
            public void result(Boolean obj) {
                ListaStruttura strutture = ListaStruttura.getIstanza();
                int n = strutture.size();

                Vector<String> items = new Vector<>();
                items.add("Selezionare una struttura...");
                for (int i = 0; i < n; i++) {
                    items.add(strutture.get(i).getNome());
                }

                jComboBoxStrutture.setModel(new DefaultComboBoxModel<String>(items));
                jComboBoxStrutture.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.setNomeStruttura((String) jComboBoxStrutture.getSelectedItem());
                        caricaStanze(false);
                    }
                });

            }
        };

        strutturaManager.readStruttureByAnagrafica(temp.getCodiceFiscaleProprietario(), callback);
    }

    private void caricaStanze(Boolean refresh) {

        ICallback<Boolean> callback = new ICallback<Boolean>() {
            
            @Override
            public void result(Boolean obj) {
                ListaStanza stanze = ListaStanza.getIstanza();
                int nSta = stanze.size();

                String[] colonne = new String[6];
                colonne[0] = "Numero";
                colonne[1] = "Tipo";
                colonne[2] = "Mq";
                colonne[3] = "Agibile";
                colonne[4] = "Permanenza";
                colonne[5] = "Visita";

                Object[][] data = new Object[nSta][6];

                for (int i = 0; i < nSta; i++) {
                    data[i][0] = stanze.get(i).getNumero();
                    data[i][1] = getStringTipo(stanze.get(i).getTipo());
                    data[i][2] = stanze.get(i).getMq();
                    data[i][3] = traduciBoolean(stanze.get(i).getAgibile());
                    data[i][4] = traduciBoolean(stanze.get(i).getPermanenza());
                    data[i][5] = traduciBoolean(stanze.get(i).getVisita());
                }

                TableModel model = new DefaultTableModel(data, colonne);
                jTableStanze.setModel(model);
            }
        };

        if(!refresh)
            new StanzaManager().readStanzeStruttura(temp.getNomeStruttura(), temp.getCodiceFiscaleProprietario(), callback);
        else
            callback.result(refresh);

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
    
    private void dataOraAttuale(JTextField output) {

        String now = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime());
        output.setText(now);
    }

    private void aggiornaStanza(int tipo) {
        
        ICallback<Stanza> callback = new ICallback<Stanza>() {
            @Override
            public void result(Stanza obj) {
                caricaStanze(true);
            }
        };
        
        Stanza toUpdate = ListaStanza.getIstanza().get(selectedStanza);
        if(tipo == 1)
            toUpdate.setPermanenza(1);
        else if(tipo == 2)
            toUpdate.setVisita(1);
        new StanzaManager().occupaStanza(toUpdate, callback);
    }
}
