/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Stanza;
import interfaces.ICallback;
import web_services.StanzaManager;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class InserisciCaricaStanza {

    public static void main(String[] args) {
        
        System.out.println("CREAZIONE STANZA\n"
                + "Numero stanza: 1A\n"
                + "Nome: Hotel Luna\n"
                + "Codice fiscale proprietario: CODICEFISCALE1\n"
                + "Descrizione: Descrizione Stanza 1A\n"
                + "Mq: 25\n"
                + "Agibile: 1\n"
                + "Tipo: 1\n"
                + "Permanenza: 0\n"
                + "Visita: 0\n");
        
        Stanza stanza = new Stanza();
        stanza.setNumero("1A");
        stanza.setNomeStruttura("Hotel Luna");
        stanza.setCodiceFiscaleProprietario("CODICEFISCALE1");
        stanza.setDescrizione("Descrizione Stanza 1A");
        stanza.setMq(25);
        stanza.setAgibile(1);
        stanza.setTipo(1);
        stanza.setPermanenza(0);
        stanza.setVisita(0);
        
        StanzaManager manager = new StanzaManager();
        manager.createStanza(stanza, new ICallback<Stanza>() {
            @Override
            public void result(Stanza obj) {
                
                if (obj == null) {
                    System.out.println("STANZA AGGIUNTA CORRETTAMENTE.\n"
                            + "-----------------------------------");

                    manager.readStanza(stanza, new ICallback<Stanza>() {
                        @Override
                        public void result(Stanza obj) {

                            if (obj != null) {
                                System.out.println("STANZA TROVATA NEL DATABASE.");
                                System.out.println(obj.getNumero()+ "\n" +
                                        obj.getNomeStruttura()+ "\n" +
                                        obj.getCodiceFiscaleProprietario() + "\n" +
                                        obj.getDescrizione()+ "\n" +
                                        obj.getMq() + "\n" +
                                        obj.getAgibile()+ "\n" +
                                        obj.getTipo() + "\n" +
                                        obj.getPermanenza() + "\n" + 
                                        obj.getVisita());
                            } else {
                                System.out.println("STANZA NON TROVATA NEL DATABASE.\n"
                                        + "-----------------------------------");
                            }
                        }
                    });
                    
                } else {
                    System.out.println("ERRORE OPERAZIONE.\n"
                            + "-----------------------------------");
                }
            }
        });
    }
}
