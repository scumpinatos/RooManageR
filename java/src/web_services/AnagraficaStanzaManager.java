
package web_services;

import cache.AnagraficaStanzaTemp;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.AnagraficaStanza;
import java.io.IOException;
import java.net.MalformedURLException;
import static web_services.HttpConnection.getResponse;


public class AnagraficaStanzaManager {
    
    public void readAnagraficaStanza(AnagraficaStanza input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.READ_ANAG_STA, input.getNumeroStanza(), 
                            input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
                    if (response != null) {
                        AnagraficaStanzaTemp.getInstance().setAnagraficaStanzaTemp(new ObjectMapper().readValue(response, AnagraficaStanza.class));
                    }
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
}
