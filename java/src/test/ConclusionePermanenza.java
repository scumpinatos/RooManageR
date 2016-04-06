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
public class ConclusionePermanenza {
    
    public static void main(String[] args) {
        
        System.out.println("PERMANENZA SELEZIONATA\n"
                + "Codice fiscale anagrafica: CODICEFISCALE\n"
                + "Codice fiscale proprietario: CODICEFISCALE1\n"
                + "Nome struttura: Hotel Luna\n"
                + "Numero stanza: 1A\n"
                + "Tipo: 1\n"
                + "Ingresso: 4/4/2016 19:00\n");
        
        System.out.println("NUOVI DATI\n"
                + "Uscita: 5/4/2016 20:00\n"
                + "Costo: 50\n");
        
        AnagraficaStanza anagStanza = new AnagraficaStanza();
        
        anagStanza.setCodiceFiscaleAnagrafica("CODICEFISCALE");
        anagStanza.setCodiceFiscaleProprietario("CODICEFISCALE1");
        anagStanza.setNomeStruttura("Hotel Luna");
        anagStanza.setNumeroStanza("1A");
        anagStanza.setTipo(1);
        anagStanza.setIngresso("4/4/2016 19:00");
        anagStanza.setUscita("5/4/2016 20:00");
        anagStanza.setCosto(50);
        
        AnagraficaStanzaManager manager = new AnagraficaStanzaManager();
        
        manager.updateAnagraficaStanza(anagStanza, new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                
                if(obj == null) {
                    
                    System.out.println("PERMANENZA MODIFICATA (TERMINATA) CORRETTAMENTE\n"
                            + "------------------------------\n");
                    
                    manager.readAnagraficaStanza(anagStanza, new ICallback<AnagraficaStanza>() {
                        @Override
                        public void result(AnagraficaStanza obj) {
                            
                            if(obj != null) {
                                
                                System.out.println("PERMANENZA TROVATA NEL DATABASE\n");
                                System.out.println(obj.getCodiceFiscaleAnagrafica() + "\n" +
                                        obj.getCodiceFiscaleProprietario() + "\n" + 
                                        obj.getNomeStruttura() + "\n" +
                                        obj.getNumeroStanza() + "\n" +
                                        obj.getTipo() + "\n" +
                                        obj.getIngresso() +"\n" +
                                        obj.getUscita());
                            } else {
                                System.out.println("PERMANENZA NON TROVATA NEL DATABASE");
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
