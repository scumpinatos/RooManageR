
package ui;

import cache.lists.ListaAnagrafica;
import cache.lists.ListaAnagraficaStanza;
import cache.lists.ListaStruttura;
import cache.singular.UtenteConnesso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import web_services.StrutturaManager;


public class UIRegistroMovimenti extends javax.swing.JDialog {

    String cf, nome;
    
    public UIRegistroMovimenti(java.awt.Frame parent, boolean modal, boolean mode) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        selezionaModalità(mode);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxStrutture = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonChiudi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Selezionare la struttura");

        jComboBoxStrutture.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxStrutture.setEnabled(false);

        jLabel2.setText("Cosa visualizzare");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Registro clienti", "Registro permanenze", "Registro visite" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButtonChiudi.setText("Chiudi");
        jButtonChiudi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChiudiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonChiudi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStrutture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonChiudi)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        
        switch(((JComboBox) evt.getSource()).getSelectedIndex()) {
            case 0: // Registro clienti
                registroClienti();
                break;
            case 1: // Registro permanenze
                registroPermanenze();
                break;
            case 2: // Registro visite
                registroVisite();
                break;
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed

    private void jButtonChiudiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChiudiActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonChiudiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChiudi;
    private javax.swing.JComboBox<String> jComboBoxStrutture;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

    // METODI DI SUPPORTO
    private void selezionaModalità(boolean mode) {
        
        if(mode) {
            caricaStrutture();
            jComboBoxStrutture.setEnabled(mode);
            cf = UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica();
        } else {
            cf = UtenteConnesso.getUtente().getCodiceFiscaleProprietario();
            nome = UtenteConnesso.getUtente().getNomeStruttura();
        }
    }
    
    private void caricaStrutture() {

        // CARICO LE STRUTTURE
        StrutturaManager manager = new StrutturaManager();
        //manager.readStruttureByAnagrafica(UtenteConnesso.getUtente().getCodiceFiscaleAnagrafica());

        ListaStruttura strutture = ListaStruttura.getIstanza();
        int nStru = strutture.size();

        String[] items = new String[nStru];
        for (int i = 0; i < nStru; i++) {
            items[i] = strutture.get(i).getNome();
        }

        jComboBoxStrutture.setModel(new DefaultComboBoxModel<String>(items));

        // AGGIUNGO IL LISTENER PER SALVARE LA SCELTA FATTA
        jComboBoxStrutture.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nome = (String) ((JComboBox) e.getSource()).getSelectedItem();
            }
        });
    }
    
    private void registroClienti() {

    }
    
    private void registroPermanenze() {

    }
    
    private void registroVisite() {

        

    }
}
