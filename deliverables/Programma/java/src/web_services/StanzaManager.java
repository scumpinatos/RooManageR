package web_services;

import utils.ListaOperazioni;
import utils.ListaStanza;
import utils.Server;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Stanza;
import interfaces.ICallback;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import static web_services.HttpConnection.getResponse;

/**
 * Classe che implementa le operazioni di gestione degli oggetti di tipo Stanza
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class StanzaManager extends HttpConnection {

    /**
     * Questo metodo aggiunge un oggetto Stanza nel database
     * @param input l'oggetto da aggiungere
     * @param callback il callback che si attiva a fine operazione
     */
    public void createStanza(Stanza input, ICallback<Stanza> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_STA, json));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s NON aggiunta al database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s aggiunta al database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo aggiorna un oggetto Stanza nel database
     * @param input l'oggetto da aggiornare
     * @param callback il callback che si attiva a fine operazione
     */
    public void updateStanza(Stanza input, ICallback<Stanza> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_STA, json));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s NON aggiornata nel database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s aggiornata nel database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo legge i dati di un oggetto Stanza nel database
     * @param input l'oggetto da leggere
     * @param callback il callback che si attiva fine operazione
     */
    public void readStanza(Stanza input, ICallback<Stanza> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String numeroStanza = input.getNumero();
                String nomeStruttura = input.getNomeStruttura();
                String cfProprietario = input.getCodiceFiscaleProprietario();
                String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.READ_STR, numeroStanza, nomeStruttura, cfProprietario));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (!(response.equals("NOT DONE"))) {
                    try {
                        callback.result(new ObjectMapper().readValue(response, Stanza.class));
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
     * Questo metodo rimuove un oggetto Stanza nel database
     * @param input l'oggetto da rimuovere
     * @param callback il callback che si attiva a fine operazione
     */
    public void deleteStanza(Stanza input, ICallback<Stanza> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.DEL_STA, json));
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s NON rimossa dal database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s rimossa dal database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

    /**
     * Questo metodo legge tutti gli oggetti Stanza nel database di una struttura
     * @param nomeStruttura il nome della struttura
     * @param cfProprietario il codice fiscale del proprietario della struttura
     * @param callback il callback che si attiva a fine operazione
     */
    public void readStanzeStruttura(String nomeStruttura, String cfProprietario, ICallback<Boolean> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {
                    String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s",
                            ServerCodes.READ_ALL_STA, nomeStruttura, cfProprietario));
                    if (response == null) {
                        Server.serverOffline(this);
                    }

                    if (response.equals("false")) {
                        callback.result(false);
                    } else {
                        ListaStanza.setIstanza(new ObjectMapper().readValue(response, ListaStanza.class));
                        callback.result(true);
                    }
                } catch (IOException ex) {
                }

            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo aggiorna un oggetto Stanza nel database dopo l'aggiunta di un oggetto AnagraficaStanza
     * @param input l'oggetto da aggiornare
     * @param callback il callback che si attiva a fine operazione
     */
    public void occupaStanza(Stanza input, ICallback<Stanza> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.OCC_STA, json));
                if(response == null) {
                    Server.serverOffline(this);
                }
                
                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s NON aggiornata nel database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Stanza %s della struttura %s aggiornata nel database";
                    op = String.format(op, input.getNumero(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
