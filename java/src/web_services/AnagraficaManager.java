package web_services;

import cache.singular.AnagraficaTemp;
import cache.lists.ListaOperazioni;
import cache.singular.UtenteConnesso;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.Mansioni;
import constants.ServerCodes;
import entities.Anagrafica;
import entities.AnagraficaMansione;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import ui.UIHomePortinaio;
import ui.UIHomeProprietario;
import ui.UILogin;

/**
 * Classe di controllo per l'entita' anagrafica
 *
 * @author emanuelegargiulo
 */
public class AnagraficaManager extends HttpConnection {

    /**
     * Metodo che si occupa dell'aggiunta di un'anagrafica sul database remoto
     *
     * @param input
     */
    public void addAnagrafica(Anagrafica input) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_ANAG, json));
                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Anagrafica %s NON aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Anagrafica %s aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Metodo che si occupa di aggiornare un'anagrafica sul database remoto
     *
     * @param input
     */
    public void updateAnagrafica(Anagrafica input) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_ANAG, json));
                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + "- Anagrafica %s NON aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + "- Anagrafica %s aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Metodo che si occupa di leggere un'anagrafica dal database remoto
     *
     * @param cf
     * @param callback
     */
    public void readAnagrafica(String cf, ICallback<Boolean> callback) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&cf=%s", ServerCodes.READ_ANAG, cf));
                    if (!(response.equals("NOT DONE"))) {
                        Anagrafica anagrafica = new ObjectMapper().readValue(response, Anagrafica.class);
                        if (anagrafica.getCodiceFiscale().equalsIgnoreCase(cf)) {
                            AnagraficaTemp.setIstanza(anagrafica);
                            callback.result(true);
                        }else {
                            callback.result(false);
                        }
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
    }

    /**
     * Metodo che si occupa di effettuare il login
     *
     * @param cf
     * @param password
     * @param callback
     */
    public void login(String cf, String password, ICallback<Integer> callback) {

        Runnable runnable;
        runnable = new Runnable() {
            
            @Override
            public void run() {
                try {
                    // INFORMAZIONI DA SALVARE
                    AnagraficaMansione utente = null;
                    Anagrafica infoUtente = null;

                    // LETTURA INFORMAZIONI
                    String response = getResponse(String.format("opCode=%s&cf=%s", ServerCodes.LOGIN, cf));

                    // CONTROLLO PRESENZA CF NEL DB
                    if (response.equals("NOT DONE")) {
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
                    UtenteConnesso.setUtente(utente);
                    UtenteConnesso.setInfoUtente(infoUtente);

                    // AGGIUNTA OPERAZIONE
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " L'utente %s di tipo %s ha effettuato l'accesso.";
                    op = String.format(op, utente.getCodiceFiscaleAnagrafica(), utente.getTipoMansione());
                    ListaOperazioni.getListaOperazioni().add(op);

                    // CHIUSURA LOGIN ED APERTURA HOMEPAGE
                    callback.result(UtenteConnesso.getUtente().getTipoMansione());
                   //  frame.setVisible(false);
                    switch (UtenteConnesso.getUtente().getTipoMansione()) {
                        case Mansioni.PORTINAIO:
                            new UIHomePortinaio().setVisible(true);
                            break;
                        case Mansioni.PROPRIETARIO:
                            new UIHomeProprietario().setVisible(true);
                            break;
                    }

                } catch (MalformedURLException ex) {

                } catch (IOException ex) {

                }
            }
        };

        new Thread(runnable).start();
    }
}
