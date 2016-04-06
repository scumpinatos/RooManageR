package test;

import entities.AnagraficaStanza;
import interfaces.ICallback;
import web_services.AnagraficaStanzaManager;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class InizioCaricaPermanenza {
    
    public static void main(String[] args) {
        
        System.out.println("CREAZIONE PERMANENZA\n"
                + "Codice fiscale anagrafica: CODICEFISCALE\n"
                + "Codice fiscale proprietario: CODICEFISCALE1\n"
                + "Nome struttura: Hotel Luna\n"
                + "Numero stanza: 1A\n"
                + "Tipo: 1\n"
                + "Ingresso: 4/4/2016 19:00\n");
        
        AnagraficaStanza anagStanza = new AnagraficaStanza();
        
        anagStanza.setCodiceFiscaleAnagrafica("CODICEFISCALE");
        anagStanza.setCodiceFiscaleProprietario("CODICEFISCALE1");
        anagStanza.setNomeStruttura("Hotel Luna");
        anagStanza.setNumeroStanza("1A");
        anagStanza.setTipo(1);
        anagStanza.setIngresso("4/4/2016 19:00");
        
        AnagraficaStanzaManager manager = new AnagraficaStanzaManager();
        
        manager.addAnagraficaStanza(anagStanza, new ICallback<AnagraficaStanza>() {
            @Override
            public void result(AnagraficaStanza obj) {
                
                if(obj == null) {
                    
                    System.out.println("PERMANENZA AGGIUNTA CORRETTAMENTE\n"
                            + "------------------------------");
                    
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
                                        obj.getIngresso());
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
