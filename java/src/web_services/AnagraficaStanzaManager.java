package web_services;

import utils.ListaAnagraficaStanza;
import utils.ListaOperazioni;
import utils.Server;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.AnagraficaStanza;
import interfaces.ICallback;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import static web_services.HttpConnection.getResponse;

/**
 * Classe che implementa le operazioni di gestione degli oggetti di tipo AnagraficaStanza
 * @author giandomenicoizzo
 * @author emanuelegargiulo
 */
public class AnagraficaStanzaManager extends HttpConnection {

    /**
     * Questo metodo aggiunge un oggetto AnagraficaStanza nel database
     * @param input l'oggetto da aggiungere
     * @param callback il callback che si attiva a fine operazione
     */
    public void addAnagraficaStanza(AnagraficaStanza input, ICallback<AnagraficaStanza> callback) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_ANAG_STA, json));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaStanza di %s nella stanza %s NON aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaStanza di %s nella stanza %s aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo aggiorna un oggetto AnagraficaStanza nel database
     * @param input l'oggetto da aggiunger
     * @param callback il callback che si attiva a fine operazione
     */
    public void updateAnagraficaStanza(AnagraficaStanza input, ICallback<AnagraficaStanza> callback) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_ANAG_STA, json));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaStanza di %s nella stanza %s NON aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " AnagraficaStanza di %s nella stanza %s aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo legge i dati di un oggetto AnagraficaStanza nel database
     * @param input l'oggetto di cui leggere i dati
     * @param callback il callback che si attiva a fine operazione
     */
    public void readAnagraficaStanza(AnagraficaStanza input, ICallback<AnagraficaStanza> callback) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s",
                            ServerCodes.READ_ANAG_STA, input.getNumeroStanza(),
                            input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));

                    if (response == null) {
                        Server.serverOffline(this);
                    }

                    if (!(response.equals("NOT DONE"))) {
                        callback.result(new ObjectMapper().readValue(response, AnagraficaStanza.class));
                    } else {
                        callback.result(null);
                    }
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo legge sul database tutti gli oggetti AnagraficaStanza con i valori passati
     * @param cfProprietario il codice fiscale del proprietario della struttura
     * @param nomeStruttura il nome della struttura
     * @param callback il callback che si attiva a fine operazione
     */
    public void readSituazioneAttuale(String cfProprietario, String nomeStruttura, ICallback<ListaAnagraficaStanza> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s",
                        ServerCodes.READ_ANAG_STA_CORSO, cfProprietario, nomeStruttura));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("false")) {
                    callback.result(null);
                } else {
                    try {
                        callback.result(new ObjectMapper().readValue(response, ListaAnagraficaStanza.class));
                    } catch (IOException ex) {
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

}
