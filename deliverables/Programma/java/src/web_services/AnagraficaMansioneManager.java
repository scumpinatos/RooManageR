package web_services;

import utils.ListaOperazioni;
import utils.Server;
import utils.UtenteConnesso;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Anagrafica;
import entities.AnagraficaMansione;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static web_services.HttpConnection.getResponse;

/**
 * Classe che implementa le operazioni di gestione degli oggetti di tipo AnagraficaMansione
 * @author giandomenicoizzo
 * @author emanuelegargiulo
 */
public class AnagraficaMansioneManager {

    /**
     * Questo metodo aggiunge un oggetto AnagraficaMansione nel database
     * @param input
     * @param callback
     */
    public void addAnagraficaMansione(AnagraficaMansione input, ICallback<AnagraficaMansione> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_ANAG_MANS, json));

                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaMansione %s nella struttura %s NON aggiunta al database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaMansione %s nella struttura %s aggiunta al database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo aggiorna un oggetto AnagraficaMansione nel database
     * @param input
     * @param callback
     */
    public void updateAnagraficaMansione(AnagraficaMansione input, ICallback<AnagraficaMansione> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_ANAG_MANS, json));

                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaMansione %s nella struttura %s NON aggiornata nel database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaMansione %s nella struttura %s aggiornata nel database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo legge i dati di un oggetto AnagraficaMansione dal database
     * @param input
     * @param callback
     */
    public void readAnagraficaMansione(AnagraficaMansione input, ICallback<AnagraficaMansione> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String cf = input.getCodiceFiscaleAnagrafica();
                String nomeStruttura = input.getNomeStruttura();
                String cfProprietario = input.getCodiceFiscaleProprietario();

                String response = getResponse(String.format("opCode=%s&cf=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.READ_ANAG_MANS, cf, nomeStruttura, cfProprietario));

                if (response == null) {
                    Server.serverOffline(this);
                }

                if (!(response.equals("NOT DONE"))) {
                    try {
                        callback.result(new ObjectMapper().readValue(response, AnagraficaMansione.class));
                    } catch (IOException ex) {
                    }
                } else {
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo rimuove un oggetto AnagraficaMansione dal database
     * @param input
     * @param callback
     */
    public void deleteAnagraficaMansione(AnagraficaMansione input, ICallback<AnagraficaMansione> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String cf = input.getCodiceFiscaleAnagrafica();
                String nomeStruttura = input.getNomeStruttura();
                String cfProprietario = input.getCodiceFiscaleProprietario();

                String response = getResponse(String.format("opCode=%s&cf=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.DEL_ANAG_MANS, cf, nomeStruttura, cfProprietario));

                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaMansione %s NON rimossa dalla struttura %s e dal database";
                    op = String.format(op, cf, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaMansione %s rimossa dalla struttura %s e dal database";
                    op = String.format(op, cf, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo implementa l'operazione di Login
     * @param cf
     * @param password
     * @param callback
     */
    public void login(String cf, String password, ICallback<Integer> callback) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    // INFORMAZIONI DA SALVARE
                    AnagraficaMansione utente = null;
                    Anagrafica infoUtente = null;

                    // LETTURA INFORMAZIONI
                    String response = getResponse(String.format("opCode=%s&cf=%s", ServerCodes.LOGIN, cf));
                    if (response == null) {
                        Server.serverOffline(this);
                    }

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
                } catch (MalformedURLException ex) {

                } catch (IOException ex) {

                }
            }
        };

        new Thread(runnable).start();
    }
}
