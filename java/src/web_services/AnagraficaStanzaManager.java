
package web_services;

import cache.lists.ListaOperazioni;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.AnagraficaStanza;
import interfaces.ICallback;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * Classe che si occupa di gestire l'associazione tra anagrafica e stanza
 * @author emanuelegargiulo
 */
public class AnagraficaStanzaManager extends HttpConnection {
    
    /**
     * Aggiunge l'anagrafica ad una stanza
     * @param input
     */
    public void addAnagraficaStanza(AnagraficaStanza input, ICallback<Object> callback) {
        
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
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaStanza di %s nella stanza %s NON aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if(response.equals("DONE")) {
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
     * Aggiorna l'entita' passata in input
     * @param input
     */
    public void updatePermanenza(AnagraficaStanza input, ICallback<Object> callback) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_PERM, json));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaStanza di %s nella stanza %s NON aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if(response.equals("DONE")) {
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
     * Aggiorna l'entita' passata in input
     * @param input
     */
    public void updateVisita(AnagraficaStanza input, ICallback<Object> callback) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_VISITA, json));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaStanza di %s nella stanza %s NON aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if(response.equals("DONE")) {
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
     * Legge l'entita' passata in input
     * @param input
     * @param callback
     */
    public void readAnagraficaStanza(AnagraficaStanza input, ICallback<AnagraficaStanza> callback) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.READ_ANAG_STA, input.getNumeroStanza(), 
                            input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
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
     * Controlla se l'anagrafica passata in input ha una visita in corso
     * @param input
     */
    public void checkVisitaInCorso(AnagraficaStanza input, ICallback<AnagraficaStanza> callback) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.CHECK_VIS, input.getNumeroStanza(), 
                            input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
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
    
}
