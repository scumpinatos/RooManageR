package ui;

import cache.lists.ListaAnagraficaStanza;
import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import entities.AnagraficaStanza;
import entities.Stanza;
import interfaces.ICallback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import web_services.AnagraficaStanzaManager;
import web_services.StanzaManager;
import web_services.StrutturaManager;

public class JPanelSituazioneAttuale extends javax.swing.JPanel {

    private int indicePermanenza, indiceVisita;
    private String nomeStruttura, cfProprietario;
    private static AnagraficaStanzaManager anagStaManager;
    private static StrutturaManager strutturaManager;
    private static ListaAnagraficaStanza permanenze, visite;

    public JPanelSituazioneAttuale(StrutturaManager manager, Boolean mode) {
        anagStaManager = new AnagraficaStanzaManager();
        strutturaManager = manager;
        cfProprietario = UtenteConnesso.getUtente().getCodiceFiscaleProprietario();
        permanenze = new ListaAnagraficaStanza();
        visite = new ListaAnagraficaStanza();
        initComponents();
        inizializza(mode);
    }

    private void inizializza(Boolean mode) {

        if (mode) {
            caricaStrutture();
        } else {
            nomeStruttura = UtenteConnesso.getUtente().getNomeStruttura();
            jComboBoxStrutture.setVisible(false);
            scaricaDati();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxStrutture = new javax.swing.JComboBox<>();
        jButtonAggiorna = new javax.swing.JButton();
        jPanelElencoAnagStanza = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePermanenze = new javax.swing.JTable();
        jButtonTerminaP = new javax.swing.JButton();
        jPanelElencoVisit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisite = new javax.swing.JTable();
        jButtonTerminaV = new javax.swing.JButton();

        setName("Panoramica"); // NOI18N

        jButtonAggiorna.setText("Aggiorna");
        jButtonAggiorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAggiornaActionPerformed(evt);
            }
        });

        jLabel4.setText("Permanenze nella struttura");

        jTablePermanenze.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePermanenze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePermanenzeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTablePermanenze);

        jButtonTerminaP.setText("Termina");
        jButtonTerminaP.setEnabled(false);
        jButtonTerminaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminaPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelElencoAnagStanzaLayout = new javax.swing.GroupLayout(jPanelElencoAnagStanza);
        jPanelElencoAnagStanza.setLayout(jPanelElencoAnagStanzaLayout);
        jPanelElencoAnagStanzaLayout.setHorizontalGroup(
            jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                    .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElencoAnagStanzaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonTerminaP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelElencoAnagStanzaLayout.setVerticalGroup(
            jPanelElencoAnagStanzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoAnagStanzaLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTerminaP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Visite nella struttura");

        jTableVisite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableVisite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVisiteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVisite);

        jButtonTerminaV.setText("Termina");
        jButtonTerminaV.setEnabled(false);
        jButtonTerminaV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTerminaVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelElencoVisitLayout = new javax.swing.GroupLayout(jPanelElencoVisit);
        jPanelElencoVisit.setLayout(jPanelElencoVisitLayout);
        jPanelElencoVisitLayout.setHorizontalGroup(
            jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelElencoVisitLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonTerminaV, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelElencoVisitLayout.setVerticalGroup(
            jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButtonTerminaV))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAggiorna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAggiorna))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTablePermanenzeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePermanenzeMouseClicked

        indicePermanenza = ((JTable) evt.getSource()).getSelectedRow();
        jButtonTerminaP.setEnabled(true);
    }//GEN-LAST:event_jTablePermanenzeMouseClicked

    private void jTableVisiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVisiteMouseClicked

        indiceVisita = ((JTable) evt.getSource()).getSelectedRow();
        jButtonTerminaV.setEnabled(true);
    }//GEN-LAST:event_jTableVisiteMouseClicked

    private void jButtonTerminaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminaPActionPerformed

        terminaPermanenza();
    }//GEN-LAST:event_jButtonTerminaPActionPerformed

    private void jButtonTerminaVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTerminaVActionPerformed

        terminaVisita();
    }//GEN-LAST:event_jButtonTerminaVActionPerformed

    private void jButtonAggiornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAggiornaActionPerformed
        scaricaDati();
    }//GEN-LAST:event_jButtonAggiornaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAggiorna;
    private javax.swing.JButton jButtonTerminaP;
    private javax.swing.JButton jButtonTerminaV;
    private javax.swing.JComboBox<String> jComboBoxStrutture;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelElencoAnagStanza;
    private javax.swing.JPanel jPanelElencoVisit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePermanenze;
    private javax.swing.JTable jTableVisite;
    // End of variables declaration//GEN-END:variables

    // OPERAZIONI
    private void terminaPermanenza() {

        ICallback<AnagraficaStanza> callback = new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                if (obj == null) {
                    aggiornaStanza(1);
                    permanenze.remove(indicePermanenza);
                    jButtonTerminaP.setEnabled(false);
                    caricaElenchi();
                }
            }
        };

        AnagraficaStanza finish = permanenze.get(indicePermanenza);
        String uscita = adesso();
        Float costo = Float.parseFloat(JOptionPane.showInputDialog(null, "Inserire l'importo pagato dal cliente"));
        String titolo = "Confermi i dati riportati";
        String messaggio = "Uscita: " + uscita + "\nCosto: " + costo + " €";
        int choice = JOptionPane.showConfirmDialog(null, messaggio, titolo, JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            finish.setUscita(uscita);
            finish.setCosto(costo);
            anagStaManager.updateAnagraficaStanza(finish, callback);

        }
    }

    private void terminaVisita() {

        ICallback<AnagraficaStanza> callback = new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                if (obj == null) {
                    aggiornaStanza(2);
                    visite.remove(indiceVisita);
                    jButtonTerminaV.setEnabled(false);
                    caricaElenchi();
                }
            }
        };

        AnagraficaStanza finish = visite.get(indiceVisita);
        String uscita = adesso();
        String titolo = "Confermi i dati riportati";
        String messaggio = "Uscita: " + uscita;
        int choice = JOptionPane.showConfirmDialog(null, messaggio, titolo, JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            finish.setUscita(uscita);
            anagStaManager.updateAnagraficaStanza(finish, callback);
        }
    }

    // METODI DI SUPPORTO
    private void caricaStrutture() {

        ICallback<Boolean> callback = new ICallback<Boolean>() {

            public void result(Boolean obj) {
                ListaStruttura strutture = ListaStruttura.getIstanza();
                int nStru = strutture.size();

                Vector<String> items = new Vector<>();
                items.add("Selezionare una struttura...");
                for (int i = 0; i < nStru; i++) {
                    items.add(strutture.get(i).getNome());
                }

                jComboBoxStrutture.setModel(new DefaultComboBoxModel<String>(items));

                jComboBoxStrutture.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        nomeStruttura = (String) ((JComboBox) e.getSource()).getSelectedItem();
                        scaricaDati();
                    }
                });
            }
        };

        strutturaManager.readStruttureByAnagrafica(cfProprietario, callback);
    }

    private void scaricaDati() {

        anagStaManager.readSituazioneAttuale(cfProprietario, nomeStruttura, new ICallback<ListaAnagraficaStanza>() {
            @Override
            public void result(ListaAnagraficaStanza obj) {

                int n = obj.size();
                permanenze.clear();
                visite.clear();
                for (int i = 0; i < n; i++) {
                    if (obj.get(i).getTipo() == 1) {
                        permanenze.add(obj.get(i));
                    } else {
                        visite.add(obj.get(i));
                    }
                }
                caricaElenchi();
            }
        });
    }

    private void caricaElenchi() {

        int nPer = permanenze.size();
        int nVis = visite.size();

        String[] colonne = new String[3];
        colonne[0] = "Numero";
        colonne[1] = "Codice fiscale";
        colonne[2] = "Ingresso";

        Object[][] righePerm = new Object[nPer][3];

        for (int i = 0; i < nPer; i++) {
            righePerm[i][0] = permanenze.get(i).getNumeroStanza();
            righePerm[i][1] = permanenze.get(i).getCodiceFiscaleAnagrafica();
            righePerm[i][2] = permanenze.get(i).getIngresso();
        }

        Object[][] righeVis = new Object[nVis][3];
        for (int i = 0; i < nVis; i++) {
            righeVis[i][0] = visite.get(i).getNumeroStanza();
            righeVis[i][1] = visite.get(i).getCodiceFiscaleAnagrafica();
            righeVis[i][2] = visite.get(i).getIngresso();
        }

        jTablePermanenze.setModel(new DefaultTableModel(righePerm, colonne));
        jTableVisite.setModel(new DefaultTableModel(righeVis, colonne));
    }

    private String adesso() {
        String now = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime());
        return now;
    }
    
    private void aggiornaStanza(int tipo) {
        
        Stanza toUpdate = new Stanza();
        toUpdate.setCodiceFiscaleProprietario(cfProprietario);
        toUpdate.setNomeStruttura(nomeStruttura);
        if(tipo == 1) {
            toUpdate.setNumero(permanenze.get(indicePermanenza).getNumeroStanza());
            toUpdate.setPermanenza(0);
            toUpdate.setVisita(0);
        } else if(tipo == 2) {
            toUpdate.setNumero(visite.get(indiceVisita).getNumeroStanza());
            toUpdate.setVisita(0);
            toUpdate.setPermanenza(1);
        }
        new StanzaManager().occupaStanza(toUpdate, null);
    }

}
