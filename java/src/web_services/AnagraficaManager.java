package web_services;

import cache.AnagraficaTemp;
import cache.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Mansioni;
import constants.ServerCodes;
import entities.Anagrafica;
import entities.AnagraficaMansione;
import exceptions.HttpException;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import ui.UIHomePortinaio;

public class AnagraficaManager extends HttpConnection {

    public AnagraficaManager() {
        
    }

    public void login(String cf, String password, JFrame frame) {
        
        
        Runnable runnable = new Runnable() {
            
            @Override
            public void run() {
                try {
                    // LETTURA INFORMAZIONI
                    String response = getResponse(String.format("opCode=%s&cf=%s&password=%s",ServerCodes.LOGIN, cf, password));
                    AnagraficaMansione utente = new ObjectMapper().readValue(response, AnagraficaMansione.class);
                    String response2 = HttpConnection.getResponse(String.format("opCode=%s&cf=%s",ServerCodes.READ_ANAG, cf));
                    Anagrafica infoUtente = new ObjectMapper().readValue(response2, Anagrafica.class);
                    
                    // SALVATAGGIO INFORMAZIONI
                    User.getInstance().setUtente(utente);
                    User.getInstance().setInfoUtente(infoUtente);
                    
                    // CHIUSURA LOGIN ED APERTURA HOMEPAGE
                    frame.setVisible(false);
                    switch (User.getInstance().getUtente().getTipoMansione()) {
                        case Mansioni.PORTINAIO:
                            new UIHomePortinaio().setVisible(true);
                            break;
                    }
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    ex.printStackTrace();
                    System.out.println("IOException in class " + this.getClass().getName());
                } catch (HttpException ex) {
                    System.out.println("HttpException in class " + this.getClass().getName());
                }
            }
        };
        
        new Thread(runnable).start();
    }
    
    public boolean search(String cf) {
        
        Runnable runnable = new Runnable() {
            
            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&cf=%s",ServerCodes.READ_ANAG, cf));
                    AnagraficaTemp.getInstance().setAnagraficaTemp(new ObjectMapper().readValue(response, Anagrafica.class));
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                } catch (HttpException ex) {
                    System.out.println("HttpException in class " + this.getClass().getName());
                }
            }
        };
        
        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
        
        if(AnagraficaTemp.getInstance().getAnagraficaTemp().getCodiceFiscale().equals(cf))
            return true;
        else
            return false;
    }
}
