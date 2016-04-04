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
public class ModificaStanza {
    
    public static void main(String[] args) {
        
        System.out.println("STANZA SELEZIONATA\n"
                + "Numero stanza: 1A\n"
                + "Nome: Hotel Luna\n"
                + "Codice fiscale proprietario: CODICEFISCALE1\n"
                + "Descrizione: Descrizione Stanza 1A\n"
                + "Mq: 25\n"
                + "Agibile: 1\n"
                + "Tipo: 1\n"
                + "Permanenza: 0\n"
                + "Visita: 0\n");
        
        System.out.println("MODIFICHE APPORTATE\n"
                + "Nuova Descrizione: Descrizione Nuova Stanza 1A\n"
                + "Nuovo Mq: 30\n"
                + "Nuovo Agibile: 0\n"
                + "Nuovo Tipo: 2\n"
                + "Nuovo Permanenza: 1\n"
                + "Nuovo Visita: 1\n");
        
        Stanza stanza = new Stanza();
        stanza.setNumero("1A");
        stanza.setNomeStruttura("Hotel Luna");
        stanza.setCodiceFiscaleProprietario("CODICEFISCALE1");
        stanza.setDescrizione("Descrizione Nuova Stanza 1A");
        stanza.setMq(30);
        stanza.setAgibile(0);
        stanza.setTipo(2);
        stanza.setPermanenza(1);
        stanza.setVisita(1);
        
        StanzaManager manager = new StanzaManager();
        manager.updateStanza(stanza, new ICallback<Stanza>() {
            @Override
            public void result(Stanza obj) {
                
                if (obj == null) {
                    System.out.println("STANZA MODIFICATA CORRETTAMENTE.\n"
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
