package ui;

import cache.lists.ListaStanza;
import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import constants.TipiStanza;
import entities.AnagraficaStanza;
import entities.Stanza;
import interfaces.ICallback;
import interfaces.ICallbackGeneral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.AnagraficaStanzaManager;
import web_services.StanzaManager;
import web_services.StrutturaManager;

public class JPanelElencoStanza extends javax.swing.JPanel {
    
    private static AnagraficaStanza permanenza, visita, temp;
    private static StrutturaManager strutturaManager;
    private static AnagraficaStanzaManager anagStaManager;
    private int selectedStanza;

    public JPanelElencoStanza(StrutturaManager manager, Boolean mode) {

        strutturaManager = manager;
        anagStaManager = new AnagraficaStanzaManager();
        temp = new AnagraficaStanza();
        temp.setCodiceFiscaleProprietario(UtenteConnesso.getUtente().getCodiceFiscaleProprietario());
        initComponents();

        if(mode) {
            caricaStruttureComboBox();
        } else {
            jComboBoxStrutture.setVisible(false);
            temp.setNomeStruttura(UtenteConnesso.getUtente().getNomeStruttura());
            caricaElencoStanze(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelElenco = new javax.swing.JPanel();
        jComboBoxStrutture = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableStanze = new javax.swing.JTable();
        jPanelOperazioni = new javax.swing.JPanel();
        jPanelPermanenza = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldStanza = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelCf = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIngresso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUscita = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCosto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonInizioPermanenza = new javax.swing.JButton();
        jButtonFinePermanenza = new javax.swing.JButton();
        jPanelVisita = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldStanza1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldIngresso1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUscita1 = new javax.swing.JTextField();
        jButtonInizioVisita = new javax.swing.JButton();
        jButtonFineVisita = new javax.swing.JButton();
        jLabelCf1 = new javax.swing.JLabel();

        setName("Gestione Clienti"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 480));

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
            .addGap(0, 648, Short.MAX_VALUE)
            .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelElencoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        jPanelElencoLayout.setVerticalGroup(
            jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
            .addGroup(jPanelElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelElencoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        jLabel4.setText("Data ed ora uscita");

        jTextFieldUscita.setEditable(false);
        jTextFieldUscita.setEnabled(false);

        jLabel5.setText("Costo");

        jTextFieldCosto.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Permanenza");

        jButtonInizioPermanenza.setText("Inizio");
        jButtonInizioPermanenza.setEnabled(false);
        jButtonInizioPermanenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioPermanenzaActionPerformed(evt);
            }
        });

        jButtonFinePermanenza.setText("Fine");
        jButtonFinePermanenza.setEnabled(false);
        jButtonFinePermanenza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinePermanenzaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPermanenzaLayout = new javax.swing.GroupLayout(jPanelPermanenza);
        jPanelPermanenza.setLayout(jPanelPermanenzaLayout);
        jPanelPermanenzaLayout.setHorizontalGroup(
            jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPermanenzaLayout.createSequentialGroup()
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPermanenzaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonInizioPermanenza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPermanenzaLayout.createSequentialGroup()
                                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelPermanenzaLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButtonFinePermanenza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCf, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextFieldUscita, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.Alignment.LEADING)))))))))
                .addContainerGap())
        );
        jPanelPermanenzaLayout.setVerticalGroup(
            jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPermanenzaLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUscita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelPermanenzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInizioPermanenza)
                    .addComponent(jButtonFinePermanenza))
                .addContainerGap())
        );

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Visita");

        jLabel14.setText("Stanza");

        jTextFieldStanza1.setEditable(false);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codice fiscale");

        jLabel15.setText("Data e ora ingresso ");

        jTextFieldIngresso1.setEditable(false);
        jTextFieldIngresso1.setVerifyInputWhenFocusTarget(false);

        jLabel6.setText("Data ed ora uscita");

        jTextFieldUscita1.setEditable(false);
        jTextFieldUscita1.setEnabled(false);

        jButtonInizioVisita.setText("Inizio");
        jButtonInizioVisita.setToolTipText("");
        jButtonInizioVisita.setEnabled(false);
        jButtonInizioVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInizioVisitaActionPerformed(evt);
            }
        });

        jButtonFineVisita.setText("Fine");
        jButtonFineVisita.setEnabled(false);
        jButtonFineVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFineVisitaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanelVisitaLayout = new javax.swing.GroupLayout(jPanelVisita);
        jPanelVisita.setLayout(jPanelVisitaLayout);
        jPanelVisitaLayout.setHorizontalGroup(
            jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelVisitaLayout.createSequentialGroup()
                        .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVisitaLayout.createSequentialGroup()
                                .addComponent(jButtonInizioVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonFineVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVisitaLayout.createSequentialGroup()
                                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldStanza1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldUscita1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(jTextFieldIngresso1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabelCf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        jPanelVisitaLayout.setVerticalGroup(
            jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVisitaLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStanza1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCf1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIngresso1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUscita1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelVisitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFineVisita)
                    .addComponent(jButtonInizioVisita))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelOperazioniLayout = new javax.swing.GroupLayout(jPanelOperazioni);
        jPanelOperazioni.setLayout(jPanelOperazioniLayout);
        jPanelOperazioniLayout.setHorizontalGroup(
            jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelPermanenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelOperazioniLayout.setVerticalGroup(
            jPanelOperazioniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperazioniLayout.createSequentialGroup()
                .addComponent(jPanelPermanenza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanelVisita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelOperazioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelOperazioni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableStanzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableStanzeMouseClicked

        selectedStanza = ((JTable) evt.getSource()).getSelectedRow();
        temp.setNumeroStanza(ListaStanza.getIstanza().get(selectedStanza).getNumero());
        caricaInformazioni();
    }//GEN-LAST:event_jTableStanzeMouseClicked

    private void jButtonInizioPermanenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioPermanenzaActionPerformed

        permanenza.setCodiceFiscaleAnagrafica(jLabelCf.getText());
        permanenza.setIngresso(jTextFieldIngresso.getText());
        permanenza.setTipo(1);
        anagStaManager.addAnagraficaStanza(permanenza, new ICallbackGeneral());
        aggiornaStanza(false);
    }//GEN-LAST:event_jButtonInizioPermanenzaActionPerformed

    private void jButtonFinePermanenzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinePermanenzaActionPerformed

        permanenza.setUscita(jTextFieldUscita.getText());
        permanenza.setCosto(Float.parseFloat(jTextFieldCosto.getText()));
        anagStaManager.updatePermanenza(permanenza, new ICallbackGeneral());
        aggiornaStanza(true);
    }//GEN-LAST:event_jButtonFinePermanenzaActionPerformed

    private void jButtonInizioVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInizioVisitaActionPerformed

        visita.setCodiceFiscaleAnagrafica(jLabelCf1.getText());
        visita.setIngresso(jTextFieldIngresso1.getText());
        visita.setTipo(2);
        anagStaManager.addAnagraficaStanza(visita, new ICallbackGeneral());
    }//GEN-LAST:event_jButtonInizioVisitaActionPerformed

    private void jButtonFineVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFineVisitaActionPerformed

        visita.setUscita(jTextFieldUscita1.getText());
        anagStaManager.updateVisita(visita, new ICallbackGeneral());
    }//GEN-LAST:event_jButtonFineVisitaActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinePermanenza;
    private javax.swing.JButton jButtonFineVisita;
    private javax.swing.JButton jButtonInizioPermanenza;
    private javax.swing.JButton jButtonInizioVisita;
    private javax.swing.JComboBox<String> jComboBoxStrutture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCf;
    private javax.swing.JLabel jLabelCf1;
    private javax.swing.JPanel jPanelElenco;
    private javax.swing.JPanel jPanelOperazioni;
    private javax.swing.JPanel jPanelPermanenza;
    private javax.swing.JPanel jPanelVisita;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableStanze;
    private javax.swing.JTextField jTextFieldCosto;
    private javax.swing.JTextField jTextFieldIngresso;
    private javax.swing.JTextField jTextFieldIngresso1;
    private javax.swing.JTextField jTextFieldStanza;
    private javax.swing.JTextField jTextFieldStanza1;
    private javax.swing.JTextField jTextFieldUscita;
    private javax.swing.JTextField jTextFieldUscita1;
    // End of variables declaration//GEN-END:variables

    private void caricaInformazioni() {

        if (ListaStanza.getIstanza().get(selectedStanza).getLibera() == 1) {
            
            permanenza = temp;
            nuovaPermanenza(permanenza);
            
        } else {
            
            anagStaManager.readAnagraficaStanza(temp, new ICallback<AnagraficaStanza>() {
                
                public void result(AnagraficaStanza obj) {
                    
                    permanenza = obj;
                    aggiornaPermanenza(obj);
                }
            });
            
            anagStaManager.checkVisitaInCorso(temp, new ICallback<AnagraficaStanza>() {
                
                public void result(AnagraficaStanza obj) {
                    
                    if(obj != null) {
                        aggiornaVisita(obj);
                        visita = obj;
                    } else {
                        visita = temp;
                        nuovaVisita(visita);
                    }
                }
            });
        }
    }
    
    private void nuovaPermanenza(AnagraficaStanza input) {

        jButtonInizioPermanenza.setEnabled(true);

        jTextFieldStanza.setText(input.getNumeroStanza());
        dataOraAttuale(jTextFieldIngresso);
    }

    private void nuovaVisita(AnagraficaStanza input) {

        jButtonInizioVisita.setEnabled(true);

        jTextFieldStanza1.setText(input.getNumeroStanza());
        dataOraAttuale(jTextFieldIngresso1);
    }

    private void aggiornaPermanenza(AnagraficaStanza input) {

        jButtonFinePermanenza.setEnabled(true);

        jTextFieldStanza.setText(input.getNumeroStanza());
        jLabelCf.setText(input.getCodiceFiscaleAnagrafica());
        jTextFieldIngresso.setText(input.getIngresso());
        dataOraAttuale(jTextFieldUscita);
        jTextFieldCosto.setEnabled(true);
    }

    private void aggiornaVisita(AnagraficaStanza input) {

        jButtonFineVisita.setEnabled(true);

        jTextFieldStanza1.setText(input.getNumeroStanza());
        jLabelCf1.setText(input.getCodiceFiscaleAnagrafica());
        jTextFieldIngresso1.setText(input.getIngresso());
        dataOraAttuale(jTextFieldUscita1);
    }
    
    private void caricaStruttureComboBox() {

        // IL CALLBACK VISUALIZZA LE INFORMAZIONI DOPO CHE SONO STATE SCARICATE
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
                        caricaElencoStanze(false);
                    }
                });

            }
        };

        strutturaManager.readStruttureByAnagrafica(temp.getCodiceFiscaleProprietario(), callback);
    }

    // METODI DI SUPPORTO
    private void caricaElencoStanze(Boolean refresh) {

        // IL CALLBACK VISUALIZZA LE INFORMAZIONI DOPO CHE SONO STATE SCARICATE
        ICallback<Boolean> callback = new ICallback<Boolean>() {
            
            @Override
            public void result(Boolean obj) {
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
        };

        if(!refresh)
            strutturaManager.readStanzeStruttura(temp.getNomeStruttura(), temp.getCodiceFiscaleProprietario(), callback);
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

    private void aggiornaStanza(Boolean free) {
        
        Stanza toUpdate = ListaStanza.getIstanza().get(selectedStanza);
        
        if(free) {
            toUpdate.setLibera(1);
        } else {
            toUpdate.setLibera(0);
        }
        
        new StanzaManager().updateStanza(toUpdate, new ICallbackGeneral());
        caricaElencoStanze(true);
    }
}
