package ui;

import cache.lists.ListaAnagraficaStanza;
import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import interfaces.ICallback;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.StrutturaManager;

public class JPanelSituazioneGlobale extends javax.swing.JPanel {

    private int selectedAnagStan, selectedVisita;
    private String selectedStrutt, cfProprietario;
    private static StrutturaManager strutturaManager;
    
    public JPanelSituazioneGlobale(StrutturaManager manager, Boolean mode) {
        strutturaManager = manager;
        initComponents();
        inizializza(mode);
    }
    
    private void inizializza(Boolean mode) {
        
        if(mode) {
            caricaStruttureComboBox();
            cfProprietario = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        } else {
            selectedStrutt = UtenteConnesso.getUtente().getNomeStruttura();
            jComboBoxStrutture.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxStrutture = new javax.swing.JComboBox<>();
        jPanelElencoAnagStanza = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAnagStanza = new javax.swing.JTable();
        jPanelElencoVisit = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisita = new javax.swing.JTable();

        setName("Panoramica"); // NOI18N

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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        jPanelElencoVisitLayout.setVerticalGroup(
            jPanelElencoVisitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelElencoVisitLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelElencoAnagStanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAnagStanzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnagStanzaMouseClicked

        selectedAnagStan = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableAnagStanzaMouseClicked

    private void jTableVisitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVisitaMouseClicked

        selectedVisita = ((JTable) evt.getSource()).getSelectedRow();
    }//GEN-LAST:event_jTableVisitaMouseClicked

    private void caricaStruttureComboBox() {

        // IL CALLBACK VISUALIZZA LE INFORMAZIONI DOPO CHE SONO STATE SCARICATE
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

                // AGGIUNGO IL LISTENER PER CARICARE LE ANAGRAFICASTANZA E LE VISITE
                jComboBoxStrutture.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        selectedStrutt = (String) ((JComboBox) e.getSource()).getSelectedItem();
                        popolaElencoAnagStanVisita();
                    }
                });
            }
        };

        strutturaManager.readStruttureByAnagrafica(cfProprietario, callback);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxStrutture;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelElencoAnagStanza;
    private javax.swing.JPanel jPanelElencoVisit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAnagStanza;
    private javax.swing.JTable jTableVisita;
    // End of variables declaration//GEN-END:variables
}
