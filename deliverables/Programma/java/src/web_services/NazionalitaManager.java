package web_services;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Nazionalita;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import utils.Server;

class ListaNazionalita extends ArrayList<Nazionalita> {

}

/**
 * Classe che implementa le operazioni di gestione degli oggetti di tipo Nazionalità
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class NazionalitaManager extends HttpConnection {
    
    /**
     * Questo metodo legge tutti gli oggetti Nazionalita nel database
     * @param callback il callback che si attiva a fine operazione e riceve un ArrayList di oggetti Nazionalita
     */
    public void readAllNazionalita(ICallback<ArrayList<Nazionalita>> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {

                    String response = getResponse(String.format("opCode=%s", ServerCodes.READ_ALL_NAZ));
                    if(response == null) {
                    Server.serverOffline(this);
                }
                    callback.result(new ObjectMapper().readValue(response, ListaNazionalita.class));
                    
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
