package web_services;

import cache.lists.ListaOperazioni;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Nazionalita;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import cache.lists.ListaNazionalita;


/**
 * Classe che gestisce le nazionalita'
 * @author emanuelegargiulo
 */
public class NazionalitaManager extends HttpConnection {
    
    /**
     * Aggiunge una nazionalita'
     * @param input
     */
    public void addNazionalita(Nazionalita input, ICallback<Object> callback) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_NAZ, json));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Nazionalità %s NON aggiunta al database";
                    op = String.format(op, input.getAbbreviazione());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Nazionalità %s aggiunta al database";
                    op = String.format(op, input.getAbbreviazione());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
                
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        
    }
    
    /**
     * Legge tutte le nazionalita'
     */
    public void readAllNazionalita(ICallback<ArrayList<Nazionalita>> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {

                    String response = getResponse(String.format("opCode=%s", ServerCodes.READ_ALL_NAZ));
                    callback.result(new ObjectMapper().readValue(response, ListaNazionalita.class));
                    
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        new Thread(runnable).start();
    }
    
    /**
     * Aggiorna la nazionalita' passata in input
     * @param input
     */
    public void updateNazionalita(Nazionalita input, ICallback<Object> callback) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_NAZ, json));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Nazionalità %s NON aggiornata nel database";
                    op = String.format(op, input.getAbbreviazione());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(input);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Nazionalità %s aggiornata nel database";
                    op = String.format(op, input.getAbbreviazione());
                    ListaOperazioni.getListaOperazioni().add(op);
                    callback.result(null);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
    
}
