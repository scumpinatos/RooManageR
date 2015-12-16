
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

/**
 * Classe che si occupa di gestire la struttura
 * @author emanuelegargiulo
 */
public class StrutturaManager extends HttpConnection {

    /**
     * Metodo che si occupa di aggiungere una struttura al database remoto
     * @param input
     */
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
        
    }
    
    /**
     * Metodo che legge una struttura dal database remoto
     * @param nomeStruttura
     * @param cfProprietario
     */
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

    }
    
    /**
     * Metodo che agginge una struttura sul database remoto
     * @param input
     */
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

    }
    
    /**
     * Metodo che cancella la struttura dal database remoto
     * @param cfProprietario
     * @param nomeStruttura
     */
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

    }
    
    
    // METODI INFORMAZIONI SULLA STRUTTURA

    /**
     * Metodo che legge tutte le strutture relative a un proprietario dal database remoto
     * @param cfProprietario
     */
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
    }
    
    /**
     * Metodo che legge tutte le anagrafiche di una struttura dal database remoto
     * @param cfProprietario
     * @param nomeStruttura
     */
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
    }
    
    /**
     * Metodo che legge tutte le anagrafiche delle stanze di una struttura dal database remoto
     * @param cfProprietario
     * @param nomeStruttura
     */
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
    }
    
    /**
     * Metodo che si occupa di leggere tutte le stanze della struttura dal database remoto
     * @param nomeStruttura
     * @param cfProprietario
     */
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
    }
    
    /**
     * Metodo per leggere dal database remoto tutte le permanenze in corso nelle stanze di una struttura
     * @param cfProprietario
     * @param nomeStruttura
     */
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

    }
    
    /**
     * Metodo per leggere dal database remoto tutte le anagrafiche di una struttura a cui e' assegnata una mansione
     * @param cfProprietario
     * @param nomeStruttura
     */
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
    }
}
