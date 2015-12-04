
package web_services;

import cache.ListaStanze;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import java.io.IOException;
import static web_services.HttpConnection.getResponse;

public class StrutturaManager extends HttpConnection {

    public void getStanzeByStruttura(int idStruttura) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                try {
                    String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.STANZE_STR, idStruttura));
                    ListaStanze.setIstanza(new ObjectMapper().readValue(response, ListaStanze.class));
                } catch (IOException ex) {}
                
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readStruttura(int idStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.READ_STR, idStruttura));
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
}
