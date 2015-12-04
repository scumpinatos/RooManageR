
package web_services;

import entities.Stanza;
import java.util.ArrayList;


public class StanzaManager extends HttpConnection{
    
    public void addStanza(Stanza input) {
        
    }
    
    public void addElencoStanze(ArrayList<Stanza> input) {
     
        int nStanze = input.size();
        
        for(int i=0; i<nStanze; i++) {
            addStanza(input.get(i));
            // IMPLEMENTARE CONTROLLO AVVENUTA OPERAZIONE
        }
    }
    
    public Stanza readStanza(String numeroStanza, String nomeStruttura) {
        
        return null;
    }
    
    public void removeStanza(Stanza input) {
        
    }
}
