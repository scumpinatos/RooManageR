package web_services;

import utils.ListaStruttura;
import utils.ListaAnagraficaStanza;
import utils.ListaOperazioni;
import utils.Server;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Anagrafica;
import entities.AnagraficaMansione;
import entities.Struttura;
import interfaces.ICallback;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

class ListaAnagrafica extends ArrayList<Anagrafica> {
        
}

class ListaAnagraficaMansione extends ArrayList<AnagraficaMansione> {
        
}
/**
 * Classe che implementa le operazioni di gestione degli oggetti di tipo Struttura
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public class StrutturaManager extends HttpConnection {

    /**
     * Questo metodo aggiunge un oggetto Struttura nel database
     * @param input l'oggetto da aggiungere
     * @param callback il callback che si attiva a fine operazione
     */
    public void createStruttura(Struttura input, ICallback<Struttura> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_STR, json));
                if(response == null) {
                    Server.serverOffline(this);
                }
                
                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Struttura %s NON aggiunta al database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Struttura %s aggiunta al database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

    /**
     * Questo metodo legge i dati di un oggetto Struttura nel database
     * @param input l'oggetto da legger
     * @param callback il callback che si attiva a fine operazione
     */
    public void readStruttura(Struttura input, ICallback<Struttura> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String nomeStruttura = input.getNome();
                String cfProprietario = input.getCodiceFiscaleAnagrafica();
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.READ_STR, nomeStruttura, cfProprietario));
                if(response == null) {
                    Server.serverOffline(this);
                }
                
                if (!(response.equals("NOT DONE"))) {
                    try {
                        callback.result(new ObjectMapper().readValue(response, Struttura.class));
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
     * Questo metodo aggiorna un oggetto Struttura nel database
     * @param input l'oggetto da aggiornare
     * @param callback il callback che si attiva a fine operazione
     */
    public void updateStruttura(Struttura input, ICallback<Struttura> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_STR, json));
                if(response == null) {
                    Server.serverOffline(this);
                }
                
                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Struttura %s NON aggiornata nel database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Struttura %s aggiornata nel database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

    /**
     * Questo metodo rimuove un oggetto Struttura nel database
     * @param input l'oggetto da rimuovere
     * @param callback il callback che si attiva a fine operazione
     */
    public void deleteStruttura(Struttura input, ICallback<Struttura> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String nomeStruttura = input.getNome();
                String cfProprietario = input.getCodiceFiscaleAnagrafica();
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.DEL_STR, nomeStruttura, cfProprietario));
                if(response == null) {
                    Server.serverOffline(this);
                }

                if (response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Struttura %s NON rimossa dal database";
                    op = String.format(op, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if (response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime())
                            + " Struttura %s rimossa dal database";
                    op = String.format(op, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }

    /**
     * Questo metodo legge tutti gli oggetti Struttura nel database di un codice fiscale
     * @param cfProprietario il codice fiscale del proprietario
     * @param callback il callback che si attiva a fine operazione
     */
    public void readStruttureByAnagrafica(String cfProprietario, ICallback<Boolean> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s",
                        ServerCodes.READ_ALL_STRU, cfProprietario));
                if(response == null) {
                    Server.serverOffline(this);
                }
                try {
                    ListaStruttura.setIstanza(new ObjectMapper().readValue(response, ListaStruttura.class));
                    callback.result(Boolean.TRUE);
                } catch (IOException ex) {
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
    
    /**
     * Questo metodo legge tutti gli oggetti Anagrafica legati ad un oggetto Struttura
     * @param struttura l'oggetto Struttura di cui leggere le informazioni
     * @param callback il callback che si attiva a fine operazione che riceve una ListaAnagrafica
     */
    public void readAllAnagraficheStruttura(Struttura struttura, ICallback<ArrayList<Anagrafica>> callback) {

        String cf = struttura.getCodiceFiscaleAnagrafica();
        String nome = struttura.getNome();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s",
                        ServerCodes.READ_ALL_ANAG, cf, nome));
                if(response == null) {
                    Server.serverOffline(this);
                }
                if (response.equals("false")) {
                    callback.result(null);
                } else {
                    try {
                        callback.result(new ObjectMapper().readValue(response, ListaAnagrafica.class));
                    } catch (IOException ex) {
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * Questo metodo legge tutti gli oggetti AnagraficaStanza legati ad un oggetto Struttura
     * @param struttura l'oggetto Struttura di cui leggere le informazioni
     * @param callback il callback che si attiva a fine operazione che riceve una ListaAnagraficaStanza
     */
    public void readAllAnagraficaStanzaStruttura(Struttura struttura, ICallback<ListaAnagraficaStanza> callback) {

        String cf = struttura.getCodiceFiscaleAnagrafica();
        String nome = struttura.getNome();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s",
                        ServerCodes.READ_ALL_ANAG_STA, cf, nome));
                if(response == null) {
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
    
    /**
     * Questo metodo legge tutti gli oggetti AnagraficaMansione legati ad una Struttura
     * @param cfProprietario il codice fiscale del proprietario della struttura
     * @param nomeStruttura il nome della struttura
     * @param callback il callback che si attiva a fine operazione che riceve un ArrayList con tutti gli oggetti letti
     */
    public void readMansioniStruttura(String cfProprietario, String nomeStruttura, ICallback<ArrayList<AnagraficaMansione>> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s",
                        ServerCodes.READ_ALL_ANAG_MANS, cfProprietario, nomeStruttura));
                if(response == null) {
                    Server.serverOffline(this);
                }
                if (response.equals("false")) {
                    callback.result(null);
                } else {
                    try {
                        callback.result(new ObjectMapper().readValue(response, ListaAnagraficaMansione.class));
                    } catch (IOException ex) {
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
