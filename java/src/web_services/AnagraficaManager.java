package web_services;

import cache.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Mansioni;
import constants.ServerCodes;
import entities.Anagrafica;
import entities.AnagraficaMansione;
import exceptions.HttpException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import ui.UIHomeDirettore;
import ui.UIHomePortinaio;
import ui.UIHomeProprietario;

/**
 *
 * @author ScumpinatoS
 */
public class AnagraficaManager extends HttpConnection {

    public AnagraficaManager() {
    }

    public void login(String cf, String password, JFrame frame) {
        
        
        Runnable loginRunnable = new Runnable() {
            
            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&cf=%s&password=%s",ServerCodes.LOGIN, cf, password));
                    AnagraficaMansione utente = new ObjectMapper().readValue(response, AnagraficaMansione.class);
                    String response2 = getResponse(String.format("opCode=%s&cf=%s",ServerCodes.READ_ANAG, cf));
                    Anagrafica infoUtente = new ObjectMapper().readValue(response2, Anagrafica.class);
                    User.getInstance().setUtente(utente);
                    User.getInstance().setInfoUtente(infoUtente);
                    frame.setVisible(false);
                    new StrutturaManager().getStanzeByStruttura(utente.getIdStruttura());
//                    switch (utente.getTipoMansione()) {
//                        case Mansioni.PORTINAIO:
//                            new UIHomePortinaio().setVisible(true);
//                            break;
//                        case Mansioni.DIRETTORE:
//                            new UIHomeDirettore().setVisible(true);
//                            break;
//                        case Mansioni.PROPRIETARIO:
//                            new UIHomeProprietario().setVisible(true);
//                            break; 
//                    }
                } catch (MalformedURLException ex) {
                    Logger.getLogger(AnagraficaManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AnagraficaManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (HttpException ex) {
                }
            }
        };
        
        new Thread(loginRunnable).start();
    }
    
}