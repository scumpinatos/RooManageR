package web_services;

import cache.AnagraficaTemp;
import cache.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Mansioni;
import constants.ServerCodes;
import entities.Anagrafica;
import entities.AnagraficaMansione;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.UIHomePortinaio;

public class AnagraficaManager extends HttpConnection {

    public AnagraficaManager() {

    }

    public void login(String cf, String password, JFrame frame) {
        

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    // INFORMAZIONI DA SALVARE
                    AnagraficaMansione utente = null;
                    Anagrafica infoUtente = null;

                    // LETTURA INFORMAZIONI
                    String response = getResponse(String.format("opCode=%s&cf=%s", ServerCodes.LOGIN, cf));

                    // CONTROLLO PRESENZA CF NEL DB
                    if (response.equals("NOT FOUND")) {
                        JOptionPane.showMessageDialog(null, "CF non presente nel database");
                        return;
                    }

                    utente = new ObjectMapper().readValue(response, AnagraficaMansione.class);

                    // CONTROLLO PASSWORD
                    if (!(utente.getPassword().equals(password))) {
                        JOptionPane.showMessageDialog(null, "Password inserita errata");
                        return;
                    }

                    String response2 = HttpConnection.getResponse(String.format("opCode=%s&cf=%s", ServerCodes.READ_ANAG, cf));
                    if (response2 != null) {
                        infoUtente = new ObjectMapper().readValue(response2, Anagrafica.class);
                    }

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

                } catch (IOException ex) {

                }
            }
        };

        new Thread(runnable).start();
    }

    public void addAnagrafica(Anagrafica input) {
        
    }
    
    public void search(String cf) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&cf=%s", ServerCodes.READ_ANAG, cf));
                    if (response != null) {
                        AnagraficaTemp.getInstance().setAnagraficaTemp(new ObjectMapper().readValue(response, Anagrafica.class));
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
        while (thread.getState() != Thread.State.TERMINATED) {
        }
    }
}
