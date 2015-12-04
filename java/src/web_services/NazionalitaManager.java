
package web_services;

import cache.ListaNazionalita;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import exceptions.HttpException;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;


public class NazionalitaManager extends HttpConnection {

    public NazionalitaManager() {
        
    }
    
    public void getNazionalita(ICallback<ListaNazionalita> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s", ServerCodes.READ_NAZ));
                    if (callback != null) {
                        callback.onResult(new ObjectMapper().readValue(response, ListaNazionalita.class));
                    }
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        new Thread(runnable).start();
    }
}
