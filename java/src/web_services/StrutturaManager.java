package web_services;

import cache.lists.ListaStruttura;
import cache.lists.ListaAnagraficaMansione;
import cache.lists.ListaOperazioni;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.AnagraficaMansione;
import entities.Struttura;
import interfaces.ICallback;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Classe che si occupa di gestire la struttura
 *
 * @author emanuelegargiulo
 */
public class StrutturaManager extends HttpConnection {

    /**
     * Metodo che si occupa di aggiungere una struttura al database remoto
     *
     * @param input
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
     * Metodo che legge una struttura dal database remoto
     *
     * @param nomeStruttura
     * @param cfProprietario
     */
    public void readStruttura(Struttura input, ICallback<Struttura> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String nomeStruttura = input.getNome();
                String cfProprietario = input.getCodiceFiscaleAnagrafica();
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.READ_STR, nomeStruttura, cfProprietario));
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
     * Metodo che agginge una struttura sul database remoto
     *
     * @param input
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
     * Metodo che cancella la struttura dal database remoto
     *
     * @param cfProprietario
     * @param nomeStruttura
     */
    public void deleteStruttura(Struttura input, ICallback<Struttura> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String nomeStruttura = input.getNome();
                String cfProprietario = input.getCodiceFiscaleAnagrafica();
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.DEL_STR, nomeStruttura, cfProprietario));

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

    // METODI INFORMAZIONI SULLA STRUTTURA
    /**
     * Metodo che legge tutte le strutture relative a un proprietario dal
     * database remoto
     *
     * @param cfProprietario
     * @param callback
     */
    public void readStruttureByAnagrafica(String cfProprietario, ICallback<Boolean> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s",
                        ServerCodes.READ_ALL_STRU, cfProprietario));
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
     * Metodo che legge tutte le anagrafiche di una struttura dal database
     * remoto
     *
     * @param cfProprietario
     * @param nomeStruttura
     */
    public void readAllAnagraficheStruttura(String cfProprietario, String nomeStruttura) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                
//                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s", 
//                        ServerCodes.READ_ALL_ANAG, cfProprietario, nomeStruttura));
//                try {
//                    ListaAnagrafica.setIstanza(new ObjectMapper().readValue(response, ListaAnagrafica.class));
//                } catch (IOException ex) {
//                }
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
    }

    /**
     * Metodo che legge tutte le anagrafiche delle stanze di una struttura dal
     * database remoto
     *
     * @param cfProprietario
     * @param nomeStruttura
     */
    public void readAllAnagraficaStanzaStruttura(String cfProprietario, String nomeStruttura) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                
//                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s", 
//                        ServerCodes.READ_ALL_ANAG_STA, cfProprietario, nomeStruttura));
//                try {
//                    ListaAnagraficaStanza.setIstanza(new ObjectMapper().readValue(response, ListaAnagraficaStanza.class));
//                } catch (IOException ex) {
//                }
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
    }

    /**
     * Metodo per leggere dal database remoto tutte le anagrafiche di una
     * struttura a cui e' assegnata una mansione
     *
     * @param cfProprietario
     * @param nomeStruttura
     * @param callback
     */
    public void readMansioniStruttura(String cfProprietario, String nomeStruttura, ICallback<ArrayList<AnagraficaMansione>> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s",
                        ServerCodes.READ_ALL_ANAG_MANS, cfProprietario, nomeStruttura));
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
