
package web_services;

import cache.lists.ListaOperazioni;
import cache.singular.VisitaTemp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Visita;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class VisitaManager extends HttpConnection {
    
    public void addVisita(Visita input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.INS_VIS, json));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Visita di %s nella stanza %s NON aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Visita di %s nella stanza %s aggiunta al database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void updateVisita(Visita input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }
                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.UPD_VIS, json));
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Visita di %s nella stanza %s NON aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Visita di %s nella stanza %s aggiornata nel database.";
                    op = String.format(op, input.getCodiceFiscaleAnagrafica(), input.getNumeroStanza());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void readVisita(Visita input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.READ_VIS, input.getNumeroStanza(),
                        input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
                if (!(response.equals("NOT DONE"))) {
                    try {
                        VisitaTemp.setIstanza(new ObjectMapper().readValue(response, Visita.class));
                    } catch (IOException ex) {}
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
    
    public void checkVisita(Visita input) {
        
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                String response = getResponse(String.format("opCode=%s&numeroStanza=%s&nomeStruttura=%s&cfProprietario=%s",
                        ServerCodes.CHECK_VIS, input.getNumeroStanza(),
                        input.getNomeStruttura(), input.getCodiceFiscaleProprietario()));
                if (!(response.equals("NOT DONE"))) {
                    try {
                        VisitaTemp.setIstanza(new ObjectMapper().readValue(response, Visita.class));
                    } catch (IOException ex) {}
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) {}
    }
}
