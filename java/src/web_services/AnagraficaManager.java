package web_services;

import utils.ListaOperazioni;
import utils.Server;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Anagrafica;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Classe che implementa le operazioni di gestione degli oggetti di tipo Anagrafica
 * @author giandomenicoizzo
 * @author emanuelegargiulo
 */
public class AnagraficaManager extends HttpConnection {

    /**
     * Questo metodo aggiunge un oggetto Anagrafica nel database
     * @param input
     * @param callback
     */
    public void addAnagrafica(Anagrafica input, ICallback<Anagrafica> callback) {

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
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Anagrafica %s NON aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Anagrafica %s aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo aggiorna un oggetto Anagrafica nel database
     * @param input
     * @param callback
     */
    public void updateAnagrafica(Anagrafica input, ICallback<Anagrafica> callback) {

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
                if (response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + "- Anagrafica %s NON aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + "- Anagrafica %s aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscale());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo legge un oggetto Anagrafica nel database
     * @param cf
     * @param callback
     */
    public void readAnagrafica(String cf, ICallback<Anagrafica> callback) {

        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&cf=%s", ServerCodes.READ_ANAG, cf));
                    if (response == null) {
                        Server.serverOffline(this);
                    }
                    if (!(response.equals("NOT DONE"))) {
                        Anagrafica anagrafica = new ObjectMapper().readValue(response, Anagrafica.class);
                        callback.result(anagrafica);
                    } else {
                        callback.result(null);
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
}
