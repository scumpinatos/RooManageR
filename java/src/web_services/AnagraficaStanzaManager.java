
package web_services;

import cache.singular.AnagraficaStanzaTemp;
import cache.lists.ListaOperazioni;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.AnagraficaStanza;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class AnagraficaStanzaManager extends HttpConnection {
    
    public void addAnagraficaStanza(AnagraficaStanza input) {
        
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
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaStanza di %s nella stanza %s aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void updatePermanenza(AnagraficaStanza input) {
        
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
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaStanza di %s nella stanza %s aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void updateVisita(AnagraficaStanza input) {
        
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
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " AnagraficaStanza di %s nella stanza %s aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void readAnagraficaStanza(AnagraficaStanza input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.READ_ANAG_STA, input.getNumeroStanza(), 
                            input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
                    if (!(response.equals("NOT DONE"))) {
                        AnagraficaStanzaTemp.setIstanza(new ObjectMapper().readValue(response, AnagraficaStanza.class));
                    }
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void checkVisitaInCorso(AnagraficaStanza input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.CHECK_VIS, input.getNumeroStanza(), 
                            input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
                    if (!(response.equals("NOT DONE"))) {
                        AnagraficaStanzaTemp.setIstanza(new ObjectMapper().readValue(response, AnagraficaStanza.class));
                    }
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
}
