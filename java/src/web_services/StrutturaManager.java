
package web_services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Struttura;
import static web_services.HttpConnection.getResponse;

public class StrutturaManager extends HttpConnection {

    public void addStruttura(Struttura input) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.INS_STR, json));
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readStruttura(String nomeStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s", ServerCodes.READ_STR, nomeStruttura));
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
}
