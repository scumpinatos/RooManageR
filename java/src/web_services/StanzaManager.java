package web_services;

import cache.lists.ListaOperazioni;
import cache.lists.ListaStanza;
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
 * Classe che si occupa di gestire le stanze
 *
 * @author emanuelegargiulo
 */
public class StanzaManager extends HttpConnection {

    /**
     * Metodo che si occupa di aggiungere una stanza al database remoto
     *
     * @param input
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
     * Metodo che si occupa di aggiornare una stanza nel database remoto
     *
     * @param input
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
     * Metodo che si occupa di leggere una stanza dal database remoto
     *
     * @param numeroStanza
     * @param nomeStruttura
     * @param cfProprietario
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
     * Metodo che si occupa di cancellare una stanza dal database remoto
     *
     * @param input
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
     * Metodo che si occupa di leggere tutte le stanze della struttura dal
     * database remoto
     *
     * @param nomeStruttura
     * @param cfProprietario
     * @param callback
     */
    public void readStanzeStruttura(String nomeStruttura, String cfProprietario, ICallback<Boolean> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {
                    String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s",
                            ServerCodes.READ_ALL_STA, nomeStruttura, cfProprietario));
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
