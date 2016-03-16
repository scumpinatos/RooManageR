package ui;

import cache.ListaStanza;
import cache.ListaStruttura;
import cache.UtenteConnesso;
import constants.TipiStanza;
import entities.AnagraficaStanza;
import entities.Stanza;
import interfaces.ICallback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    private boolean mode;

    public JPanelAnagStanza(StrutturaManager manager, Boolean mode) {

        strutturaManager = manager;
        anagStaManager = new AnagraficaStanzaManager();
        temp = new AnagraficaStanza();
        temp.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleProprietario());
        this.mode = mode;
        initComponents();

        if(mode) {
            caricaStrutture();
        } else {
            jComboBoxStrutture.setVisible(false);
            temp.setNomeStruttura(UtenteConnesso.getUtente().getNomeStruttura());
            caricaStanze();
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
        jLabel3 = new javax.swing.JLabel();
        jButtonCf = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldIngresso = new javax.swing.JTextField();
        jButtonInizioPermanenza = new javax.swing.JButton();
        jButtonInizioVisita = new javax.swing.JButton();

        setName("Gestione Clienti"); // NOI18N
        setPreferredSize(new java.awt.Dimension(660, 480));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                    .addGroup(jPanelElencoLayout.createSequentialGroup()
                        .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelElencoLayout.setVerticalGroup(
            jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAggiorna)
                    .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOperazioni.setName(""); // NOI18N

        jLabel12.setText("Stanza");

        jTextFieldStanza.setEditable(false);

        jLabel3.setText("Codice fiscale");

        jButtonCf.setText("Inserisci Codice Fiscale");
        jButtonCf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCfActionPerformed(evt);
            }
        });

        jLabel15.setText("Data e ora ingresso ");

        jTextFieldIngresso.setVerifyInputWhenFocusTarget(false);

        jButtonInizioPermanenza.setText("Aggiungi permanenza");
        jButtonInizioPermanenza.setEnabled(false);
        jButtonInizioPermanenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioPermanenzaActionPerformed(evt);
            }
        });

        jButtonInizioVisita.setText("Aggiungi visita");
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
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                        .addComponent(jButtonInizioPermanenza, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInizioVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanelOperazioniLayout.setVerticalGroup(
            jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCf)
                    .addComponent(jLabel3))
                .addGap(54, 54, 54)
                .addGroup(jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInizioPermanenza)
                    .addComponent(jButtonInizioVisita))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOperazioni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        if(selezionata.getAgibile() == 0) 
            stanzaInagibile();
        else if(selezionata.getPermanenza() == 0)
            nuovaPermanenza();
        else if(selezionata.getVisita() == 0)
            nuovaVisita();
        else {
            jButtonInizioVisita.setEnabled(false);
            jButtonInizioPermanenza.setEnabled(false);
        }
    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButtonInizioPermanenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioPermanenzaActionPerformed
        createPermanenza();
    }//GEN-LAST:event_jButtonInizioPermanenzaActionPerformed

    private void jButtonInizioVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioVisitaActionPerformed
        createVisita();
    }//GEN-LAST:event_jButtonInizioVisitaActionPerformed

    private void jButtonAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiornaActionPerformed
        if(mode)
            caricaStrutture();
        else
            caricaStanze();
    }//GEN-LAST:event_jButtonAggiornaActionPerformed

    private void jButtonCfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCfActionPerformed
        new JDialogAnagrafica(null, true, new ICallback<String>() {
            @Override
            public void result(String obj) {
                if(obj != null) {
                    jButtonCf.setText(obj);
                    jButtonCf.setEnabled(false);
                }
            }
        }).setVisible(true);
    }//GEN-LAST:event_jButtonCfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiorna;
    private javax.swing.JButton jButtonCf;
    private javax.swing.JButton jButtonInizioPermanenza;
    private javax.swing.JButton jButtonInizioVisita;
    private javax.swing.JComboBox<String> jComboBoxStrutture;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelElenco;
    private javax.swing.JPanel jPanelOperazioni;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTextField jTextFieldIngresso;
    private javax.swing.JTextField jTextFieldStanza;
    // End of variables declaration//GEN-END:variables
    
    private void createPermanenza() {
        
        if(jButtonCf.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Inserire un codice fiscale");
            return;
        }
        
        ICallback<AnagraficaStanza> callback = new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                if(obj == null) {
                    aggiornaStanza(1);
                    jButtonCf.setText("Inserisci Codice Fiscale");
                    jButtonCf.setEnabled(true);
                    String message = "Permanenza aggiunta al database";
                    JOptionPane.showMessageDialog(null, message);
                }
            }
        };
                
        AnagraficaStanza permanenza = temp;
        permanenza.setCodiceFiscaleAnagrafica(jButtonCf.getText());
        permanenza.setIngresso(jTextFieldIngresso.getText());
        permanenza.setNumeroStanza(jTextFieldStanza.getText());
        permanenza.setTipo(1);
        anagStaManager.addAnagraficaStanza(permanenza, callback);
        
    }
    
    private void createVisita() {
        
        if(jButtonCf.isEnabled()) {
            JOptionPane.showMessageDialog(null, "Inserire un codice fiscale");
            return;
        }
        
        ICallback<AnagraficaStanza> callback = new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                aggiornaStanza(2);
                jButtonCf.setText("Inserisci Codice Fiscale");
                jButtonCf.setEnabled(true);
                String message = "Visita aggiunta al database";
                JOptionPane.showMessageDialog(null, message);
            }
        };
        
        AnagraficaStanza visita = temp;
        visita.setCodiceFiscaleAnagrafica(jButtonCf.getText());
        visita.setIngresso(jTextFieldIngresso.getText());
        visita.setNumeroStanza(jTextFieldStanza.getText());
        visita.setTipo(2);
        anagStaManager.addAnagraficaStanza(visita, callback);
    }
    
    private void nuovaPermanenza() {

        jButtonCf.setEnabled(true);
        jTextFieldIngresso.setEnabled(true);        
        jButtonInizioPermanenza.setEnabled(true);
        jButtonInizioVisita.setEnabled(false);
    }

    private void nuovaVisita() {

        jButtonCf.setEnabled(true);
        jTextFieldIngresso.setEnabled(true);
        jButtonInizioPermanenza.setEnabled(false);
        jButtonInizioVisita.setEnabled(true);
    }
    
    private void stanzaInagibile() {
        
        jButtonInizioPermanenza.setEnabled(false);
        jButtonInizioVisita.setEnabled(false);
        jButtonCf.setEnabled(false);
        jTextFieldIngresso.setEnabled(false);
        jTextFieldStanza.setEnabled(false);
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
                        caricaStanze();
                    }
                });

            }
        };

        strutturaManager.readStruttureByAnagrafica(temp.getCodiceFiscaleProprietario(), callback);
    }

    private void caricaStanze() {

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

        new StanzaManager().readStanzeStruttura(temp.getNomeStruttura(), temp.getCodiceFiscaleProprietario(), callback);

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
    
    private void aggiornaStanza(int tipo) {
        
        ICallback<Stanza> callback = new ICallback<Stanza>() {
            @Override
            public void result(Stanza obj) {
                caricaStanze();
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
