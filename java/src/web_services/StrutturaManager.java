
package web_services;

import cache.lists.ListaAnagraficaStanza;
import cache.lists.ListaStruttura;
import cache.lists.ListaAnagrafica;
import cache.lists.ListaAnagraficaMansione;
import cache.lists.ListaOperazioni;
import cache.lists.ListaStanza;
import cache.singular.StrutturaTemp;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Struttura;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class StrutturaManager extends HttpConnection {

    public void addStruttura(Struttura input) {
        
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
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Struttura %s NON aggiunta al database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Struttura %s aggiunta al database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readStruttura(String nomeStruttura, String cfProprietario) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s", 
                        ServerCodes.READ_STR, nomeStruttura, cfProprietario));
                if (!(response.equals("NOT DONE"))) {
                    try {
                        StrutturaTemp.setIstanza(new ObjectMapper().readValue(response, Struttura.class));
                    } catch (IOException ex) {}
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void updateStruttura(Struttura input) {
        
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
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Struttura %s NON aggiornata nel database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Struttura %s aggiornata nel database";
                    op = String.format(op, input.getNome());
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void deleteStruttura(String cfProprietario, String nomeStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s", 
                        ServerCodes.DEL_STR, nomeStruttura, cfProprietario));
                System.out.println(response);
                if(response.equals("NOT DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Struttura %s NON rimossa dal database";
                    op = String.format(op, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                }
                if(response.equals("DONE")) {
                    String op = new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new GregorianCalendar().getTime()) 
                            + " Struttura %s rimossa dal database";
                    op = String.format(op, nomeStruttura);
                    ListaOperazioni.getListaOperazioni().add(op);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    
    // METODI INFORMAZIONI SULLA STRUTTURA
    public void readAllStruttureAnagrafica(String cfProprietario) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cfProprietario=%s", 
                        ServerCodes.READ_ALL_STRU, cfProprietario));
                try {
                    ListaStruttura.setIstanza(new ObjectMapper().readValue(response, ListaStruttura.class));
                } catch (IOException ex) {
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readAllAnagraficheStruttura(String cfProprietario, String nomeStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s", 
                        ServerCodes.READ_ALL_ANAG, cfProprietario, nomeStruttura));
                try {
                    ListaAnagrafica.setIstanza(new ObjectMapper().readValue(response, ListaAnagrafica.class));
                } catch (IOException ex) {
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readAllAnagraficaStanzaStruttura(String cfProprietario, String nomeStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s", 
                        ServerCodes.READ_ALL_ANAG_STA, cfProprietario, nomeStruttura));
                try {
                    ListaAnagraficaStanza.setIstanza(new ObjectMapper().readValue(response, ListaAnagraficaStanza.class));
                } catch (IOException ex) {
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readAllStanzeStruttura(String nomeStruttura, String cfProprietario) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                try {
                    String response = getResponse(String.format("opCode=%s&nomeStruttura=%s&cfProprietario=%s", 
                            ServerCodes.READ_ALL_STA, nomeStruttura, cfProprietario));
                    ListaStanza.setIstanza(new ObjectMapper().readValue(response, ListaStanza.class));
                } catch (IOException ex) {}
                
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
    
    public void readAllInCorso(String cfProprietario, String nomeStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s", 
                        ServerCodes.READ_ANAG_STA_CORSO, cfProprietario, nomeStruttura));
                try {
                    ListaAnagraficaStanza.setIstanza(new ObjectMapper().readValue(response, ListaAnagraficaStanza.class));
                } catch (IOException ex) {
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }

    }
    
    public void readAllAnagraficaMansioneStruttura(String cfProprietario, String nomeStruttura) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                
                String response = getResponse(String.format("opCode=%s&cfProprietario=%s&nomeStruttura=%s", 
                        ServerCodes.READ_ALL_ANAG_MANS, cfProprietario, nomeStruttura));
                try {
                    ListaAnagraficaMansione.setIstanza(new ObjectMapper().readValue(response, ListaAnagraficaMansione.class));
                } catch (IOException ex) {
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
}
