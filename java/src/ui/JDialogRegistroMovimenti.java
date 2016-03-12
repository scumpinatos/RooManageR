package ui;

import cache.ListaAnagrafica;
import cache.ListaAnagraficaStanza;
import cache.ListaStruttura;
import cache.UtenteConnesso;
import entities.Struttura;
import interfaces.ICallback;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import web_services.StrutturaManager;

public class JDialogRegistroMovimenti extends javax.swing.JDialog {

    private Struttura struttura;
    private static StrutturaManager manager;

    public JDialogRegistroMovimenti(java.awt.Frame parent, boolean modal, boolean mode) {
        super(parent, modal);
        initComponents();
        centraFinestra(this);
        manager = new StrutturaManager();
        struttura = new Struttura();
        selezionaModalità(mode);
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

        switch (((JComboBox) evt.getSource()).getSelectedIndex()) {
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

        struttura.setCodiceFiscaleAnagrafica(UtenteConnesso.getUtente().getCodiceFiscaleProprietario());

        if (mode) {
            caricaStrutture();
            jComboBoxStrutture.setEnabled(mode);
        } else {
            struttura.setNome(UtenteConnesso.getUtente().getNomeStruttura());
        }
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
                        String selezionato = (String) ((JComboBox) e.getSource()).getSelectedItem();
                        struttura.setNome(selezionato);
                    }
                });

            }
        };

        manager.readStruttureByAnagrafica(struttura.getCodiceFiscaleAnagrafica(), callback);
    }

    private void registroClienti() {

        ICallback<ListaAnagrafica> callback = new ICallback<ListaAnagrafica>() {
            @Override
            public void result(ListaAnagrafica obj) {
                if (obj != null) {

                    int n = obj.size();

                    String[] colonne = new String[4];
                    colonne[0] = "Codice fiscale";
                    colonne[1] = "Nome";
                    colonne[2] = "Cognome";
                    colonne[3] = "Data di nascita";

                    Object[][] righe = new Object[n][4];

                    for (int i = 0; i < n; i++) {
                        righe[i][0] = obj.get(i).getCodiceFiscale();
                        righe[i][1] = obj.get(i).getNome();
                        righe[i][2] = obj.get(i).getCognome();
                        righe[i][3] = obj.get(i).getDataNascita();
                    }

                    jTable.setModel(new DefaultTableModel(righe, colonne));
                } else {
                    jTable.setModel(new DefaultTableModel(new Object[0][], new Object[0]));
                }
            }
        };

        manager.readAllAnagraficheStruttura(struttura, callback);
    }

    private void registroPermanenze() {

        ICallback<ListaAnagraficaStanza> callback = new ICallback<ListaAnagraficaStanza>() {
            @Override
            public void result(ListaAnagraficaStanza obj) {
                if (obj != null) {

                    int n = obj.size();

                    Vector colonne = new Vector();
                    colonne.add("Codice fiscale");
                    colonne.add("Stanza");
                    colonne.add("Ingresso");
                    colonne.add("Uscita");
                    colonne.add("Costo");

                    Vector righe = new Vector();

                    for (int i = 0; i < n; i++) {
                        if (obj.get(i).getTipo() == 1) {
                            Vector temp = new Vector();
                            temp.add(obj.get(i).getCodiceFiscaleAnagrafica());
                            temp.add(obj.get(i).getNumeroStanza());
                            temp.add(obj.get(i).getIngresso());
                            temp.add(obj.get(i).getUscita());
                            temp.add(obj.get(i).getCosto());
                            righe.add(temp);
                        }
                    }

                    jTable.setModel(new DefaultTableModel(righe, colonne));
                } else {
                    jTable.setModel(new DefaultTableModel(new Object[0][], new Object[0]));
                }
            }
        };

        manager.readAllAnagraficaStanzaStruttura(struttura, callback);
    }

    private void registroVisite() {

        ICallback<ListaAnagraficaStanza> callback = new ICallback<ListaAnagraficaStanza>() {
            @Override
            public void result(ListaAnagraficaStanza obj) {
                if (obj != null) {

                    int n = obj.size();

                    Vector colonne = new Vector();
                    colonne.add("Codice fiscale");
                    colonne.add("Stanza");
                    colonne.add("Ingresso");
                    colonne.add("Uscita");

                    Vector righe = new Vector();

                    for (int i = 0; i < n; i++) {
                        if (obj.get(i).getTipo() == 2) {
                            Vector temp = new Vector();
                            temp.add(obj.get(i).getCodiceFiscaleAnagrafica());
                            temp.add(obj.get(i).getNumeroStanza());
                            temp.add(obj.get(i).getIngresso());
                            temp.add(obj.get(i).getUscita());
                            righe.add(temp);
                        }
                    }

                    jTable.setModel(new DefaultTableModel(righe, colonne));
                } else {
                    jTable.setModel(new DefaultTableModel(new Object[0][], new Object[0]));
                }
            }
        };

        manager.readAllAnagraficaStanzaStruttura(struttura, callback);
    }

    private void centraFinestra(JDialog input) {
        Dimension dim_schermo = Toolkit.getDefaultToolkit().getScreenSize();
        int posX = (int) (dim_schermo.width - getWidth()) / 2;
        int posY = (int) (dim_schermo.height - getHeight()) / 2;
        input.setLocation(posX, posY);
    }
}
