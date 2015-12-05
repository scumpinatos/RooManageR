
package web_services;

import cache.ListaStanze;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Stanza;
import java.io.IOException;
import java.util.ArrayList;
import static web_services.HttpConnection.getResponse;


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
    
    public void getStanzeByStruttura(String nomeStruttura, String cfProprietario) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                try {
                    String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.READ_ALL_STA, nomeStruttura, cfProprietario));
                    ListaStanze.setIstanza(new ObjectMapper().readValue(response, ListaStanze.class));
                } catch (IOException ex) {}
                
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
}
