/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.AnagraficaStanza;
import interfaces.ICallback;
import web_services.AnagraficaStanzaManager;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class InizioCaricaVisita {
    
    public static void main(String[] args) {
        
        System.out.println("CREAZIONE VISITA\n"
                + "Codice fiscale anagrafica: CODICEFISCALE\n"
                + "Codice fiscale proprietario: CODICEFISCALE2\n"
                + "Nome struttura: Hotel Luna\n"
                + "Numero stanza: 1A\n"
                + "Tipo: 2\n"
                + "Ingresso: 4/4/2016 19:00\n");
        
        AnagraficaStanza anagStanza = new AnagraficaStanza();
        
        anagStanza.setCodiceFiscaleAnagrafica("CODICEFISCALE");
        anagStanza.setCodiceFiscaleProprietario("CODICEFISCALE2");
        anagStanza.setNomeStruttura("Hotel Luna");
        anagStanza.setNumeroStanza("1A");
        anagStanza.setTipo(2);
        anagStanza.setIngresso("4/4/2016 19:00");
        
        AnagraficaStanzaManager manager = new AnagraficaStanzaManager();
        
        manager.addAnagraficaStanza(anagStanza, new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                
                if(obj == null) {
                    
                    System.out.println("VISITA AGGIUNTA CORRETTAMENTE\n"
                            + "------------------------------");
                    
                    manager.readAnagraficaStanza(anagStanza, new ICallback<AnagraficaStanza>() {
                        @Override
                        public void result(AnagraficaStanza obj) {
                            
                            if(obj != null) {
                                
                                System.out.println("VISITA TROVATA NEL DATABASE\n");
                                System.out.println(obj.getCodiceFiscaleAnagrafica() + "\n" +
                                        obj.getCodiceFiscaleProprietario() + "\n" + 
                                        obj.getNomeStruttura() + "\n" +
                                        obj.getNumeroStanza() + "\n" +
                                        obj.getTipo() + "\n" +
                                        obj.getIngresso());
                            } else {
                                System.out.println("VISITA NON TROVATA NEL DATABASE");
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
