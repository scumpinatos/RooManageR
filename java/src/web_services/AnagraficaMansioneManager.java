
package web_services;

import cache.lists.ListaOperazioni;
import cache.singular.AnagraficaMansioneTemp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.AnagraficaMansione;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import static web_services.HttpConnection.getResponse;


public class AnagraficaMansioneManager {
    
    public void addAnagraficaMansione(AnagraficaMansione input) {
        
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
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaMansione %s nella struttura %s NON aggiunta al database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaMansione %s nella struttura %s aggiunta al database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void updateAnagraficaMansione(AnagraficaMansione input) {
        
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
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaMansione %s nella struttura %s NON aggiornata nel database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaMansione %s nella struttura %s aggiornata nel database";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNomeStruttura());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readAnagraficaMansione(String cf, String nomeStruttura, String cfProprietario) {
        
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cf=%s&nomeStruttura=%s&cfProprietario=%s", 
                        ServerCodes.READ_ANAG_MANS, cf, nomeStruttura, cfProprietario));
                if (!(response.equals("NOT DONE"))) {
                    try {
                        AnagraficaMansioneTemp.setIstanza(new ObjectMapper().readValue(response, AnagraficaMansione.class));
                    } catch (IOException ex) {}
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void deleteAnagraficaMansione(String cf, String cfProprietario, String nomeStruttura) {
     
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cf=%s&nomeStruttura=%s&cfProprietario=%s", 
                        ServerCodes.DEL_ANAG_MANS, cf, nomeStruttura, cfProprietario));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaMansione %s NON rimossa dalla struttura %s e dal database";
                    op = String.format(op, cf, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaMansione %s rimossa dalla struttura %s e dal database";
                    op = String.format(op, cf, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
}
