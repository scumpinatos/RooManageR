package web.managers;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Anagrafica;
import exceptions.HttpException;
import interfaces.Listener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Pair;
import web.StatusCodes;
import web.WebManager;

/**
 *
 * @author ScumpinatoS
 */
public class AnagraficaManager extends WebManager {

    public void login(String cf, String password, Listener<Pair<Integer, Anagrafica>> callback) {
        Runnable loginRunnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String response = getResponse(
                            String.format("opCode=%s&cf=%s&password=%s",
                                    "1", cf, password)
                    );
                    Anagrafica anagrafica = new ObjectMapper().readValue(response, Anagrafica.class);
                    callback.result(new Pair<>(StatusCodes.SUCCESS, anagrafica));
                } catch (MalformedURLException ex) {
                    Logger.getLogger(AnagraficaManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AnagraficaManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (HttpException ex) {
                    callback.result(new Pair<>(ex.getStatusCode(), null));
                }
            }
        };
        
        new Thread(loginRunnable).start();
    }
    
    public void inserisci(Anagrafica anagrafica, Listener<Integer> callback) {
        
    }
    
}
